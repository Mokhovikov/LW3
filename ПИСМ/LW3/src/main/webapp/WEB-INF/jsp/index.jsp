
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="crt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>

<html xmlns:th="http://www.thymeleaf.org" lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <style>
        <%@include file="index.css"%>
    </style>

    <script type="text/javascript">
        <%@include file="typing.js"%>
    </script>


</head>
<body >

<div class="container">

        <div class="text-main">
            <div id="demo" class="text">
                <pre></pre>
            </div>
        </div>
        <div class="button-main">
            <form action="<c:url value="/login"/>">
                <input id="button" class="button" type="submit" name="GO" value="GO" >
            </form>
        </div>
</div>






</body>
</html>