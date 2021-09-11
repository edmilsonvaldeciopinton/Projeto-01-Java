package br.com.alura.livraria.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import br.com.alura.livraria.dao.AutorDao;
import br.com.alura.livraria.modelo.Autor;

public class TesteInsereAutor {

	public static void main(String[] args) {
		try {
//		String url = "jdbc:mysql://localhost:3306/Livraria";
			String url = "jdbc:mysql://localhost:3306/Livraria?useTimezone=true&serverTimezone=UTC";
			String usuario = "root";
			String senha = "root";
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			AutorDao dao = new AutorDao(conexao);
			Autor autor = new Autor("João Luís Borges", "JLBorges@gmail.com", LocalDate.now(), "Analista de RH");

			dao.cadastrar(autor);
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro");
		}

	}

}
