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
        
        listaFotos.each{k,v->
            List<Fotosproductos> it =v
            println it.first().url
        };
        
       render(view:"main",model:[listaProductos:listaProductos, listaFotos:listaFotos])
    }
    
    
}
