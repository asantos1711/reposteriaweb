package reposteriaweb

import productos.Productos
import ventas.*

import clientes.Clientes
import pedidos.Pedidos
import productos.Fotosproductos

class PostresController {
    //static allowedMethods = [agregaracarrito: "POST"]
    def index() { 
        
        Map<Integer,List<Fotosproductos>> listaFotos = [:]
        List<Productos> listaProductos = Productos.list()
        
        listaProductos.each{it->
            Productos p = it
            listaFotos[p.id]=Fotosproductos.findAll("from Fotosproductos as b where b.producto = ${p.id}")
        };
        
        listaFotos.each{k,v->
            List<Fotosproductos> it =v
            println it.first().url
        };
        
       render(view:"main",model:[listaProductos:listaProductos, listaFotos:listaFotos])
    }
    
    def detalle() { 
        
       println params
       Productos producto = Productos.get(params.producto)
       List<Fotosproductos> listaFotos =Fotosproductos.findAll("from Fotosproductos as b where b.producto = ${producto.id}")
       
        //println producto.nombre
        //println listaFotos.first().url
        
       render(view:"detalle",model:[producto:producto, listaFotos:listaFotos])
    }
    
    def agregaracarrito(){
        println params
       Productos producto = Productos.get(params.producto)
       List<Fotosproductos> listaFotos =Fotosproductos.findAll("from Fotosproductos as b where b.producto = ${producto.id}")
       
        if(session?.user == null || session?.username==null ){
            redirect(controller: "usuarios", action: "index")
        }else if(session.carrito==null){
            initcarrito()
            //flash.message =  "Carrito creado"
        }
        
        Integer cant = (Integer)addProducto(producto)
        flash.message =  "Se ha agregado un(a) ${producto.nombre} al carrito. Total de este producto : $cant"

        
        render(view:"detalle",model:[producto:producto, listaFotos:listaFotos])
        if(params.menu!=null){
            redirect(action:"index")
        }else{
            redirect(action:"detalle",params:[producto:producto.id])
        }
    }
    def agregademenu(){
        println params
       Productos producto = Productos.get(params.producto)
       List<Fotosproductos> listaFotos =Fotosproductos.findAll("from Fotosproductos as b where b.producto = ${producto.id}")
       
        if(session?.user == null || session?.username==null ){
            redirect(controller: "usuarios", action: "index")
        }else if(session.carrito==null){
            initcarrito()
            //flash.message =  "Carrito creado"
        }
        
        Integer cant = (Integer)addProducto(producto)
        flash.message =  "Se ha agregado un(a) ${producto.nombre} al carrito. Total de este producto : $cant"

        
        render(view:"detalle",model:[producto:producto, listaFotos:listaFotos])
        redirect(action:"detalle",params:[producto:producto.id])
    }
    
    double  addProducto(Productos producto){
        
        Pedidos pedido = session.carrito
        println pedido.idCliente + "-"+pedido.idVenta+ "-"+producto.id
        boolean  isnul =Productoventas.findByIdVentaAndIdProducto(pedido.idVenta,producto.id)==null
       Productoventas  pv =isnul?new Productoventas():Productoventas.findByIdVentaAndIdProducto(pedido.idVenta,producto.id)
        
        if(!isnul){
            pv.cantidad = pv.cantidad+1
        }else{
            pv.cantidad = 1
            pv.idVenta = pedido.idVenta
            pv.idProducto = producto.id
        }
        if(!pv.save(flush:true, failOnError:true)){
            pv.errors.each {
                println "Error al guardar por pedido"+ it
            }
         }
        Productoventas  pvr =Productoventas.findByIdVentaAndIdProducto(pedido.idVenta,producto.id)
        return pvr.cantidad
    }
    
    def initcarrito(){
        
        Clientes user = session.user
        Ventas venta = new Ventas()
        Pedidos pedido = new Pedidos()
        
        venta.fecha = new Date()
        venta.idCliente=user.id
        venta.total = 0
        
        
        if(!venta.save(flush:true, failOnError:true)){
            venta.errors.each {
                println "Error al guardar por venta"+ it
            }
         }
         def ventaResponse = Ventas.findByIdCliente(user.id)
        
        pedido.estado = "Pedido"
        pedido.idVenta = ventaResponse.id
        pedido.idCliente = user.id
        
         if(!pedido.save(flush:true, failOnError:true)){
            pedido.errors.each {
                println "Error al guardar por pedido"+ it
            }
         }
        Pedidos pedidoResponse = Pedidos.findByIdVenta(ventaResponse.id)
        println pedidoResponse.estado
        session.carrito= pedidoResponse
    }
}
