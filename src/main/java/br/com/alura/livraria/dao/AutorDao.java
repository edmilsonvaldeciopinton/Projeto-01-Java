package br.com.alura.livraria.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.livraria.modelo.Autor;

public class AutorDao {

	private Connection conexao;

	public AutorDao(Connection conexao) {
		this.conexao = conexao;
	}

	public void cadastrar(Autor autor) {
		try {
			String sql = "insert into autores(nome, email, dataNascimento, miniCurriculum) values(?, ?, ?, ?)";

			PreparedStatement ps = conexao.prepareStatement(sql);

			ps.setString(1, autor.getNome());
			ps.setString(2, autor.getEmail());
			ps.setDate(3, Date.valueOf(autor.getDataNascimento()));
			ps.setString(4, autor.getMiniCurriculum());

			ps.execute();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public List<Autor> listar() {
		try {
			String sql = "select * from autores";

			PreparedStatement ps = conexao.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			List<Autor> autores = new ArrayList<>();

			while (rs.next()) {
				Autor a = new Autor();

				a.setNome(rs.getString("nome"));
				a.setEmail(rs.getString("email"));
				a.setDataNascimento((rs.getDate("DataNascimento").toLocalDate()));
				a.setMiniCurriculum(rs.getString("miniCurriculum"));

				autores.add(a);
			}
			return autores;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
