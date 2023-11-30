package Back.Curse.Entidades;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Back.Curse.ValidarBanco.Conexao_bd;

public class Aluno extends Conexao_bd {
	private Integer codAluno, idTurmaAluno;
	private String nomeAluno, cpfAluno, generoAluno, emailAluno, telefoneAluno, cepAluno, statusAluno;
	private Date dataNascimentoAluno;
	
	public Aluno() {
		
	}
	
	public Aluno(int codigo, String nome, String cpf, String genero, String email, String telefone, String cep, String status, Date nascimento, int turma) {
		this.codAluno = codigo;
		this.idTurmaAluno = turma;
		this.nomeAluno = nome;
		this.cpfAluno = cpf;
		this.generoAluno = genero;
		this.emailAluno = email;
		this.telefoneAluno = telefone;
		this.cepAluno = cep;
		this.statusAluno = status;
		this.dataNascimentoAluno = nascimento;
	}

	public Integer getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(Integer codAluno) {
		this.codAluno = codAluno;
	}
	
	public Integer getIdTurmaAluno() {
		return idTurmaAluno;
	}

	public void setIdTurmaAluno(Integer idTurmaAluno) {
		this.idTurmaAluno = idTurmaAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getCpfAluno() {
		return cpfAluno;
	}

	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	public String getGeneroAluno() {
		return generoAluno;
	}

	public void setGeneroAluno(String generoAluno) {
		this.generoAluno = generoAluno;
	}

	public String getEmailAluno() {
		return emailAluno;
	}

	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}

	public String getTelefoneAluno() {
		return telefoneAluno;
	}

	public void setTelefoneAluno(String telefoneAluno) {
		this.telefoneAluno = telefoneAluno;
	}

	public String getCepAluno() {
		return cepAluno;
	}

	public void setCepAluno(String cepAluno) {
		this.cepAluno = cepAluno;
	}

	public String getStatusAluno() {
		return statusAluno;
	}

	public void setStatusAluno(String statusAluno) {
		this.statusAluno = statusAluno;
	}

	public Date getDataNascimentoAluno() {
		return dataNascimentoAluno;
	}

	public void setDataNascimentoAluno(Date dataNascimentoAluno) {
		this.dataNascimentoAluno = dataNascimentoAluno;
	}
	
	public void setAluno(int codigo, String nome, String cpf, String genero, String email, String telefone, String cep, String status, Date nascimento, int turma) {
		setCodAluno(codigo);
		setIdTurmaAluno(turma);
		setNomeAluno(nome);
		setCpfAluno(cpf);
		setGeneroAluno(genero);
		setEmailAluno(email);
		setTelefoneAluno(telefone);
		setCepAluno(cep);
		setStatusAluno(status);
		setDataNascimentoAluno(nascimento);
		setIdTurmaAluno(turma);
	}

	public boolean alunoCadastrar() {
		String sql = "INSERT INTO tbl_aluno (nome_aluno, cpf_aluno, data_nascimento_aluno, genero_aluno, telefone_aluno, email_aluno, cep_aluno, status_aluno) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			conectar();
            try (PreparedStatement inserir = conexao.prepareStatement(sql)) {
            	inserir.setString(1, nomeAluno);
            	inserir.setString(2, cpfAluno);
            	inserir.setDate(3, new java.sql.Date(dataNascimentoAluno.getTime()));
            	inserir.setString(4, generoAluno);
            	inserir.setString(5, emailAluno);
            	inserir.setString(6, telefoneAluno);
            	inserir.setString(7, cepAluno);
            	inserir.setString(8, statusAluno);
            	//inserir.setInt(9, idTurmaAluno);
                
                int rowsAffected = inserir.executeUpdate();

                return rowsAffected > 0;
            } finally {
                if (conexao != null && !conexao.isClosed()) {
                    conexao.close();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
	}
	
	public boolean alunoAlterar() {
		String sql = "UPDATE tbl_aluno SET nome_aluno = ?, cpf_aluno = ?, data_nascimento_aluno = ?, genero_aluno = ?, telefone_aluno = ?, email_aluno = ?, cep_aluno = ?, status_aluno = ? WHERE cod_aluno = ?";
		
		try {
			conectar();
            try (PreparedStatement alterar = conexao.prepareStatement(sql)) {
            	alterar.setString(1, nomeAluno);
            	alterar.setString(2, cpfAluno);
            	alterar.setDate(3, new java.sql.Date(dataNascimentoAluno.getTime()));
            	alterar.setString(4, generoAluno);
            	alterar.setString(5, emailAluno);
            	alterar.setString(6, telefoneAluno);
            	alterar.setString(7, cepAluno);
            	alterar.setString(8, statusAluno);
            	//alterar.setInt(9, idTurmaAluno);
            	alterar.setInt(9, codAluno);
                
                int rowsAffected = alterar.executeUpdate();

                return rowsAffected > 0;
            } finally {
                if (conexao != null && !conexao.isClosed()) {
                    conexao.close();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
	}
	
	public boolean alunoDeletar() {
	    String sql = "DELETE FROM tbl_aluno WHERE cod_aluno = ?";
	    
	    try {
	        conectar();
	        try (PreparedStatement deletar = conexao.prepareStatement(sql)) {
	            deletar.setInt(1, codAluno);
	            
	            int rowsAffected = deletar.executeUpdate();
	            
	            return rowsAffected > 0;
	        } finally {
	            if (conexao != null && !conexao.isClosed()) {
	                conexao.close();
	            }
	        }
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	        return false;
	    }
	}
	
	public ResultSet alunoConsulta(){
        final String SQL = "SELECT cod_aluno, nome_aluno, cpf_aluno, data_nascimento_aluno, genero_aluno, telefone_aluno, email_aluno, cep_aluno, status_aluno, data_cadastro_aluno FROM tbl_aluno;";
        try{
        	conectar();
        	PreparedStatement consulta = conexao.prepareStatement(SQL);
            ResultSet rs = consulta.executeQuery();
            System.out.println("Consulta realizada com sucesso!");
            return rs;
        }catch(SQLException e){
            System.out.println("Erro ao consultar dados na tabela: " + e.getMessage());
            return null;
        }
    }
	
	public ResultSet alunoConsultaEspecifica() throws SQLException {
        final String sql = "SELECT * FROM tbl_aluno WHERE cod_aluno = " + codAluno + ";";

        try {
            conectar();
            try (PreparedStatement consulta = conexao.prepareStatement(sql)) {

                try (ResultSet aluno = consulta.executeQuery()) {
                    while (aluno.next()) {
                    	codAluno = aluno.getInt("cod_aluno");
                    	nomeAluno = aluno.getString("nome_aluno");
                    	cpfAluno = aluno.getString("cpf_aluno");
                    	dataNascimentoAluno = aluno.getDate("data_nascimento_aluno");
                    	generoAluno = aluno.getString("genero_aluno");
                    	emailAluno = aluno.getString("email_aluno");
                    	telefoneAluno = aluno.getString("telefone_aluno");
                    	cepAluno = aluno.getString("cep_aluno");                        
                    	statusAluno = aluno.getString("status_aluno");

                    }
                }
            }
        } catch (SQLException ex) {
            throw new SQLException("Não foi possível executar a CONSULTA solicitada.\n" + ex.getMessage());
        }

        return null; 
    }

	
	@Override
	public String toString() {
		return "Aluno [codAluno=" + codAluno + ", idTurmaAluno=" + idTurmaAluno + ", nomeAluno=" + nomeAluno
				+ ", cpfAluno=" + cpfAluno + ", generoAluno=" + generoAluno + ", emailAluno=" + emailAluno
				+ ", telefoneAluno=" + telefoneAluno + ", cepAluno=" + cepAluno + ", statusAluno=" + statusAluno
				+ ", dataNascimentoAluno=" + dataNascimentoAluno + "]";
	}

}