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
    <link rel="icon" href="">

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
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Inicio <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Ontologías</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#">Foros</a>
                </li>

            </ul>
        </div>
        <div class="nav-item dropdown blanco d-none d-sm-block d-md-block">
            <a class="nav-link dropdown-toggle" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fas fa-user fa-2x"></i></a>
            <div class="MenuDeUsuario dropdown-menu" aria-labelledby="dropdown01" x-placement="left-start">
                <a class="dropdown-item" href="login.jsp">Inicio de sesión</a>
                <!--a class="dropdown-item" href="#">Another action</a>
                        <a class="dropdown-item" href="#">Something else here</a-->
            </div>
        </div>
    </nav>
    <section class="Login">
        <div class="container">
            <div class="row">


                <div class="wrapper col">
                    <form class="form-signin form-group" action="Login" method="POST" id="formLogin">
                        <h2 class="form-signin-heading text-secundary">Acceder al sistema</h2>
                        <!--p class="alert alert-danger" *ngIf="!funco">Usuario o contraseña son incorrectos, intentelo nuevamente.</p-->

                        <div class="input-group mb-2 col-12">
                            <div class="input-group-prepend">
                                <div class="input-group-text"><i class="fas fa-user-circle"></i></div>
                            </div>
                            <input type="text" class="form-control" name="email" placeholder="Email" id="txtemail">
                        </div>
                        <div class="input-group mb-2 col-12">
                            <div class="input-group-prepend">
                                <div class="input-group-text"><i class="fa fa-unlock-alt"></i></div>
                            </div>
                            <input type="password" class="form-control" name="pass" placeholder="Contraseña" id="txtpass">
                        </div>

                        <button type="button" class="btn btn-link" data-toggle="modal" data-target="#password">
  Restablecer contraseña
</button>
                        <a class="btn btn-link" href="registro.jsp">
  Registro
</a>

                        <button class="btn btn-lg btn-success" type="submit" id="ingresar">Ingresar</button>
                    </form>
                </div>

                <div class="modal fade" id="password" tabindex="-1 " role="dialog " aria-labelledby="password" aria-hidden="true ">
                    <div class="modal-dialog modal-dialog-centered" role="document ">
                        <div class="modal-content text-secundary">
                            <div class="modal-header ">
                                <h5 class="modal-title" id="password ">Recuperar contraseña</h5>
                                <button type="button" class="close " data-dismiss="modal " aria-label="Close">
          <span aria-hidden="true ">&times;</span>
        </button>
                            </div>
                            <div class="modal-body form-group ">
                                <span>Introduzca su correo electronico para restablecer su contraseña:</span>
                                <div class="input-group mb-2 col-12">
                                    <div class="input-group-prepend">
                                        <div class="input-group-text"><i class="fas fa-user-circle"></i></div>
                                    </div>
                                    <input type="text" class="form-control" id="inlineFormInputGroup" placeholder="Email">
                                </div>

                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-outline-primary">Enviar</button>
                            </div>
                        </div>
                    </div>
                </div>
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