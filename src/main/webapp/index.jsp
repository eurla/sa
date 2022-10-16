<%--
  Created by IntelliJ IDEA.
  User: 14741
  Date: 2022/10/16
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>软件体系结构</title>
</head>
<body>
<h1>KWIC软件体系结构实现方法：</h1>
<form method="post" action="${pageContext.request.contextPath}/select.action">
    <input type="radio" name="num" value="1">主程序_子程序软件体系结构<br>
    <input type="radio" name="num" value="2">管道_过滤软件体系结构<br>
    <input type="radio" name="num" value="3">观察者模式软件体系结构<br>
    <input type="radio" name="num" value="4">面向对象软件体系结构<br>
    <input type="submit" value="确定">
</form>
</body>
</html>
