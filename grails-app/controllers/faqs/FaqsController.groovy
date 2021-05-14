package faqs



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class FaqsController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Faqs.list(params), model:[faqsInstanceCount: Faqs.count()]
    }

    def show(Faqs faqsInstance) {
        respond faqsInstance
    }

    def create() {
        respond new Faqs(params)
    }

    @Transactional
    def save(Faqs faqsInstance) {
        if (faqsInstance == null) {
            notFound()
            return
        }

        if (faqsInstance.hasErrors()) {
            respond faqsInstance.errors, view:'create'
            return
        }

        faqsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'faqs.label', default: 'Faqs'), faqsInstance.id])
                redirect faqsInstance
            }
            '*' { respond faqsInstance, [status: CREATED] }
        }
    }

    def edit(Faqs faqsInstance) {
        respond faqsInstance
    }

    @Transactional
    def update(Faqs faqsInstance) {
        if (faqsInstance == null) {
            notFound()
            return
        }

        if (faqsInstance.hasErrors()) {
            respond faqsInstance.errors, view:'edit'
            return
        }

        faqsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Faqs.label', default: 'Faqs'), faqsInstance.id])
                redirect faqsInstance
            }
            '*'{ respond faqsInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Faqs faqsInstance) {

        if (faqsInstance == null) {
            notFound()
            return
        }

        faqsInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Faqs.label', default: 'Faqs'), faqsInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'faqs.label', default: 'Faqs'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
