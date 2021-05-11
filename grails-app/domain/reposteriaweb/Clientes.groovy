package reposteriaweb

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
    }
}
