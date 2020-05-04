<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Cadastro de Usuário</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/body.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/rodape.css">

    <%

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

                <h1 class="font-weight-light">Cadastro de Participante</h1>
                <p class="lead"> </p>
                <p class="lead">Entre com os dados abaixo</p>

                <form method="post" action="${pageContext.request.contextPath}/participante/adiciona">

                    <div class="form-group">
                        <label for="nome">Nome</label>
                        <input type="text" class="form-control" id="nome" name="nome">
                    </div>

                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" id="email" name="email">
                    </div>

                    <div class="form-group">
                        <label for="cpf">Cpf</label>
                        <input type="number" class="form-control" id="cpf" name="cpf">
                    </div>

                    <div class="form-group">
                        <label for="endereco">Endereço</label>
                        <input type="text" class="form-control" id="endereco" name="endereco">
                    </div>

                    <div class="form-group">
                        <label for="telefone">Telefone</label>
                        <input type="tel" class="form-control" id="telefone" name="telefone">
                    </div>

                    <button type="submit" class="btn btn-primary">Enviar</button>

                </form>
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
