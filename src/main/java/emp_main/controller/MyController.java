package emp_main.controller;

import emp_main.DAO.EmployeeDAO;
import emp_main.entity.Employee;
import emp_main.service.EmployeeService;
import emp_main.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/")
    private String showAllEmployees(Model model){
        List<Employee> allEmployee = employeeService.getAllEmployee();
        model.addAttribute("allEmp",allEmployee);
        return "show-all-employees";
    }
    @RequestMapping("/addNewEmployee")
    private String addNewEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "employee-info";
    }
    @RequestMapping("/saveEmployee")
    private String saveEmployee(@ModelAttribute("employee")Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }
    @RequestMapping("/updateInfo")
    private String updateEmployee(@RequestParam("empId") int id, Model model){
       Employee employee = employeeService.getEmployee(id);
       model.addAttribute("employee",employee);
        return "employee-info";
    }
    @RequestMapping("/deleteEmployee")
    private String deleteEmployee(@RequestParam("empId") int id){
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }
}
