package faqs

class Faqs {
    Integer id
    String pregunta
    String respuesta
    
    static mapping = {
        table "faqs"
        version false
        
        id              column:"id_faq", generator:"increment"
        pregunta        column:"pregunta"
        respuesta       column:"respuesta"
         
        sort id: "asc"
    }
    
    static constraints = {
        id         nullable:false, blank:false
        pregunta     nullable:false, blank:false
        respuesta     nullable:false, blank:false
    }
}
