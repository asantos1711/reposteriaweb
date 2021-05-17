package ventas


class Ventas {

    Integer id
    Integer idCliente
    Double  total
    Date fecha
    
    static mapping = {
        table "ventas"
        version false
        
        id           column:"id_venta", generator:"increment"
        idCliente    column:"id_cliente"
        total        column:"total_precio"
        fecha        column:"fecha"
        
        sort id: "asc"
    }
    
    static constraints = {
        //id  nullable:false, blank:false
        idCliente  nullable:false, blank:false
        total nullable:false, blank:false
        fecha nullable:false, blank:false
    }
}
