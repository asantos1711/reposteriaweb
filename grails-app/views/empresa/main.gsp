<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sample title</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
        <%--meta name="layout" content="main" #cbe8f5/--%>
            <title>Index</title>	
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap" rel="stylesheet">
        <link href='https://fonts.googleapis.com/css?family=Lobster' rel='stylesheet'>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    </head>
    <style>
        .banner{               
            text-align: center;
            margin-top:10px;                
        }
        .btn_banner{
          background-color: #FCD9C8;
          color: #000;
          padding:10px
        }
        .btn_footer{
          background-color: #FCD9C8;
          color: #000;
          padding:10px
        }
        .btn_banner:hover{
          background-color: #799AFA;
          color: #FFF;
          padding:10px
          font-family: Open-sans;
        }
        .title_banner{              
          font-family: 'Lobster';
          margin-top:50px;
          font-size: 65px;
        }
        .foto_home{
            height: 85%;
            margin-top: 19px;
            width:90%;
        }
         a{
            color: #000;
            text-decoration: none;
        }

    </style>
    <body style="background-color: #FFF">
        <%--img url="assets/images/images/inicio_quienes/logotipo_proyecto_web.png"--%>                        
        <div class="col-12 col-s-12 row">
            <div class="col-1 col-s-1">
            </div>
            <div class="col-10 col-s-10 banner">
                <div class="column">                        
                    <g:render template="/banner"/>
                </div>
                <div class="row">
                    <div class=" col-6 col-s-6">
                      <img src="${resource(dir: 'images', file: '/images/inicio_quienes/logo_sobre_nosotros_web.png')}"  class="img-rounded foto_home" id="imagen">
                    </div>
                    <div class=" col-6 col-s-6">
                        <div class="column">
                            <div class="title_banner">Sobre nosotros</div>
                            <div>
                                Somos una empresa que se dedica a la venta de deliciosos postres para el deleite de ustedes, nuestros comensales. Radicamos en la ciudad de Cancún, Quintana Roo. Les garantizamos un servicio de excelencia, calidad en nuestros productos y sobre todo quedará satisfecho, con ganas de repetir.
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
