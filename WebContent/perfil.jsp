<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
    HttpSession objsesion = request.getSession(false);
    String email = (String)objsesion.getAttribute("email");
    if(email.equals("")) {
        response.sendRedirect("login.jsp");
    }

%>
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
                    <a class="nav-link" href="#">Foros</a>
                </li>

            </ul>
        </div>
        <div class="nav-item dropdown blanco d-none d-sm-block d-md-block">
            <a class="nav-link dropdown-toggle" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fas fa-user fa-2x"></i> <% out.println(email); %></a>
            <div class="MenuDeUsuario dropdown-menu" aria-labelledby="dropdown01" x-placement="left-start">
                <a class="dropdown-item" href="perfil.jsp">Perfil</a>
                <a class="dropdown-item" href="login.jsp">Cerrar sesion</a>
            </div>
        </div>
    </nav>
    <section class="Perfil">
        <div class="container">

            <div class="row">
                <div class="col col-12 offset-lg-3 d-flex align-items-center">
                    <div class="Imagen col col-4 col-md-3 col-lg-2">
                        <img src="" alt="Sin imagen">

                    </div>
                    <div class="col-2 ">
                        <input class="btn btn-info" type="file"></input>
                    </div>

                </div>
                <div class="col col-md-6 col-lg-4 offset-md-3 offset-lg-4">
                    <form>
                        <div class="form-group">
                            <label for="">Nombre (s)</label>
                            <input type="text" class="form-control" id="EditarPefil" placeholder="">
                        </div>
                        <div class="form-group">
                            <label for="">Apellidos</label>
                            <input type="text" class="form-control" id="EditarPefil" placeholder="">
                        </div>
                        <div class="form-group">
                            <label for="">Unidad académica</label>
                            <input type="text" class="form-control" id="EditarPefil" placeholder="">
                        </div>
                        <div class="form-group">
                            <label for="">Fecha de nacimiento</label>
                            <input type="date" class="form-control" id="EditarPefil" placeholder="">
                        </div>

                        <div class="custom-control custom-radio">
                            <input type="radio" id="" name="customRadio" class="custom-control-input" checked>
                            <label class="custom-control-label" for="">Masculino</label>
                        </div>
                        <div class="custom-control custom-radio">
                            <input type="radio" id="" name="customRadio" class="custom-control-input">
                            <label class="custom-control-label" for="">Femenino</label>
                        </div>

                        <div class="form-group">
                            <label for="">Correo electrónico actual</label>
                            <input type="email" class="form-control" id="EditarPefil" placeholder="">
                        </div>
                        <div class="form-group">
                            <label for="">Correo electrónico nuevo</label>
                            <input type="email" class="form-control" id="EditarPefil" placeholder="">
                        </div>
                        <div class="form-group">
                            <label for="">Contraseña actual</label>
                            <input type="password" class="form-control" id="EditarPefil" placeholder="">
                        </div>
                        <div class="form-group">
                            <label for="">Contraseña nueva</label>
                            <input type="password" class="form-control" id="EditarPefil" placeholder="">
                        </div>
                        <div class="form-group">
                            <label for="">Repetir contraseña</label>
                            <input type="password" class="form-control" id="EditarPefil" placeholder="">
                        </div>
                        <button class="btn btn-primary">Guardar</button>
                    </form>
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