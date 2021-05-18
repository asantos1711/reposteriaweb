<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuestra empresa</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
        <%--meta name="layout" content="main" #cbe8f5/--%>
            <title>Nuestra empresa</title>	
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap" rel="stylesheet">
        <link href='https://fonts.googleapis.com/css?family=Lobster' rel='stylesheet'>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
       <link rel="stylesheet" href="/web/css/style.css">
    </head>    
    <body style="background-color: #FFF">
        <%--img url="assets/images/images/inicio_quienes/logotipo_proyecto_web.png"--%>                        
        <div class="col-12 col-s-12 row">
            <center class="title">Dulce vida</center>
            <div class="col-1 col-s-1">
            </div>
            <div class="col-10 col-s-10 banner">
                <div class="column">                        
                    <g:render template="/banner"/>
                </div>
                <div class="row">
                    <div class="col-xs-6 col-sm-12 col-md-6 col-lg-6">
                      <img src="${resource(dir: 'images', file: 'inicio_quienes/logo_sobre_nosotros_web.png')}"  class="img-rounded foto_home" id="imagen">
                    </div>
                    <div class="col-xs-6 col-sm-12 col-md-6 col-lg-6">
                        <div class="column">
                            <div class="title_banner">Sobre nosotros</div>
                            <div>
                                Somos una empresa que se dedica a la venta de deliciosos postres para el deleite de ustedes, nuestros comensales. Radicamos en la ciudad de Cancún, Quintana Roo. Les garantizamos un servicio de excelencia, calidad en nuestros productos y sobre todo quedará satisfecho, con ganas de repetir.
                            </div>
                            
                            
                        </div>
                    </div>
                </div>
                <div class="row">                    
                    <div class="col-xs-6 col-sm-12 col-md-6 col-lg-6">
                        <div class="column">
                            <div class="title_banner">Nuestra historia</div>
                            <div>
                                <div>
                                Hace 2 años inauguramos este sitio con el objetivo de poner nuestro catálogo a tu alcance de forma fácil y segura. Nos hemos mantenido en constante evolución para ofrecerte una selección especial de productos de calidad y este año no podía ser la excepción.

                                Pensamos que los postres deben de endulzar la vida, así como hacerla más divertida, algo que te acompañe en aquellos momentos especiales que compartes, en familia, amigos, compañeros, etc. Creemos que disfrutar un postre debe estar alcance de todos.
                            </div>
                            </div>
                            
                            
                        </div>
                    </div>
                    
                    <div class="col-xs-6 col-sm-12 col-md-6 col-lg-6">
                      <img src="${resource(dir: 'images', file: 'inicio_quienes/dulce_vida.png')}"  class="img-rounded foto_home" id="imagen">
                    </div>
                </div>
            </div>
            <div class="col-1 col-s-1">
                </div>
        </div>
    </body>
    
    <g:render template="/footer"/>
</html>
