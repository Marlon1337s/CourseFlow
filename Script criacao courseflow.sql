-- Crie o banco de dados 'courseflow' se ele não existir
CREATE DATABASE IF NOT EXISTS courseflow default character set utf8
default collate utf8_general_ci;

-- Use o banco de dados 'courseflow'
USE courseflow;

-- Crie a tabela 'tbl_usuario'
CREATE TABLE IF NOT EXISTS tbl_usuario (
    id_usuario INT AUTO_INCREMENT, -- Chave primária gerada automaticamente
    nome_usuario VARCHAR(50) UNIQUE, -- Chave única
    senha_usuario VARCHAR(50),
    email VARCHAR(255),
    data_cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Data de cadastro gerada automaticamente
    PRIMARY KEY (id_usuario)
)default charset = utf8 ENGINE = innodb;

-- Crie a tabela 'tbl_aluno'
CREATE TABLE IF NOT EXISTS tbl_aluno (
    cod_aluno INT AUTO_INCREMENT, -- Chave primária gerada automaticamente
    nome_aluno VARCHAR(50),
    cpf_aluno VARCHAR(11) UNIQUE, -- Chave única para CPF
    data_nascimento_aluno DATE,
    genero_aluno VARCHAR(10),
    telefone_aluno VARCHAR(20),
    email_aluno VARCHAR(255),
    cep_aluno VARCHAR(10),
    status_aluno VARCHAR(20),
    data_cadastro_aluno TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Data de cadastro gerada automaticamente
    PRIMARY KEY (cod_aluno)
)default charset = utf8 ENGINE = innodb;

-- Crie a tabela 'tbl_professor'
CREATE TABLE IF NOT EXISTS tbl_professor (
    cod_professor INT AUTO_INCREMENT, -- Chave primária gerada automaticamente
    nome_professor VARCHAR(50),
    cpf_professor VARCHAR(11) UNIQUE, -- Chave única para CPF
    data_nascimento_professor DATE,
    genero_professor VARCHAR(10),
    email_professor VARCHAR(255),
    telefone_professor VARCHAR(20),
    cep_professor VARCHAR(10),
    salario_professor DECIMAL(10, 2),
    status_professor VARCHAR(20),
    data_cadastro_professor TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Data de cadastro gerada automaticamente
    PRIMARY KEY (cod_professor)
)default charset = utf8 ENGINE = innodb;

-- Crie a tabela 'tbl_curso'
CREATE TABLE IF NOT EXISTS tbl_curso (
    cod_curso INT AUTO_INCREMENT, -- Chave primária gerada automaticamente
    nome_curso VARCHAR(255),
    conteudo_curso TEXT,
    carga_horaria_curso INT,
    valor_mensalidade_curso DECIMAL(10, 2),
    data_cadastro_curso TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Data de cadastro gerada automaticamente
    status_curso VARCHAR(20),
    PRIMARY KEY (cod_curso)
)default charset = utf8 ENGINE = innodb;

-- Crie a tabela 'tbl_turma'
CREATE TABLE IF NOT EXISTS tbl_turma (
    cod_interno INT AUTO_INCREMENT, -- Chave primária gerada automaticamente
    id_turma VARCHAR(20) UNIQUE, -- Chave única para ID da turma
    professor_turma INT, -- Chave estrangeira referenciando cod_professor da tbl_professor
    curso_turma INT, -- Chave estrangeira referenciando cod_curso da tbl_curso
    data_inicio_turma DATE,
    data_termino_turma DATE,
    turno_turma VARCHAR(20),
    horario_aulas VARCHAR(255),
    data_cadastro_turma TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Data de cadastro gerada automaticamente
    status_turma VARCHAR(20),
    PRIMARY KEY (cod_interno),
    FOREIGN KEY (professor_turma) REFERENCES tbl_professor (cod_professor),
    FOREIGN KEY (curso_turma) REFERENCES tbl_curso (cod_curso)
)default charset = utf8 ENGINE = innodb;

-- Crie a tabela 'tbl_aluno_turma'
CREATE TABLE IF NOT EXISTS tbl_aluno_turma (
    cod_interno INT AUTO_INCREMENT,
    turma INT, -- Chave estrangeira referenciando id_turma da tbl_turma
    aluno INT, -- Chave estrangeira referenciando cod_aluno da tbl_aluno
    data_cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Data de cadastro gerada automaticamente
    status_aluno_turma VARCHAR(20),
    PRIMARY KEY (cod_interno),
    FOREIGN KEY (turma) REFERENCES tbl_turma (cod_interno),
    FOREIGN KEY (aluno) REFERENCES tbl_aluno (cod_aluno)
)default charset = utf8 ENGINE = innodb;

ALTER TABLE tbl_aluno
ADD COLUMN turma_aluno VARCHAR(20), 
ADD CONSTRAINT fk_turma_aluno
FOREIGN KEY (turma_aluno) REFERENCES tbl_turma(id_turma);

select * from tbl_professor;