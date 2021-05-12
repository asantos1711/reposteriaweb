package clientes

class Clientes implements Serializable {
    Integer id
    String nombre
    String correo
    String password
    
    static mapping = {
        table "clientes"
        version false
        
        id              column:"id_cliente", generator:"increment"
        nombre          column:"nombre_completo"
        correo          column:"correo"
        password        column:"contrasena"
        
        sort id: "asc"
    }
    
    static constraints = {
        id  nullable:false, blank:false
        nombre  nullable:false, blank:false
        correo nullable:false, blank:false
        password nullable:false, blank:false
    }
}
