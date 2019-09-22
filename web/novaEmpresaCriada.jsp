<%--
  Created by IntelliJ IDEA.
  User: CONDUCTOR\igor.monteiro
  Date: 22/09/19
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nova Empresa Criada</title>
</head>
<body>

<div>

    <%String empresa = (String) request.getAttribute("empresa");%>
    <p><strong style="color: blue"><%=empresa%>, Cadastrada com Sucesso</strong></p>

</div>

</body>
</html>
