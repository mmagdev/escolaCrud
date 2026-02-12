
--Criando um script para criação da tabela de alunos no banco de dados

CREATE TABLE alunos (

id_matricula			UUID			PRIMARY KEY,
nome					VARCHAR(50)		NOT NULL,
nome_mae				VARCHAR(50)		NOT NULL,
curso					VARCHAR(30)		NOT NULL,
telefone				VARCHAR(20)		NOT NULL,
data_matricula			TIMESTAMP		NOT NULL


);