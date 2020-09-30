<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<c:when test="${(fn:containsIgnoreCase('Hii this is harshu','HARShu'))}">
Yes the string is present
</c:when>
<c:otherwise>
No the string is present
</c:otherwise>
</c:choose>
<br>
-----------------------------------------------------------------------------
<br>
<c:choose>
<c:when test="${(fn:contains('Hii this is harshu','harshu'))}">
Yes the string is present
</c:when>
<c:otherwise>
No the string is present
</c:otherwise>
</c:choose>
<br>
--------------------------------------------------------------------------------
<br>
<c:set var="string" value="This is the me Harshu"/>  
${fn:substring(string, 7, 22)}  
<br>
----------------------------------------------------------------------------------
<br>
<c:set var="string" value="Hi This is my Srting"/>  
${fn:substringBefore(string, "my")}  
<br>
-----------------------------------------------------------------------------------
<br>
<c:set var="string" value="I am harshitha Yakkali"/>  
${fn:substringAfter(string, "harshitha")} 

<br>
------------------------------------------------------------------------------------------ 
<br>

<c:set var="String" value="Hiii all"/>
${fn:endsWith(String,"all")}
<br>

---------------------------------------------------------------------------------------
<br>
<c:set var="msg" value="Life the life you  love"/>  
${fn:startsWith(msg, 'life')}  
<br>
----------------------------------------------------------------------------------
<br>
<c:set var="str1" value="Love thed life u live      "/>  
 ${fn:length(str1)}
<br>
-------------------------------------------------------------------------------------
<br>
<c:set var="string" value="harshu"/>  
   ${fn:toUpperCase(string)} 
   <br>
--------------------------------------------------------------------------------------- 
<br>
<c:set var="string" value="HARSHU"/>  
${fn:toLowerCase(string)} 
<br>
----------------------------------------------------------------------------------------
<br>
<c:set var="a"  value="10.555"/>

<c:set var="string" value="10.5555"/>  
${fn:substring(string, 0, 4)} 
<br>
</body>
</html>