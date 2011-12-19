<head>
	<title>Aluno [index]</title>
</head>
<body>
	<h1>Listing Alunos</h1>

	<table>
		<tr>
			<th>Nome</th>
			<th>Nota</th>
			<th>Telefone</th>
			<th>Site</th>
			<th>Endereco</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${alunoList}" var="aluno">
			<tr>
				<td>${aluno.nome}</td>
				<td>${aluno.nota}</td>
				<td>${aluno.telefone}</td>
				<td>${aluno.site}</td>
				<td>${aluno.endereco}</td>
				<td><a href="${pageContext.request.contextPath}/alunos/${aluno.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/alunos/${aluno.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/alunos/${aluno.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/alunos/new">New Aluno</a> 
</body>