package controllers;

import java.time.LocalDateTime;
import java.util.Scanner;

import entities.Aluno;
import repositories.AlunoRepository;

//Página 10 no pdf aula 03

public class AlunoController {
	
	/*
	 * Capturando os dados do formulário de cadastro de aluno
	 */
	public void matricularAluno() {
		
		var scanner = new Scanner(System.in);
		
		//Criando um objeto da classe Aluno
		var aluno = new Aluno();
		
		//Capturando os dados de matrícula do aluno
		System.out.print("Informe o nome completo do aluno: ");
		aluno.setNome(scanner.nextLine());
		
		System.out.print("Informe o nome completo da mãe do aluno: ");
		aluno.setNomeMae(scanner.nextLine());
		
		System.out.print("Informe o curso que o aluno irá cursar: ");
		aluno.setCurso(scanner.nextLine());
		
		System.out.print("Informe o telefone de contato do aluno: ");
		aluno.setTelefone(scanner.nextLine());
		
		System.out.print("Informe a data de matrícula do aluno: ");
		aluno.setDataMatricula(LocalDateTime.parse(scanner.nextLine()));
		
		//Criando um objeto da classe alunoRepository
		var alunoRepository = new AlunoRepository();
		
		//Inserindo os dados do aluno no banco de dados
		alunoRepository.matricularAluno(aluno);
		
		scanner.close();
	}
	

}
