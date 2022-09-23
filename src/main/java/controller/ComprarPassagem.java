package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Passagem;
import model.PassagemDAO;

@WebServlet("/ComprarPassagem")
public class ComprarPassagem extends HttpServlet {
	
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Passagem passagem = new Passagem();
		
		String origem = request.getParameter("origem");
		String bagagem = request.getParameter("bagagem");
		String destino = request.getParameter("destino");
		String data = request.getParameter("dataIda");
		String horaSaida= request.getParameter("horaPartida");
		String horaChegada="4h";
	
		
		
		passagem.setData(data);
		passagem.setHoraPartida(horaSaida);
		passagem.setHoraChegada(horaChegada);
		passagem.setOrigem(origem);
		passagem.setDestino(destino);
		passagem.setTiDeVoo("comercial");
		passagem.setValor(2000.00);
		passagem.setBagagem(bagagem);
		passagem.setNomeCliente("Joao");
		passagem.setCpf("225874123");
		
		
		PassagemDAO passDAO = new PassagemDAO();
		passDAO.save(passagem);
		
		
		request.setAttribute("Passagem", passagem);
		
		RequestDispatcher rd = request.getRequestDispatcher("sucessoPassagem.jsp");

        rd.forward(request, response);
		//response.sendRedirect("sucessoPassagem.jsp");
		
		
	}

}
