package entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class Aluno {
	
	private UUID idMatricula;
	private String nome;
	private String nomeMae;
	private String curso;
	private String telefone;
	private LocalDateTime dataMatricula;
	
	
	public UUID getIdMatricula() {
		return idMatricula;
	}
	public void setIdMatricula(UUID idMatricula) {
		this.idMatricula = idMatricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public LocalDateTime getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(LocalDateTime dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	

}
