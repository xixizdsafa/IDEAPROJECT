<%@ page import="bean.News" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: jay chen
  Date: 2016/9/16
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script language="Javascript"></script>
    <meta charset="utf-8">
    <title>体育健身</title>
    <link rel="stylesheet" href="../css/fit.css"
          type="text/css"/>
</head>
<body>
<div id="rightDiv" >
    <ul>
        <h1>健身好文</h1>
        <%
            List<News> list= (List<News>) request.getAttribute("list");
            for(News n:list){
        %>
          <li><span><a href="news/<%=n.getSrc()%>"><%=n.getTitle()%></a></span></li>
        <%
            }
        %>
    </ul>

</div>
</body>
</html>
