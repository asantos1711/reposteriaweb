
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dulce vida</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
        <%--meta name="layout" content="main" #cbe8f5/--%>
            <title>Dulce vida - Registro</title>	
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
                <div class="row ">
                    <g:if test="${flash.message}">
                        <div class="alert alert-danger">${flash.message}</div>
                    </g:if>
                    <div class=" col-6 col-s-6">
                        <div class="column">
                            <div class="title_banner">Registro</div>
                            <div>
                                <g:form controller="Usuarios" action="registrar" method="post">
                                    <div style="margin-top:10px">
                                        <%--label>Nombre completo </label>
                                        <g:field  name="name"/><br/--%>
                                        <div style="margin-top:10px">
                                            <%--label>Correo: </label>
                                            <g:field  name="email"/><br/--%>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" name="name" id="floatingInput" placeholder="name@example.com">
                                                <label for="floatingInput">Nombre</label>
                                            </div>
                                        </div>
                                    </div>
                                    <div style="margin-top:10px">
                                        <%--label>Correo: </label>
                                        <g:field  name="email"/><br/--%>
                                        <div class="form-floating mb-3">
                                            <input type="email" class="form-control" name="email" id="floatingInput" placeholder="name@example.com">
                                            <label for="floatingInput">Correo electr??nico</label>
                                        </div>
                                    </div>
                                    <div style="margin-top:10px">
                                        <%--label>Contrase??a: </label>
                                        <g:field  name="password"/><br/--%>
                                        <div class="form-floating">
                                            <input type="password" class="form-control" name="password" id="floatingPassword" placeholder="Password">
                                            <label for="floatingPassword">Contrase??a</label>
                                          </div>
                                    </div>
                                    <div style="margin-top:10px" >
                                        <g:actionSubmit value="Registrar" class="btn btn-shop"/>
                                    </div>
                                </g:form>                                                                
                            </div>
                        </div>
                    </div>
                    <div class=" col-6 col-s-6">
                      <img src="${resource(dir: 'images', file: 'inicio_quienes/logotipo_proyecto_web.png')}"  class="img-rounded foto_home" id="imagen">
                    </div>
                    
                </div>
            </div>
            <div class="col-1 col-s-1">
                </div>
        </div>
    </body>
    
    <g:render template="/footer"/>
</html>