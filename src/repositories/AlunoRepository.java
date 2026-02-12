package repositories;

import java.sql.Date;
import java.util.UUID;

import entities.Aluno;
import factories.AlunoFactory;

/*
 * A classe AlunoRepository serve para adicionar, excluir,
 * atualizar ou editar dados dos alunos matriculados
 */

public class AlunoRepository {
	
	/*
	 * Método para capturar os dados dos alunos
	 */
	
	public void matricularAluno(Aluno aluno) {
		
		try {
			
			//Abrindo conexão com o banco de dados
			var factory = new AlunoFactory();
			var connection = factory.obterConexao();
			
			//GERA O UUID PARA O ALUNO
	        aluno.setIdMatricula(UUID.randomUUID());
	        System.out.println("UUID gerado: " + aluno.getIdMatricula());

			
			//Gerando o script para adicionar um aluno ao banco de dados
			var sql = """
					INSERT INTO alunos (nome, nome_mae, curso, telefone, data_matricula)
					VALUES (?, ?, ?, ?, ?)
					
					""";
			
			//Preparando o comando SQL para ser executado no banco
			var statement = connection.prepareStatement(sql);
			statement.setString(1, aluno.getNome());
			statement.setString(2, aluno.getNomeMae());
			statement.setString(3, aluno.getCurso());
			statement.setString(4,  aluno.getTelefone());
			statement.setDate(5, Date.valueOf(aluno.getDataMatricula()));
			
			statement.executeUpdate();
			
			connection.close();
			
			//Indicando que o aluno foi matriculado
			System.out.println("Aluno efetivamente matriculado na instituição.");
			
		}
		catch (Exception e){
			System.out.println("\nNão foi possível matricular o aluno. Revise os dados e tente novamente.");
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
		
		
	}

}
