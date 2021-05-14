package pedidos

class Pedidos {
    Integer id
    Integer idVenta
    Integer idCliente
    String estado
    
    static mapping = {
        table "pedidos"
        version false
        
        id           column:"id_pedido", generator:"increment"
        idVenta    column:"id_venta"
        idCliente        column:"id_cliente"
        estado        column:"estado"
        
        sort id: "asc"
    }
    
    static constraints = {
        id  nullable:false, blank:false
        idCliente  nullable:false, blank:false
        idVenta nullable:false, blank:false
        estado nullable:false, blank:false
    }
}
