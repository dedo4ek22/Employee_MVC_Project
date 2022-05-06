<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Employee info</h2>
<br>
<br>
<form:form action="saveEmployee" modelAttribute="employee">
    <form:hidden path="id"/>
    Name<form:input path="name"></form:input>
    <br><br>
    Surname<form:input path="surname"></form:input>
    <br><br>
    Department<form:input path="department"></form:input>
    <br><br>
    Salary <form:input path="salary"></form:input>
    <br><br>
    <input type="submit" value="Ok">
</form:form>
</body>
</html>