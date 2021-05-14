<%@ page import="productos.Productos" %>



<div class="fieldcontain ${hasErrors(bean: productosInstance, field: 'nombre', 'error')} required">
	<label for="nombre">
		<g:message code="productos.nombre.label" default="Nombre" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nombre" required="" value="${productosInstance?.nombre}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productosInstance, field: 'precio', 'error')} required">
	<label for="precio">
		<g:message code="productos.precio.label" default="Precio" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="precio" value="${fieldValue(bean: productosInstance, field: 'precio')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: productosInstance, field: 'descripcion', 'error')} required">
	<label for="descripcion">
		<g:message code="productos.descripcion.label" default="Descripcion" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descripcion" required="" value="${productosInstance?.descripcion}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productosInstance, field: 'unidad', 'error')} required">
	<label for="unidad">
		<g:message code="productos.unidad.label" default="Unidad" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="unidad" required="" value="${productosInstance?.unidad}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productosInstance, field: 'cantidad', 'error')} required">
	<label for="cantidad">
		<g:message code="productos.cantidad.label" default="Cantidad" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="cantidad" type="number" value="${productosInstance.cantidad}" required=""/>

</div>

