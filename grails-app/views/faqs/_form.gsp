<%@ page import="faqs.Faqs" %>



<div class="fieldcontain ${hasErrors(bean: faqsInstance, field: 'pregunta', 'error')} required">
	<label for="pregunta">
		<g:message code="faqs.pregunta.label" default="Pregunta" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="pregunta" required="" value="${faqsInstance?.pregunta}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: faqsInstance, field: 'respuesta', 'error')} required">
	<label for="respuesta">
		<g:message code="faqs.respuesta.label" default="Respuesta" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="respuesta" required="" value="${faqsInstance?.respuesta}"/>

</div>

