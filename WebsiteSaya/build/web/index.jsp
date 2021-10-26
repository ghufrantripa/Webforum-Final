<%-- 
    Document   : index
    Created on : Jul 8, 2021, 5:16:49 PM
    Author     : Ghufran Tripa
--%>

<%@page import="java.sql.Connection"%>
<%@page import="Config.DbKoneksi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    DbKoneksi db=new DbKoneksi();
    Connection con=db.open();
%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/views/layout/head.jsp">
            <jsp:param name="title" value="Hello World"></jsp:param>
        </jsp:include>
    </head>
    <body>
        <jsp:include page="/views/layout/navbar.jsp"></jsp:include>
        <h1>Hello World! You are in JSP Page, Guys! </h1>
        
        <jsp:include page="/views/layout/footer.jsp"></jsp:include>
        </div>
        <jsp:include page="/views/layout/script.jsp"></jsp:include>
    </body>
</html>