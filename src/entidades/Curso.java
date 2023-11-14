package entidades;

//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import banco.Conexao_bd;

public class Curso extends Conexao_bd {
	
	private Integer codCurso;
	private String nomeCurso,conteudo , status;
	private Float valorMensalidade, cargaHoraria;
	
	public Curso() {
	}
	
	public Curso(String nome, String conteudo, String status, Float cargaHoraria, Float valorMensalidade ) {
		this.nomeCurso = nome;
		this.conteudo = conteudo;
		this.status = status;
		this.cargaHoraria = cargaHoraria;
		this.valorMensalidade = valorMensalidade;
	}
		
	
	public Integer getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getConteudo () {
		return conteudo;
	}
	
	public void setConteudo (String conteudo) {
		this.conteudo = conteudo;
	}
	
	public Float getValorMensalidade() {
		return valorMensalidade;
	}
	
	public void setValorMensalidade (Float valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	
	public Float getCargaHoraria () {
		return cargaHoraria;
	}

	public void setCargaHoraria (Float cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	public void setCurso(Integer codCurso, String nome, String conteudo, String status, Float cargaHoraria, Float valorMensalidade) {
		setCodCurso(codCurso);
		setNomeCurso(nome);
		setConteudo(conteudo);
		setStatus(status);
		setCargaHoraria(cargaHoraria);
		}

	public boolean cursoCadastrar() {
		String sql = "INSERT INTO tbl_curso (nome_curso, conteudo, cargaHoraria, valorMensalidade, status) VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			conectar();
            try (PreparedStatement inserir = conexao.prepareStatement(sql)) {
            	inserir.setString(1, nomeCurso);
            	inserir.setString(2, conteudo);
            	inserir.setString(3, status);
            	inserir.setFloat(4, cargaHoraria);
            	inserir.setFloat(5, valorMensalidade);
                
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
	
	public boolean cursoAlterar() {
		String sql = "UPDATE tbl_curso SET nome_curso = ?, conteudo = ?, status = ?, cargaHoraria = ?, valorMensalidade = ?  WHERE cod_curso = ?";
		
		try {
			conectar();
            try (PreparedStatement alterar = conexao.prepareStatement(sql)) {
            	alterar.setString(1, nomeCurso);
            	alterar.setString(2, conteudo);
            	alterar.setString(3, status);
            	alterar.setFloat(4, cargaHoraria);
            	alterar.setFloat(5, valorMensalidade);
            	alterar.setInt(6, codCurso);
                
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
	
	public boolean cursoDeletar() {
	    String sql = "DELETE FROM tbl_curso WHERE cod_curso = ?";
	    
	    try {
	        conectar();
	        try (PreparedStatement deletar = conexao.prepareStatement(sql)) {
	            deletar.setInt(1, codCurso);
	            
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
	
	public ResultSet cursoConsulta() throws SQLException {
        final String sql = "SELECT cod_curso, nome_curso, conteudo, status, cargaHoraria, valorMensalidade FROM tbl_curso";

        try {
            conectar();
            try (PreparedStatement consulta = conexao.prepareStatement(sql)) {

                try (ResultSet curso = consulta.executeQuery()) {
                    while (curso.next()) {
                        codCurso = curso.getInt("cod_curso");
                        nomeCurso = curso.getString("nome_curso");
                        conteudo = curso.getString("conteudo");
                        status = curso.getString("status");
                        cargaHoraria = curso.getFloat("cargaHoraria");
                        valorMensalidade = curso.getFloat("valorMensalidade");
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
		return "Curso [codCurso=" + codCurso + ", conteudo=" + conteudo + ", status=" + status + ", cargaHoraria=" + cargaHoraria + ", valorMensalidade=" + valorMensalidade + "]";
	}

}
