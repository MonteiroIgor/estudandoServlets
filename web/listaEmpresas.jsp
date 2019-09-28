<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="model.Empresa" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: CONDUCTOR\igor.monteiro
  Date: 22/09/19
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Empresas Cadastradas</title>
</head>
<body>

<ul>
    <h3>Empresas: </h3>
    <%--JSTL--%>
    <c:forEach items="${empresas}" var="empresa">

    <li>Nome: ${empresa.nome}   ||   ID: ${empresa.id}   ||   Data Abertura: <fmt:formatDate value="${empresa.dataAbertura}"/></li>
    </c:forEach>
</ul>

<%--<ul>--%>
<%--    <%-SCRIPLETS-%>
<%--        List<Empresa> lista = (List<Empresa>) request.getAttribute("empresas");--%>
<%--        for (Empresa empresa : lista){--%>
<%--    %>--%>
<%--        <li><%= empresa.getNome()%></li>--%>
<%--    <%--%>
<%--        }--%>
<%--    %>--%>
<%--</ul>--%>

</body>
</html>
