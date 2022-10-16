<%--
  Created by IntelliJ IDEA.
  User: 14741
  Date: 2022/10/16
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>code</title>
</head>
<body>
<h3>管道_过滤软件体系结构</h3>
代码使用的是文献的代码，只是对Main方法稍加修改，将：<br>
静态的main方法
改为了：<br>
<strong>public void run(String text) throws IOException</strong><br>
并增加生成input文件的操作，其他并无改变。<br>
//创建input文件<br>
File file = new File("E:\\input.txt");<br>
if(!file.exists()){<br>
file.createNewFile();<br>
}<br>
FileWriter writer = new FileWriter(file);<br>
writer.write(text);<br>
writer.flush();<br>
writer.close();<br>
<br><br>
<a href="../two.jsp">返回</a>
</body>
</html>
