<ul>
<g:each var="item" in="${payments}">
	<li>${item.date}</li><li><g:link action="delete" id="${item.id}">delete payment</g:link></li>
</g:each>
</ul>
${size}