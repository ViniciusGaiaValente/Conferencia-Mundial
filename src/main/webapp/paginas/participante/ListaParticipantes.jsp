<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="models.domain.Participante" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

    <title>Lista de Participantes</title>

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/body.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/rodape.css">

    <%
        ArrayList<Participante> participantes;

        try {
            participantes = (ArrayList<Participante>) request.getAttribute("participantes");
            pageContext.setAttribute("participantes", participantes);
        } catch (Exception e) {
            out.print("<h1>" + e.getMessage() + "</h1>");
        }
    %>
</head>
<body>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light static-top mb-5 shadow">
        <div class="container">

            <a class="navbar-brand" href="">Conferencia Mundial</a>

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive"
                    aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">

                <span class="navbar-toggler-icon"></span>

            </button>

            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ml-auto">

                    <li class="nav-item active">

                        <a class="nav-link" href="#"> Início </a>

                    </li>

                    <li class="nav-item">

                        <a class="nav-link" href="#"> Sobre </a>

                    </li>

                    <li class="nav-item">

                        <a class="nav-link" href="#"> Serviços </a>

                    </li>

                    <li class="nav-item">

                        <a class="nav-link" href="#"> Contato </a>

                    </li>

                </ul>
            </div>

        </div>
    </nav>

    <!-- Page Content -->
    <div class="container">
        <div class="card border-0 shadow my-5">
            <div class="card-body p-5">
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Nome</th>
                            <th scope="col">Email</th>
                            <th scope="col">CPF</th>
                            <th scope="col">Endereço</th>
                            <th scope="col">Telefone</th>
                        </tr>
                    </thead>
                    <tbody>

                        <c:forEach items="${participantes}" var="participante">

                            <tr>

                                <td>

                                    <c:out value="${participante.id}"/>

                                </td>

                                <td>

                                    <c:out value="${participante.nome}"/>

                                </td>

                                <td>

                                    <c:out value="${participante.email}"/>

                                </td>

                                <td>

                                    <c:out value="${participante.cpf}"/>

                                </td>

                                <td>

                                    <c:out value="${participante.endereco}"/>

                                </td>

                                <td>

                                    <c:out value="${participante.telefone}"/>

                                </td>

                                <td>

                                    <form>
                                        <button type="submit" class="btn btn-primary">
                                            Editar
                                        </button>
                                    </form>

                                </td>

                                <td>

                                    <form method="post" action="${pageContext.request.contextPath}/participante/excluir">
                                        <input type="text" name="idParticipante" value="${participante.id}" style="display: none"/>
                                        <button type="submit" class="btn btn-danger">
                                            Excluir
                                        </button>
                                    </form>

                                </td>

                            </tr>

                        </c:forEach>

                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <!-- Footer -->
    <footer id="myFooter">
        <div class="container">
            <ul>
                <li>
                    <a href="">Home
                    </a>
                </li>
                <li>
                    <a href="">Sobre
                    </a>
                </li>
            </ul>
            <p><a href="" class="footer-copyright">© 2019 Copyright - Mikhael Kosminsky</p>
        </div>
        <div class="footer-social">
            <a href="" class="social-icons">
                <i class="fa fa-facebook">
                </i>
            </a>
            <a href="" class="social-icons">
                <i class="fa fa-instagram">
                </i>
            </a>
            <a href="" class="social-icons">
                <i class="fa fa-youtube">
                </i>
            </a>
            <a href="" class="social-icons">
                <i class="fa fa-twitter">
                </i>
            </a>
        </div>
    </footer>

</body>
</html>
