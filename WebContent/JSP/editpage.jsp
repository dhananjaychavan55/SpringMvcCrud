<%@page import="com.cjc.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <%Student s=(Student)request.getAttribute("data");%>

<form action="updateStudent">
     <h1>Success Page.......</h1>
       <table border="1">
       <thead>
       <tr>
       <th>Rollno</th>
       <th>Name</th>
       <th>Uname</th>
       <th>Pass</th>
       <th>MobileNo</th>
       </tr>
       </thead>
        <tbody>
         <tr>
          <td><input type="text" name="rolllno" value="<%=s.getRolllno()%>" hidden="true"></td>
          <td><input type="text" name="name" value="<%=s.getName()%>"></td>
          <td><input type="text" name="uname" value="<%=s.getUname()%>"></td>
          <td><input type="text" name="pass" value="<%=s.getPass()%>"></td>
          <td><input type="text" name="mobileno" value="<%=s.getMobileno()%>"></td>
         </tr>       
        </tbody>
       </table>
        <input type="submit" value="Update">&nbsp;
       </form>
</body>
</html>