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
                    <a class="nav-link" href="#">Foros</a>
                </li>

            </ul>
        </div>
        <div class="nav-item dropdown blanco d-none d-sm-block d-md-block">
            <a class="nav-link dropdown-toggle" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fas fa-user fa-2x"></i></a>
            <div class="MenuDeUsuario dropdown-menu" aria-labelledby="dropdown01" x-placement="left-start">
                <a class="dropdown-item" href="perfil.jsp">Perfil</a>
                <a class="dropdown-item" href="login.jsp">Cerrar sesion</a>
            </div>
        </div>
    </nav>
    <section class="Ontologia">
        <div class="container">

            <div class="row">
                <div class="input-group">
                    <div class="input-group-prepend">
                        <button class="btn btn-success d-none d-sm-block d-md-block" type="button" data-toggle="modal" data-target="#Agregar"><i class="fas fa-plus"></i>

 Agregar</button>
                    </div>
                    <div class="input-group-prepend">
                        <button class="btn btn-success d-block d-sm-none d-md-none" type="button" data-toggle="modal" data-target="#Agregar"><i class="fas fa-plus"></i></button>
                    </div>
                    <input type="search" class="form-control" placeholder="Buscar ontología" aria-label="" aria-describedby="basic-addon1">
                    <div class="input-group-append d-none d-sm-block d-md-block">
                        <button class="btn btn-info" type="button"><i class="fas fa-search"></i> Buscar</button>
                    </div>
                    <div class="input-group-append d-block d-sm-none d-md-none">
                        <button class="btn btn-info" type="button"><i class="fas fa-search"></i></button>
                    </div>
                    
                    <div class="input-group-append d-block d-sm-none d-md-none">
                        <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fas fa-filter"></i></button>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="#">Álgebra</a>
                            <a class="dropdown-item" href="#">Trigonometría</a>
                            <a class="dropdown-item" href="#">Cálculo Diferencial</a>
                            <a class="dropdown-item" href="#">Cálculo Integral</a>
                            <a class="dropdown-item" href="#">Geometría</a>
                        </div>
                    </div>
                    <div class="input-group-append d-none d-sm-block d-md-block">
                        <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fas fa-filter"></i> Categoría</button>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="#">Álgebra</a>
                            <a class="dropdown-item" href="#">Trigonometría</a>
                            <a class="dropdown-item" href="#">Cálculo Diferencial</a>
                            <a class="dropdown-item" href="#">Cálculo Integral</a>
                            <a class="dropdown-item" href="#">Geometría</a>
                        </div>
                    </div>
                    <div class="input-group-append d-none d-sm-block d-md-block">
                        <button class="btn btn-dark" type="button"><i class="fas fa-cog"></i> Configuración</button>
                    </div>
                </div>

<div class="modal" id="Agregar" tabindex="-1" role="dialog" aria-labelledby="Agregar" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="AgregarTitulo">Añadir ontologia</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        ...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>




            </div>
            <div class="row">


                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src="images/ejemplo.png" alt="Expresion">
                    <div class="card-body">
                        <h5 class="card-title">Problema</h5>
                        <p class="card-text">Descripcion del problema.</p>
                        <a href="#" class="btn btn-primary">PDF</a>
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