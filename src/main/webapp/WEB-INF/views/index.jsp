<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title><spring:message code="app.title"/></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    <div class="langSwitch">
        <a class="langSwitch-item" href="?lang=english"><spring:message code="app.lang.english"/></a>
        <a class="langSwitch-item" href="?lang=russian"><spring:message code="app.lang.russian"/></a>
    </div>

    <ul>
    <c:forEach items="${words}" var="word">
        <c:set var="wordVar">
            <spring:message code="app.lang.words.${word}"/>
        </c:set>
        <li>${wordVar}</li>
    </c:forEach>
    </ul>

</body>
</html>