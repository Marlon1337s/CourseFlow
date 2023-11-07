package entidades;

import banco.Conexao_bd;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;


public class Professor extends Conexao_bd{
	private Integer codProfessor;
	private String nomeProfessor, cpfProfessor, generoProfessor, emailProfessor, telefoneProfessor, cepProfessor, statusProfessor;
	private Date dataNascimentoProfessor;
	private Float salarioProfessor;
		
	public Professor() {
	}
	
	public Professor(String nome, String cpf, String genero, String email, String telefone,String cep, String status, Date nascimento, float salario ) {
		this.nomeProfessor = nome;
		this.cpfProfessor = cpf;
		this.generoProfessor = genero;
		this.emailProfessor = email;
		this.telefoneProfessor = telefone; 
		this.cepProfessor = cep;
		this.statusProfessor = status;
		this.dataNascimentoProfessor = nascimento; 
		this.salarioProfessor = salario;
	}
		
	
	public Integer getCodProfessor() {
		return codProfessor;
	}

	public void setCodProfessor(int codProfessor) {
		this.codProfessor = codProfessor;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getCpfProfessor() {
		return cpfProfessor;
	}

	public void setCpfProfessor(String cpfProfessor) {
		this.cpfProfessor = cpfProfessor;
	}

	public String getGeneroProfessor() {
		return generoProfessor;
	}

	public void setGeneroProfessor(String generoProfessor) {
		this.generoProfessor = generoProfessor;
	}

	public String getEmailProfessor() {
		return emailProfessor;
	}

	public void setEmailProfessor(String emailProfessor) {
		this.emailProfessor = emailProfessor;
	}

	public String getTelefoneProfessor() {
		return telefoneProfessor;
	}

	public void setTelefoneProfessor(String telefoneProfessor) {
		this.telefoneProfessor = telefoneProfessor;
	}

	public String getCepProfessor() {
		return cepProfessor;
	}

	public void setCepProfessor(String cepProfessor) {
		this.cepProfessor = cepProfessor;
	}

	public String getStatusProfessor() {
		return statusProfessor;
	}

	public void setStatusProfessor(String statusProfessor) {
		this.statusProfessor = statusProfessor;
	}

	public Date getDataNascimentoProfessor() {
		return dataNascimentoProfessor;
	}

	public void setDataNascimentoProfessor(Date dataNascimentoProfessor) {
		this.dataNascimentoProfessor = dataNascimentoProfessor;
	}

	public Float getSalarioProfessor() {
		return salarioProfessor;
	}

	public void setSalarioProfessor(Float salarioProfessor) {
		this.salarioProfessor = salarioProfessor;
	}
	

	public void setProfessor(Integer codProfessor,String nome, String cpf, String genero, String email, String telefone,String cep, String status, Date nascimento, float salario ) {
		setCodProfessor(codProfessor);
		setNomeProfessor(nome);
		setCpfProfessor(cpf);
		setGeneroProfessor(genero);
		setEmailProfessor(email);
		setTelefoneProfessor(telefone);
		setCepProfessor(cep);
		setStatusProfessor(status);
		setDataNascimentoProfessor(nascimento);
		setSalarioProfessor(salario);
		}

	public boolean profCadastrar() {
		String sql = "INSERT INTO tbl_professor (nome_professor, cpf_professor, data_nascimento_professor, genero_professor, email_professor, telefone_professor, cep_professor, salario_professor, status_professor) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			conectar();
            try (PreparedStatement inserir = conexao.prepareStatement(sql)) {
            	inserir.setString(1, nomeProfessor);
            	inserir.setString(2, cpfProfessor);
            	inserir.setDate(3, new java.sql.Date(dataNascimentoProfessor.getTime()));
            	inserir.setString(4, generoProfessor);
            	inserir.setString(5, emailProfessor);
            	inserir.setString(6, telefoneProfessor);
            	inserir.setString(7, cepProfessor);
            	inserir.setFloat(8, salarioProfessor);
            	inserir.setString(9, statusProfessor);
                
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
	
	public boolean profAlterar() {
		String sql = "UPDATE tbl_professor SET nome_professor = ?, cpf_professor = ?, data_nascimento_professor = ?, genero_professor = ?, email_professor = ?, telefone_professor = ?, cep_professor = ?, salario_professor = ?, status_professor = ? WHERE cod_professor = ?";
		
		try {
			conectar();
            try (PreparedStatement alterar = conexao.prepareStatement(sql)) {
            	alterar.setString(1, nomeProfessor);
            	alterar.setString(2, cpfProfessor);
            	alterar.setDate(3, new java.sql.Date(dataNascimentoProfessor.getTime()));
            	alterar.setString(4, generoProfessor);
            	alterar.setString(5, emailProfessor);
            	alterar.setString(6, telefoneProfessor);
            	alterar.setString(7, cepProfessor);
            	alterar.setFloat(8, salarioProfessor);
            	alterar.setString(9, statusProfessor);
            	alterar.setInt(10, codProfessor);
                
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
	
	public boolean profDeletar() {
	    String sql = "DELETE FROM tbl_professor WHERE id_professor = ?";
	    
	    try {
	        conectar();
	        try (PreparedStatement deletar = conexao.prepareStatement(sql)) {
	            deletar.setInt(1, codProfessor);
	            
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

}
