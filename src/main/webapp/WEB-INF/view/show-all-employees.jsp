<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>All Employees</h2>
<br>
<br>
<table>
    <tr>
        <th> Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operation</th>
    </tr>
    <c:forEach var = "Emp" items = "${allEmp}">
        <c:url var="updateButton" value="updateInfo">
            <c:param name="empId" value="${Emp.id}"/>
        </c:url>
        <c:url var="deleteButton" value="deleteEmployee">
            <c:param name="empId" value="${Emp.id}"/>
        </c:url>
    <tr>
        <td>${Emp.name}</td>
        <td>${Emp.surname}</td>
        <td>${Emp.department}</td>
        <td>${Emp.salary}</td>
        <td>
            <input type="button" value="Update"
            onclick="window.location.href ='${updateButton}'">

            <input type="button" value="Delete"
            onclick="window.location.href = '${deleteButton}'">
        </td>
    </tr>
        </c:forEach>
</table>
<br>
<br>
<input type="button" value="Add"
     onclick="window.location.href ='addNewEmployee'"/>

</body>
</html>