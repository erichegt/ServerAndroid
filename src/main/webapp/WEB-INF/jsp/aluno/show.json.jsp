<head>
	<title>Aluno [show]</title>
</head>
<body>
	<p>
		<b>Nome:</b>
		${aluno.nome}
	</p>
	<p>
		<b>Nota:</b>
		${aluno.nota}
	</p>
	<p>
		<b>Telefone:</b>
		${aluno.telefone}
	</p>
	<p>
		<b>Site:</b>
		${aluno.site}
	</p>
	<p>
		<b>Endereco:</b>
		${aluno.endereco}
	</p>

	<a href="${pageContext.request.contextPath}/alunos/${aluno.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/alunos">Back</a>
</body>