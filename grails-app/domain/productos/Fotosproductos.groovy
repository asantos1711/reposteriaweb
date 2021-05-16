package productos

class Fotosproductos {
    
    Integer id
    String url
    //Integer idproducto
    static belongsTo = [producto:Productos]
    

    static mapping = {
        table "fotosproductos"
        version false
        
        id              column:"id_foto", generator:"increment"
        url             column:"url"
        producto      column:"id_producto"
         
        sort id: "asc"
    }
    
    static constraints = {
        id         nullable:false, blank:false
        url     nullable:false, blank:false
        producto     nullable:false, blank:false
    }
}
