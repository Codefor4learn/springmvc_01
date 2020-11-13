<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第二个springmvc项目</title>
</head>
<body>
<body>
    <h1>第一个springmvc项目</h1>
    <p><a href="my/some.do">发起some.do请求</a></p>
    <p><a href="my/other.do">发起other.do请求(GET方式)</a></p>
    <form action="my/other.do" method="post">
        <input type="submit" value="发起other.do请求(POST方式)">
    </form>
    逐个接收参数：
    <form action="my/testParam.do" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交参数">
    </form>
    对象接收参数：
    <form action="my/testParam2.do" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交参数">
    </form>
</body>
</body>
</html>
