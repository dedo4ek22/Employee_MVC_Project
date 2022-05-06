package emp_main.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAdvice {
    @Around("execution(* emp_main.DAO.*.* (..))")
    private Object aroundAllDAOMethodAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Begin of " + methodSignature.getName());

        Object targetMethod = joinPoint.proceed();

        System.out.println("End of " + methodSignature.getName());

        return targetMethod;
    }
}
