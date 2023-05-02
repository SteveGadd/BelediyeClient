<%@ page import="com.example.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<%
    EDevletBelediyeService service = new EDevletBelediyeService();
    BelediyePortType port = service.getBelediyePortTypeBindingPort();
    SokakCaddeSorgulamaGType query = new SokakCaddeSorgulamaGType();
    query.setMahalleKodu("10000");
    String result = port.sokakCaddeSorgula(query).getBelediyeKodu()+"\n"+port.sokakCaddeSorgula(query).getSonucKodu();
%>
<%=result%>
</body>
</html>