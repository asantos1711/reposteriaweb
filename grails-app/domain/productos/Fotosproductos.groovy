package productos

class Fotosproductos {
    
    Integer id
    String url
    Integer idproducto
    

    static mapping = {
        table "fotosproductos"
        version false
        
        id              column:"id_foto", generator:"increment"
        url             column:"url"
        idproducto      column:"id_producto"
         
        sort id: "asc"
    }
    
    static constraints = {
        id         nullable:false, blank:false
        url     nullable:false, blank:false
        idproducto     nullable:false, blank:false
    }
}
