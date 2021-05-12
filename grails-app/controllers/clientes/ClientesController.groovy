package clientes



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ClientesController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Clientes.list(params), model:[clientesInstanceCount: Clientes.count()]
    }

    def show(Clientes clientesInstance) {
        respond clientesInstance
    }

    def create() {
        respond new Clientes(params)
    }

    @Transactional
    def save(Clientes clientesInstance) {
        if (clientesInstance == null) {
            notFound()
            return
        }

        if (clientesInstance.hasErrors()) {
            respond clientesInstance.errors, view:'create'
            return
        }

        clientesInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'clientes.label', default: 'Clientes'), clientesInstance.id])
                redirect clientesInstance
            }
            '*' { respond clientesInstance, [status: CREATED] }
        }
    }

    def edit(Clientes clientesInstance) {
        respond clientesInstance
    }

    @Transactional
    def update(Clientes clientesInstance) {
        if (clientesInstance == null) {
            notFound()
            return
        }

        if (clientesInstance.hasErrors()) {
            respond clientesInstance.errors, view:'edit'
            return
        }

        clientesInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Clientes.label', default: 'Clientes'), clientesInstance.id])
                redirect clientesInstance
            }
            '*'{ respond clientesInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Clientes clientesInstance) {

        if (clientesInstance == null) {
            notFound()
            return
        }

        clientesInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Clientes.label', default: 'Clientes'), clientesInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'clientes.label', default: 'Clientes'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
