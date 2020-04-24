<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>

    <title> Conferencia Mundial</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/body.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/rodape.css">

</head>
<body>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light static-top mb-5 shadow">
        <div class="container">

            <a class="navbar-brand" href=""> Conferencia Mundial </a>

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

                        <a class="nav-link" href="#">Serviços</a>

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

                <h1 class="font-weight-light"> Olá, por onde vamos começar? </h1>

                <p class="lead"> </p>

                <p class="lead"> Escolha uma das opções abaixo. </p>

                <form>

                    <div class="card-deck">

                        <div class="card">
                            <img class="card-img-top" src="assets/cadastrar_usuario1.png" alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Cadastro de Participante</h5>
                                <p class="card-text">Escolha essa opção para ter acesso de participante ao noso
                                    sistema.</p>
                                <a href="${pageContext.request.contextPath}/participante/form" class="btn btn-primary">Visitar</a>
                            </div>
                            <div class="none">
                            </div>
                        </div>

                        <div class="card">
                            <img class="card-img-top" src="assets/cadastrar_palestrante.png"
                                 alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Cadastro de Palestrante</h5>
                                <p class="card-text">Escolha essa opção para ter acesso de palestrante no nosso sistema.
                                </p>
                                <a href="" class="btn btn-primary">Visitar</a>
                            </div>
                            <div class="none">
                            </div>
                        </div>

                        <div class="card">
                            <img class="card-img-top" src="assets/cadastrar_palestra.png" alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Cadastro de Palestra</h5>
                                <p class="card-text">Escolha essa opção para poder cadastrar sua palestra no nosso sistema.</p>
                                <a href="" class="btn btn-primary">Visitar</a>
                            </div>
                        </div>

                    </div>

                    <div class="card-body">
                        <h5 class="card-title">Adicionar um palestrante a uma palestra existente</h5>
                        <p class="card-text">Opção encarregada para adicionar um palestrante a uma palestra existente.
                        </p>
                        <a href="" class="btn btn-primary">Visitar</a>
                    </div>

                    <div class="card">
                    </div>

                    <div class="card-body">
                        <h5 class="card-title">Adicionar um participante a uma palestra existente</h5>
                        <p class="card-text">Opção encarregada para adicionar um palestrante a uma palestra existente.
                        </p>
                        <a href="" class="btn btn-primary">Visitar</a>
                    </div>

                    <div class="card">
                    </div>

                    <div class="card-body">
                        <h5 class="card-title">Lista de participantes cadastrados</h5>
                        <p class="card-text">Selecione esta opção para ver todos os participantes cadastrados no
                            sistema.</p>
                        <a href="${pageContext.request.contextPath}/participante/lista" class="btn btn-primary">Visitar</a>
                    </div>

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
