<%--
  Created by IntelliJ IDEA.
  User: 14741
  Date: 2022/10/16
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>code</title>
</head>
<body>
<h3>主程序-子程序软件体系结构</h3>
代码与文献基本一致，不过将其静态main()方法改为了run()方法方便调度。<br><br>
public void run(String text) throws IOException {<br>
<br>
//若没有，则创建input文件<br>
File file = new File("E:\\input.txt");<br>
if(!file.exists()){<br>
file.createNewFile();<br>
}<br>
FileWriter writer = new FileWriter(file);<br>
writer.write(text);<br>
writer.flush();<br>
writer.close();<br>
<br>
Demo1 kwic = new Demo1();<br>
kwic.input("E:\\input.txt");<br>
kwic.shift();<br>
kwic.alphabetizer();<br>
kwic.output("E:\\output.txt");<br>
}
<br><br>
<a href="../one.jsp">返回</a>
</body>
</html>
