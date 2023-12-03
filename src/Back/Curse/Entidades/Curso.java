package Back.Curse.Entidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Back.Curse.ValidarBanco.Conexao_bd;

public class Curso extends Conexao_bd {
	
	private Integer codCurso;
	private String nomeCurso, conteudo, status;
	private Float valorMensalidade, cargaHoraria;
	
	public Curso() {
	}
	
	public Curso(String nome, String conteudo, String status, Float cargaHoraria, Float valorMensalidade) {
		this.nomeCurso = nome;
		this.conteudo = conteudo;
		this.status = status;
		this.cargaHoraria = cargaHoraria;
		this.valorMensalidade = valorMensalidade;
	}
	
	public Integer getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(Integer codCurso) {
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
	
	public String getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public Float getValorMensalidade() {
		return valorMensalidade;
	}
	
	public void setValorMensalidade(Float valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	
	public Float getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Float cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public void setCurso(Integer codCurso, String nome, String conteudo, String status, Float cargaHoraria, Float valorMensalidade) {
		setCodCurso(codCurso);
		setNomeCurso(nome);
		setConteudo(conteudo);
		setStatus(status);
		setCargaHoraria(cargaHoraria);
		setValorMensalidade(valorMensalidade);
	}

	public boolean cursoCadastrar() {
		String sql = "INSERT INTO tbl_curso (nome_curso, conteudo_curso, carga_horaria_curso, valor_mensalidade_curso, status_curso) VALUES (?, ?, ?, ?, ?)";
		
		try {
			conectar();
            try (PreparedStatement inserir = conexao.prepareStatement(sql)) {
            	inserir.setString(1, nomeCurso);
            	inserir.setString(2, conteudo);
            	inserir.setFloat(3, cargaHoraria);
            	inserir.setFloat(4, valorMensalidade);
            	inserir.setString(5, status);
                
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
		String sql = "UPDATE tbl_curso SET nome_curso = ?, conteudo_curso = ?, carga_horaria_curso = ?, valor_mensalidade_curso = ?, status_curso = ?  WHERE cod_curso = ?";
		
		try {
			conectar();
            try (PreparedStatement alterar = conexao.prepareStatement(sql)) {
            	alterar.setString(1, nomeCurso);
            	alterar.setString(2, conteudo);
            	alterar.setFloat(3, cargaHoraria);
            	alterar.setFloat(4, valorMensalidade);
            	alterar.setString(5, status);
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
	
	public ResultSet cursoConsulta(){
        final String SQL = "SELECT cod_curso, nome_curso, conteudo_curso, carga_horaria_curso, valor_mensalidade_curso, status_curso, data_cadastro_curso FROM tbl_curso";
        try {
            conectar();
            PreparedStatement consulta = conexao.prepareStatement(SQL);
            return consulta.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
	
	public ResultSet cursoConsultaEspecifica() throws SQLException {
        final String sql = "SELECT * FROM tbl_curso WHERE cod_curso = " + codCurso + ";";

        try {
            conectar();
            try (PreparedStatement consulta = conexao.prepareStatement(sql)) {

                try (ResultSet curso = consulta.executeQuery()) {
                    while (curso.next()) {
                        codCurso = curso.getInt("cod_curso");
                        nomeCurso = curso.getString("nome_curso");
                        conteudo = curso.getString("conteudo_curso");
                        status = curso.getString("status_curso");
                        cargaHoraria = curso.getFloat("carga_horaria_curso");
                        valorMensalidade = curso.getFloat("valor_mensalidade_curso");
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
		return "Curso [codCurso=" + codCurso + ", nomeCurso=" + nomeCurso + ", conteudo=" + conteudo + ", status=" + status + ", cargaHoraria=" + cargaHoraria + ", valorMensalidade=" + valorMensalidade + "]";
	}

}
