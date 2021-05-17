package usuarios

import clientes.Clientes
import grails.transaction.Transactional

@Transactional
class UsuariosController {
    def HerramientasService
      static allowedMethods = [iniciarsesion: "POST"]
    def index() { 
        Clientes cliente = new Clientes()
        //cliente.correo = "Abraham"
        if(session.user != null){
           render(view:"perfil")
        }else{
          render(view:"main",model:[cliente:cliente])
        }
    }
    
    def iniciarsesion(){
       /* print("inicia")
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
        */
        
        def UsuarioInicia = params?.email ? params?.email?.toString()?.trim() : null
        def Contra = params?.pwd ?  params?.pwd?.toString()?.trim() : null
        //def Lang = params?.lang ? params?.lang?.toString()?.trim() : 'es'
        print(UsuarioInicia + " "+ Contra)
        def UsuarioInstance = Clientes.findByCorreo(UsuarioInicia)
        //Clientes.findByCorreoLike(UsuarioInicia) ?: null
       // def nivel
        print("find..."+UsuarioInstance)
        if(UsuarioInstance){                                                         
            if(UsuarioInstance?.password == Contra){                                
                session.user = UsuarioInstance
                session.username = UsuarioInstance?.nombre?.toUpperCase()                
                     
                redirect(action: "perfil")
                //render(view: "perfil")       
            }            
            else{
                flash.message = "Password is not correct"                
               // nivel = EstadoLog.findByDescripcionLike("CRITICO")
               // LogService.Insertar(nivel,UsuarioInicia,"USUARIO","NO SE INICIO SESION")
                render(view: "main" ,model:[]) 
            }
        }else{
            flash.message = "User not found"        
            render(view: "main" ,model:[]) 
        }
        //render(view:"perfil")
    }
    
    def registrar(){
        print("inicia")
        print(params)
        def alerta
        def person = new Clientes()
        def ultimoId = Clientes.createCriteria().get(){                                
            projections {
                max("id")
           } 
        } 
               
       try{                       
            //print person
            //person.id = ultimoId ? ultimoId.toInteger() + 10 : ultimoId+3
            person.nombre = params.name
            person.correo = params.email
            person.password = params.password
            
            if(!person.save(flush:true, failOnError:true)){
                person.errors.each {
                    println "Error al guardar por LogInstance"+ it
                }
             }
            
            flash.message =  "Guardado"
            alerta = HerramientasService.CrearAlerta("success",flash.message) 
            
            def UsuarioInstance = Clientes.findByCorreo(person.correo)
            print(UsuarioInstance)
            session.user = UsuarioInstance
            session.username = UsuarioInstance?.nombre?.toUpperCase()   
            
            
       }catch(ex){
           print("excepcion..."+ex)
       }
        
       
        //render "Success!"
        
        redirect(view: "perfil")
    }
    
    
    def viewRegistro(){
       render(view:"registro")       
    }
    
    def perfil(){
        render(view:"perfil")         
    }
    def cerrar_sesion(){        
        session.user = null
        session.username = null
        
        render(view: "main")                 
         
    }
}
