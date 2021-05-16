package usuarios

import clientes.Clientes
import grails.transaction.Transactional

@Transactional
class UsuariosController {
      static allowedMethods = [iniciarsesion: "POST"]
    def index() { 
        Clientes cliente = new Clientes()
        //cliente.correo = "Abraham"
        render(view:"main",model:[cliente:cliente])
    }
    
    def iniciarsesion(){
        print("inicia")
        print(params)
        def person = new Clientes()
        def ultimoId = Clientes.createCriteria().get(){                                
            projections {
                max("id")
           } 
        } 
               
       try{                       
            //print person
            //person.id = ultimoId ? ultimoId.toInteger() + 10 : ultimoId+3
            person.nombre = params.firstName
            person.correo = "correo"
            person.password = "123456"
            
            if(!person.save(flush:true, failOnError:true)){
                person.errors.each {
                    println "Error al guardar por LogInstance"+ it
                }
             }
            
       }catch(ex){
           print("excepcion..."+ex)
       }
        
       
        //render "Success!"
        
        redirect(view:"main",model:[cliente:person])
    }
}
