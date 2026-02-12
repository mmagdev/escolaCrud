package factories;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Classe que realiza a conexão com o banco de dados
 * bd_escolaCrud
 */

public class AlunoFactory {
	
	//Método que abre conexão de dados com o PostgreSQL
	
	public Connection obterConexao() {
		
		try {
			
			//Variáveis para conexão
			var host = "jdbc:postgresql:5432/bd_escolaCrud";
			var user = "postgres";
			var pass = "coti";
			
			//Retornar a conexão com o banco de dados
			return DriverManager.getConnection(host, user, pass);
		}
		catch (Exception e){
			System.out.println("\nFalha ao conectar com o PostgreSQL: " + e.getMessage());
			return null;
		}
		
		
		
		
		
	}

}
