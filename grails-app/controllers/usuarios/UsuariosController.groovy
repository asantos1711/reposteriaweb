package usuarios

import clientes.Clientes

class UsuariosController {
      static allowedMethods = [iniciarsesion: "POST"]
    def index() { 
        Clientes cliente = new Clientes()
        //cliente.correo = "Abraham"
        render(view:"main",model:[cliente:cliente])
    }
    
    def iniciarsesion(){
        def person = new Clientes(params)
        print person
       // person.save()
        //render "Success!"
        redirect(view:"main",model:[cliente:cliente])
    }
}
