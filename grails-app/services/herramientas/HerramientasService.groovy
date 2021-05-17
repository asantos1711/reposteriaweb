package herramientas

import grails.transaction.Transactional
import java.text.DateFormat
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Transactional
class HerramientasService {

    def ConvertitrStringFecha(def Cadena, def Formato){                
        DateFormat fechaHora = new SimpleDateFormat(Formato)
        Date FechaCon = fechaHora.parse(Cadena)
        
        return FechaCon
    }
    
     def CrearAlerta(def Tipo, def Mensaje){
        /*
         * Posibles valores para tipo:
         * success,info,warning,danger.
         */
        def alert = "<div class ='alert alert-"+ Tipo+" alert-dismissable'>"+
                        "<button type = 'button' class = 'close' data-dismiss = 'alert' aria-hidden = 'true'></button>"+
                            Mensaje + 
                    "</div>";
        
        return alert;
    }
}
