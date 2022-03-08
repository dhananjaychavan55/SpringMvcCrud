<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 --%>
<%@page import="com.cjc.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<script type="text/javascript">
function deleteStudent()
{
	//alert("hii");
     alert("Delete")
	document.f1.action="delete";
	document.f1.submit();
}
function editStudent() {
	
	document.f1.action="edit";
	document.f1.submit();
}
function addStudent() {
	document.f1.action="add";
	document.f1.submit();
}
</script>
<body>
     <%List<Student> stuList=(List<Student>)request.getAttribute("data");%>

<form name="f1">
     <h1>Success Page.......</h1>
       <table border="1">
       <thead>
       <tr>
       <td>Select</td>
       <th>Rollno</th>
       <th>Name</th>
       <th>Uname</th>
       <th>Pass</th>
       <th>MobileNo</th>
       </tr>
       </thead>
        <tbody>
          <%for(Student stu: stuList) {%>
         <tr>
         <td><input type="radio" name="rollno" value="<%= stu.getRolllno()%>">
          <td><%=stu.getRolllno()%></td>
          <td><%=stu.getName()%></td>
          <td><%=stu.getUname()%></td>
          <td><%=stu.getPass()%></td>
          <td><%=stu.getMobileno()%></td>
         </tr>       
          <% }%>
        </tbody>
       </table>
        <input type="button" value="Delete" onclick="deleteStudent()">&nbsp;
       <input type="button" value="Edit" onclick="editStudent()">&nbsp;
       <input type="button" value="Add" onclick="addStudent()">
       </form>
</body>
</html>