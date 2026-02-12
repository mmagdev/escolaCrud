package main;

import controllers.AlunoController;

//p 12 da aula 03. Correção da dataMatricula

public class Main {

	public static void main(String[] args) {
		//Criando um objeto da classe AlunoController
		var alunoController = new AlunoController();
		
		//Chamando o método para matricular um aluno
		alunoController.matricularAluno();

	}

}

