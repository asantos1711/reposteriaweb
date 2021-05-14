
<%@ page import="faqs.Faqs" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'faqs.label', default: 'Faqs')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-faqs" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-faqs" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="pregunta" title="${message(code: 'faqs.pregunta.label', default: 'Pregunta')}" />
					
						<g:sortableColumn property="respuesta" title="${message(code: 'faqs.respuesta.label', default: 'Respuesta')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${faqsInstanceList}" status="i" var="faqsInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${faqsInstance.id}">${fieldValue(bean: faqsInstance, field: "pregunta")}</g:link></td>
					
						<td>${fieldValue(bean: faqsInstance, field: "respuesta")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${faqsInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
