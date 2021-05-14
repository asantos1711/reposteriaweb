package productos



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ProductosController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Productos.list(params), model:[productosInstanceCount: Productos.count()]
    }

    def show(Productos productosInstance) {
        respond productosInstance
    }

    def create() {
        respond new Productos(params)
    }

    @Transactional
    def save(Productos productosInstance) {
        if (productosInstance == null) {
            notFound()
            return
        }

        if (productosInstance.hasErrors()) {
            respond productosInstance.errors, view:'create'
            return
        }

        productosInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'productos.label', default: 'Productos'), productosInstance.id])
                redirect productosInstance
            }
            '*' { respond productosInstance, [status: CREATED] }
        }
    }

    def edit(Productos productosInstance) {
        respond productosInstance
    }

    @Transactional
    def update(Productos productosInstance) {
        if (productosInstance == null) {
            notFound()
            return
        }

        if (productosInstance.hasErrors()) {
            respond productosInstance.errors, view:'edit'
            return
        }

        productosInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Productos.label', default: 'Productos'), productosInstance.id])
                redirect productosInstance
            }
            '*'{ respond productosInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Productos productosInstance) {

        if (productosInstance == null) {
            notFound()
            return
        }

        productosInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Productos.label', default: 'Productos'), productosInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'productos.label', default: 'Productos'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
