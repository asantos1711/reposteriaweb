<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Postres</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
        <%--meta name="layout" content="main" #cbe8f5/--%>
            <title>Postres</title>	
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap" rel="stylesheet">
        <link href='https://fonts.googleapis.com/css?family=Lobster' rel='stylesheet'>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="/web/css/style.css">
    </head>    
    <style>        

    </style>
    <body style="background-color: #FFF">
        <%--img url="assets/images/images/inicio_quienes/logotipo_proyecto_web.png"--%>                        
        <div class="col-12 col-s-12 row">
            <center class="title">Dulce vida</center>
            <div class="col-1 col-s-1">
            </div>
            <div class="col-10 col-s-10 banner">
                <g:render template="/banner"/>     
                <g:if test="${flash.message}">
                    <div class="alert alert-success">${flash.message}</div>
                </g:if>
                <div class="col-12 col-s-12">
                    <div class="card">
                        <div class="row">
                            <div class="col-6 col-s-6">
                                <div class="row">
                                <g:each in="${listaFotos}" var="foto">  
                                    <div class="col-6 col-s-6">
                                        <img src="${foto.url}" class="foto_galeria" height="150">
                                    </div>
                                </g:each>
                                </div>
                            </div>
                            <div class="col-6 col-s-6">
                                <p class="pt">${producto.nombre}</p>
                                <p class="p">${producto.descripcion}</p>
                                <p class="p">
                                    ${producto.cantidad} ${producto.unidad} - $ ${producto.precio} MXN
                                </p>
                               
                                <btn  class="btn btn-info col-6 col-s-6 pb" >
                                    <g:link class="pb" action="agregaracarrito" params="[producto:producto.id]" >
                                    <i class="fa fa-cart-plus fa-2x">Agregar al carrito</i>
                                    </g:link>
                                </btn>
                            </div>
                        </div>
                    </div>

                </div>
                
             </div>
            
            <div class="col-1 col-s-1">
            </div>
        </div>
    </body>
    
    <g:render template="/footer"/>
</html>
