package reposteriaweb

import productos.Productos
import productos.Fotosproductos

class PostresController {

    def index() { 
        
        Map<Integer,List<Fotosproductos>> listaFotos = [:]
        List<Productos> listaProductos = Productos.list()
        
        listaProductos.each{it->
            Productos p = it
            listaFotos[p.id]=Fotosproductos.findAll("from Fotosproductos as b where b.producto = ${p.id}")
        };
        
        /*listaFotos.each{k,v->
            List<Fotosproductos> it =v
            println it.first().url
        };*/
        
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
}
