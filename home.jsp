<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
</head>
<body>
<h1>
Hello Author PLz Provide ur Details!  
</h1>
<form action="display">

Name:<input type="text" name="authorName">
<br>
<br>
Id:<input type="text" name="authorId">
<br>
<br>
City: <input type="text" name="city">
<br>
<br>
<input type="submit" name="save author">
<br>
</form>


<form   action="search">

Enter name to search by name: <input type="text" name="authorName">
<br>
<br>
<input type="submit">
</form>
<form action="search2">
Enter name to search by city: <input type="text" name="city">
<br>
<br>
<input type="submit">
</form>

<form action="delete">
Enter name to delete by name: <input type="text" name="authorName">
<br>
<br>
<input type="submit">
</form>

</body>
</html>
