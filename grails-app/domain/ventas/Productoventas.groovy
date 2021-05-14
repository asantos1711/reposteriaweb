package ventas

class Productoventas {
    
    Integer id
    Integer idProducto
    Integer idVenta
    Double cantidad
    
    static mapping = {
        table "productosventas"
        version false
        
        id           column:"id_productosventas", generator:"increment"
        idProducto    column:"id_producto"
        idVenta        column:"id_venta"
        cantidad        column:"cantidad"
        
        sort id: "asc"
    }
    
    static constraints = {
        id  nullable:false, blank:false
        idProducto  nullable:false, blank:false
        idVenta nullable:false, blank:false
        cantidad nullable:false, blank:false
    }
}
