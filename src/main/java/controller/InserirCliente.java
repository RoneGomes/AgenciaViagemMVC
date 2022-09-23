package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import model.ClienteDAO;

@WebServlet("/InserirCliente")
public class InserirCliente extends HttpServlet {
	
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cliente cliente = new Cliente();
		
		String nome = request.getParameter("usuario");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String data = request.getParameter("data");
		String  senha = request.getParameter("senha");
		
		
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setEmail(email);
		cliente.setDataNascimento(data);
		cliente.setSenha(senha);
		
		ClienteDAO cliDAO = new ClienteDAO();
		cliDAO.save(cliente);
		
		response.sendRedirect("sucesso.jsp");
		
		
	}

}
