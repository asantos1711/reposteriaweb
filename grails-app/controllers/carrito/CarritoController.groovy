package carrito

import pedidos.Pedidos
import productos.Productos
import ventas.Productoventas

class CarritoController {

    def index() { 
        if(session?.user == null || session?.username==null ){
            redirect(controller: "usuarios", action: "index")
            return
        }
        
        if(session.carrito==null){
           redirect(controller: "postres", action: "index")
        }
        
        Pedidos pd = session.carrito
        List<Productoventas> listProductosVentas = Productoventas.findAllByIdVenta(pd.idVenta)
        List<Productos> listProductos = Productos.findAll()
        /*listProductos.each{it->
            println idProducto
        };*/
        
        
        render(view:"carrito", model:[listProductosVentas:listProductosVentas,listProductos:listProductos])
    }
}
