<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Erro</title>
</head>
<body>
    <%
        try {
            int status;
            status = (int) request.getAttribute("status");

            if (status < 600 && status > 99) {
                out.println("<h1>" + status + "</h1>");
            }

            String erro;
            erro = (String) request.getAttribute("mensagem");

            if (erro == null || erro.equals("")) {
                out.println("<h2> Erro inesperado </h2>");
            } else {
                out.println("<h2>" + erro + "</h2>");
            }

        } catch (Exception e) {
            out.println("<h1> 500 </h1>");
            out.println("<h2> Exceção lancada ao tentar exibir mensagem de erro </h2>");
            out.println("<h2>" + e.getMessage() + "</h2>");
        }
    %>
</body>
</html>
