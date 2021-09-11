package br.com.alura.livraria.teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.alura.livraria.modelo.Autor;

public class Teste {

	public static void main(String[] args) {
		Autor a = new Autor();

		a.setNome("João Luís Borges");
		a.setEmail("JLBorges@gmail.com");
		a.setDataNascimento(LocalDate.now());
		a.setMiniCurriculum("Analista de RH");

		System.out.println(a.getNome());
		System.out.println(a.getEmail());
		System.out.println(a.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(a.getMiniCurriculum());

		Autor a2 = new Autor(
				"Isaura Noriko Missima", 
				"INMissima@gmail.com", 
				LocalDate.now(), 
				"Analista de Systemas");
		
		System.out.println(a2);
	}

}
