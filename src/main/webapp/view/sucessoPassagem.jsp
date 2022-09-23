<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucesso</title>
</head>
<body>

	<h1>PASSAGEM AÉREA</h1>
	<fieldset>
		<legend>Passagem </legend>
		
		<p>Sua passagem foi comprado com sucesso!:</p>
		
		<p>
			<b>Nome: </b>${Passagem.nomeCliente}<br>
			<b>Data:</b>${Passagem.data}<br>
			<b>Origem:</b>${Passagem.origem}<br>
			<b>Destino:</b>${Passagem.destino}<br>
			<b>Hora de embarque:</b>${Passagem.horaPartida}<br>
			<b>Hora de chegada:</b>${Passagem.horaChegada}<br>	
		</p>
			
			
			<p>Obrigado por usar nosso site, tenha uma boa viagem!:</p>
			
			<a href="Voo.html">Sair</a>
	</fieldset>

</body>
</html>