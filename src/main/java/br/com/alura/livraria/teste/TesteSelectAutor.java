package br.com.alura.livraria.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import br.com.alura.livraria.dao.AutorDao;
import br.com.alura.livraria.modelo.Autor;

public class TesteSelectAutor {

	public static void main(String[] args) {
		try {
//			String url = "jdbc:mysql://localhost:3306/Livraria";
			String url = "jdbc:mysql://localhost:3306/Livraria?useTimezone=true&serverTimezone=UTC";
			String usuario = "root";
			String senha = "root";
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			AutorDao dao = new AutorDao(conexao);

			List<Autor> autores = dao.listar();
			autores.forEach(System.out::println);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro!");
		}

	}
}
