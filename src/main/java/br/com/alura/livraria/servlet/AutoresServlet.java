package br.com.alura.livraria.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.livraria.dao.AutorDao;
import br.com.alura.livraria.factory.ConnectionFactory;
import br.com.alura.livraria.modelo.Autor;

@WebServlet("/autores")
public class AutoresServlet extends HttpServlet {

	private AutorDao dao;

	public AutoresServlet() {
		
			this.dao = new AutorDao(new ConnectionFactory().getConnection());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setAttribute("autores", dao.listar());

		req.getRequestDispatcher("WEB-INF/jsp/autores.jsp").forward(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		try {
			String nome = req.getParameter("nome");
			String email = req.getParameter("email");
			LocalDate dataNascimento = LocalDate.parse(req.getParameter("dataNascimento"),
					DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			String miniCurriculum = req.getParameter("miniCurriculum");

			Autor autor = new Autor(nome, email, dataNascimento, miniCurriculum);

			dao.cadastrar(autor);

			res.sendRedirect("autores");
		} catch (NumberFormatException e) {
			res.sendRedirect("autores?erro=campo invalido!");
		}

	}

}
