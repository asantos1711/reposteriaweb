<!DOCTYPE html>
<html>
	<head>
            <!-- CSS only -->
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
            <link rel="stylesheet" href="css/style.css">
        </head>
	<body style="background-color: #FFF">
            
            <%--img url="assets/images/images/inicio_quienes/logotipo_proyecto_web.png"--%>                        
            <div class="col-12 col-s-12 row"> 
                <center class="title">Dulce vida</center>
                <div class="col-1 col-s-1">
                </div>
                <div class="col-10 col-s-10 banner">
                    <div class="column">                        
                        <g:render template="banner"/>
                        <div class="row">
                            <div class=" col-6 col-s-6 title_banner">
                                ¡ Es un placer atenderte !
                            </div>
                            <div class=" col-6 col-s-6">
                              <img src="${resource(dir: 'images', file: 'inicio_quienes/logotipo_proyecto_web.png')}"  class="img-rounded foto_home" id="imagen">
                            </div>
                        </div>
                        <div class="comprar_ahora">
                            <div class="row">      
                                <div class="col-4 col-s-4">                                                 
                                    <img src="${resource(dir: 'images', file: 'menú/cheesecake.jpg')}"  class="foto_gal_home rounded float-left" id="imagen">
                                    <div>Cheescake</div>
                                </div>
                                <div class="col-4 col-s-4">                                                 
                                    <img src="${resource(dir: 'images', file: 'menú/tartaletas_con_fresa_arándanos_kiwi.jpg')}"  class="foto_gal_home" id="imagen">
                                    <div>Tartaletas de fresa con arandanos</div>
                               </div>
                                <div class="col-4 col-s-4">                                                 
                                     <img src="${resource(dir: 'images', file: 'nuestros_postres/pastel_postres.jpg')}"  class="foto_gal_home" id="imagen">                                                                        
                                     <div>Pastel</div>
                                </div>
                            </div>
                            <div style="margin-top: 55px">
                                <button type="button" class="btn btn-shop">Comprar ahora</button>
                            </div>
                        </div>
                        
                        <div class="row" style="margin-top: 35px">                            
                            <div class=" col-6 col-s-6">
                              <img src="${resource(dir: 'images', file: 'menú/roles_de_canela.jpg')}"  class="img-rounded foto_home" id="imagen">
                            </div>
                            <div class=" col-6 col-s-6 title_banner">
                                ¡El más vendido!                                
                                <div class="title_mas">Roles de canela</div>                                
                                <div style="margin-top: 25px">
                                    <button type="button" class="btn btn-shop title_btn_mas">Ver más</button>
                                </div>
                            </div>
                           
                        </div>
                    </div>
                </div>
                 <div class="col-1 col-s-1">
                </div>
            </div>
	</body>
        
        <g:render template="footer"/>
        
        <div style="margin-top: 25px"></div>
</html>
