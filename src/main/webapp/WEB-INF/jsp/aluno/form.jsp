<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/alunos" method="post">
  
	<c:if test="${not empty aluno.id}">
		<input type="hidden" name="aluno.id" value="${aluno.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Nome:<br />
		<input type="text" name="aluno.nome" value="${aluno.nome}"/>
	</div>
	<div class="field">
		Nota:<br />
		<input type="text" name="aluno.nota" value="${aluno.nota}"/>
	</div>
	<div class="field">
		Telefone:<br />
		<input type="text" name="aluno.telefone" value="${aluno.telefone}"/>
	</div>
	<div class="field">
		Site:<br />
		<input type="text" name="aluno.site" value="${aluno.site}"/>
	</div>
	<div class="field">
		Endereco:<br />
		<input type="text" name="aluno.endereco" value="${aluno.endereco}"/>
	</div>

<div class="actions">
	<button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/alunos">Back</a>
