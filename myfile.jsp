<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:choose>
<c:when test="${(fn:contains('this is java','JAVA'))}">
Yes the string is present
</c:when>
<c:otherwise>
No the string is present
</c:otherwise>
</c:choose>


<br>
Contains ignore case
<br>

<c:choose>
<c:when test="${(fn:containsIgnoreCase('this is java','JAVA'))}">
Yes the string is present
</c:when>
<c:otherwise>
No the string is present
</c:otherwise>
</c:choose>

<br>
------------------------------------------------------------------------------------
<br>






<c:out value="${'hello welcome to jstl world'}"/>

<c:set var="age" scope="session" value="26"/>

<c:if test="${age > 15}">
age is more than 15
</c:if>
<br>


<!--<c:out value="${age}"/>

<c:out value="${age}"/>

<c:out value="${age}"/>

<c:out value="${age}"/>

<c:out value="${'remove age'}"/>

<c:remove var="age"/>

<c:out value="${age}"/>
<br>--->
----------------------------------
<br>
<br>
Below is the result of the age chosen
<br>
<c:choose>

<c:when test="${age > 20}"> age is greater than 20 </c:when>

<c:when test="${age > 25}"> age is greater than 25 </c:when>

<c:otherwise> else less than or equal to  20 </c:otherwise>

</c:choose>
<br>
--------------------------------------------------------------------
<br>



<c:forEach var="i" begin="1" end="10">
<c:out  value="${i}"/> <br>
</c:forEach>
<br>
-------------------------------------------------------------------------
<br>
names from servlet are as follows

<c:forEach var="name" items="${studList}">
 <c:out  value="${name}"/> <br>
</c:forEach>
<br>
--------------------------------------------------------------------
<br>


<c:forEach var="name" items="${playerList}" varStatus="loopCounter" ><br>

  <c:out value=" ${loopCounter.count}"/>
    <c:out value="${name}"/>
 
</c:forEach>
<br>
 
 ------------------------------------------------------------------------



</body>
</html>
