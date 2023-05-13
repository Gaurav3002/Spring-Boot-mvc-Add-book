<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c"
  uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script>
function confirmDelete(){
	return confirm('Are you want to delete?');
}
</script>
</head>
<body>
<font color='green'>${msg}</font>

<a href = "load">+Add book</a>
<table>
<thead>

<tr>
<td>Book Id : </td>
<td>Book Name : </td>
<td>Book Price : </td>
<td>Author Name : </td>
<td>Action </td>
</tr>
</thead>

<tbody>
<c:forEach items = "${jook}" var = "b">	
<tr>
<td>${b.bookId}</td>
<td>${b.bookName}</td>
<td>${b.bookPrice}</td>
<td>${b.authorName}</td>
<td>
<a href = "editBook?bid=${b.bookId}">Edit</a>
<a href = "delete?bid=${b.bookId}" onclick="return confirmDelete()">Delete</a>
</td>

</tr>

</c:forEach>


</tbody>

</table>

</body>
</html>