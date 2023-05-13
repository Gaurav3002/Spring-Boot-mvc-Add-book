<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Add Book Here</h3>
<font color='green'>${msg}</font>
<font color='red'>${failmsg}</font>

<form:form action="save?bid=${book.bookId}" method = "POST" modelAttribute = "book" >
<table>
<tr>
<%-- <td> Book Id : </td>
<td> <form:input path = "bookId"/></td>
</tr>
--%>
<tr>
<td>Book Name : </td>
<td><form:input path="bookName"/></td>
</tr>
<tr>
<td>Book Price : </td>
<td><form:input path = "bookPrice"/></td>
</tr>

<tr>
<td>Author Name : </td>
<td><form:input path="authorName"/></td>
</tr>
<tr>
<td></td>
<td><input type = "submit" value = "Submit"></td>
</tr>


</table>

<a href = "view">view Books</a>
</form:form>

</body>
</html>