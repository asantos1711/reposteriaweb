package carrito

class CarritoController {

    def index() { 
        if(session?.user == null || session?.username==null ){
            redirect(controller: "usuarios", action: "index")
        }
        
        render(view:"carrito")
    }
}
