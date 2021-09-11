package br.com.alura.livraria.modelo;

import java.time.LocalDate;

public class Autor {
	private String Nome;
	private String Email;
	private LocalDate DataNascimento;
	private String MiniCurriculum;

	public Autor(String nome, String email, LocalDate dataNascimento, String miniCurriculum) {
		Nome = nome;
		Email = email;
		DataNascimento = dataNascimento;
		MiniCurriculum = miniCurriculum;
	}

	@Override
	public String toString() {
		return "Autor [Nome=" + Nome + ", Email=" + Email + ", DataNascimento=" + DataNascimento + ", MiniCurriculum="
				+ MiniCurriculum + "]";
	}

	public Autor() {
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public LocalDate getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public String getMiniCurriculum() {
		return MiniCurriculum;
	}

	public void setMiniCurriculum(String miniCurriculum) {
		MiniCurriculum = miniCurriculum;
	}

}
