<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>dept list</title>
</head>
<body>
<h2>Dept List</h2>
<ul>
<c:forEach var="dept" items="${depts}">
<li>${dept.id},${dept.name}</li>
</c:forEach>
</ul>
</body>
</html>