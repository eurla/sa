<%--
  Created by IntelliJ IDEA.
  User: 14741
  Date: 2022/10/16
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>KWIC</title>
</head>
<body>
<h1>KWIC软件体系结构实现方法：</h1>
<h4>管道_过滤软件体系结构</h4>
<form action="${pageContext.request.contextPath}/two.action">
    请输入文本:
    <br>
    <textarea name="text" cols="50" rows="10"></textarea><br>
    <input type="submit" value="确定"  name="submit" />
    <input type="reset" value="重置"  name="reset" />
</form><br><br><br>

<a href="index.jsp">返回首页</a>
</body>
</html>
