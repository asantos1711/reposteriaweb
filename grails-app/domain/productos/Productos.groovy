package productos

class Productos {
    static hasMany = [fotos:Fotosproductos]
    Integer id
    String nombre
    Double precio
    String descripcion
    String unidad
    Integer cantidad
    
    static mapping = {
        table "productos"
        version false
        
        id              column:"id_producto", generator:"increment"
        nombre          column:"nombre"
        precio          column:"precio"
        descripcion     column:"descripcion"
        unidad          column:"unidad"
        cantidad        column:"cantidad"
         
        sort id: "asc"
    }
    
    static constraints = {
    //id         nullable:false, blank:false
    nombre     nullable:false, blank:false
    precio     nullable:false, blank:false
    descripcion nullable:false, blank:false
    unidad     nullable:false, blank:false
    cantidad   nullable:false, blank:false
    }
}
