<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

	<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Sistema de gentión de conocimiento matemático">
    <meta name="author" content="Dr. Yobani Martínez Ramírez">
    <!-- Color principal del sistema -->
    <meta name="theme-color" content="#004A9B" />
    <link rel="icon" href="#">

    <title>Sistema gestión de conocimiento matemático</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/estilo.css">
    <link href="css/fontawesome-all.min.css" rel="stylesheet" type="text/css">



    <!-- Custom styles for this template -->

    <style type="text/css">
        body {}

        .starter-template {
            padding: 3rem 1.5rem;
            text-align: center;
        }
    </style>
    <script defer src="js/fontawesome-all.js"></script>
</head>


<body>

    <nav class="navbar navbar-expand-md navbar-dark fixed-top text-center text-md-right nav nav-pills">
        <img class="LogoUAS offset-md-1" src="images/aguila_color.png">
        <a class="navbar-brand d-none d-sm-block d-sm-none" href="#">Sistema de gestión de conocimiento matemático</a>
        <a class="navbar-brand d-block d-sm-none" href="#">SGCM</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#barra" aria-controls="barra" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

        <div class="collapse navbar-collapse text-md-right" id="barra">
            <ul class="navbar-nav mr-auto nav-pills nav-fills">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Inicio <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="ontologias.html">Ontologías</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#">Foros</a>
                </li>
                <li class="nav-item dropdown blanco d-block d-sm-none d-md-none">
                    <a class="nav-link dropdown-toggle" id="dropdown02" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Usuario </a>
                    <div class="dropdown-menu" aria-labelledby="dropdown02">
                        <a class="dropdown-item" href="login.jsp">Inicio de sesión</a>
                        <a class="dropdown-item" href="registro.jsp">Registro</a>
                        <!--a class="dropdown-item" href="#">Something else here</a-->
                    </div>
                </li>

            </ul>
        </div>
        <div class="nav-item dropdown blanco d-none d-sm-block d-md-block">
            <a class="nav-link dropdown-toggle" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fas fa-user fa-2x"></i></a>
            <div class="MenuDeUsuario dropdown-menu" aria-labelledby="dropdown01">
                <a class="dropdown-item" href="login.jsp">Inicio de sesión</a>
                <a class="dropdown-item" href="registro.jsp">Registro</a>
                        <!--a class="dropdown-item" href="#">Something else here</a-->
            </div>
        </div>
    </nav>
    <section class="Inicio">
        <div class="container">
            <div class="row">

                <div class="alert alert-light col-12 text-center">Ingrese formula del problema matemático</div>

                <form action="resultado.jsp" method="post">
                    <div name="Formula1" class="col-12 col-md-6">
                    <input class="form-control form-control-lg" type="text" placeholder="f(x)=2^2" name="ecuacion1">

                    <div class="btn-toolbar" role="toolbar" aria-label="Toolbar with button groups">
                        <div class="btn-group" role="group" aria-label="First group">
                            <button type="button" class="btn btn-info">π</button>
                            <button type="button" class="btn btn-info">√</button>
                            <button type="button" class="btn btn-info">∫</button>
                            <button type="button" class="btn btn-info">λ</button>
                            <button type="button" class="btn btn-info">∃</button>
                        </div>
                        <div class="btn-group" role="group" aria-label="Second group">
                            <button type="button" class="btn btn-info">∑</button>
                            <button type="button" class="btn btn-info">Δ</button>
                            <button type="button" class="btn btn-info">μ</button>
                            <button type="button" class="btn btn-info">x²</button>
                            <button type="button" class="btn btn-info">ƒ</button>
                        </div>

                    </div>
                </div>
                <div name="Formula2" class="col-12 col-md-6">
                    <input class="form-control form-control-lg" type="text" placeholder="Opcional" name="ecuacion2">

                    <div class="btn-toolbar" role="toolbar" aria-label="Grupo de botones">
                        <div class="btn-group" role="group" aria-label="First group">
                            <button type="button" class="btn btn-info">π</button>
                            <button type="button" class="btn btn-info">√</button>
                            <button type="button" class="btn btn-info">∫</button>
                            <button type="button" class="btn btn-info">λ</button>
                            <button type="button" class="btn btn-info">∃</button>
                        </div>
                        <div class="btn-group" role="group" aria-label="Grupo2 de botones">
                            <button type="button" class="btn btn-info">∑</button>
                            <button type="button" class="btn btn-info">Δ</button>
                            <button type="button" class="btn btn-info">μ</button>
                            <button type="button" class="btn btn-info">x²</button>
                            <button type="button" class="btn btn-info">ƒ</button>
                        </div>

                    </div>
                </div>
                <button type="submit" class="btn btn-primary col-4 offset-8">Buscar</button>
                </form>

            </div>
        </div>
    </section>
    <!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/jquery-3.2.1.min.js "></script>
    <script src="js/popper.min.js "></script>
    <script src="js/bootstrap.min.js "></script>

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script>
        (function() {
            'use strict'

            if (navigator.userAgent.match(/IEMobile\/10\.0/)) {
                var msViewportStyle = document.createElement('style')
                msViewportStyle.appendChild(
                    document.createTextNode(
                        '@-ms-viewport{width:auto!important}'
                    )
                )
                document.head.appendChild(msViewportStyle)
            }

        }())
    </script>

</body>

</html>
	