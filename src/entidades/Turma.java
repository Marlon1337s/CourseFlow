package entidades;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import banco.Conexao_bd;

public class Turma extends Conexao_bd {
	
	private Integer codTurma, codProfessor, codCurso;
	private String idTurma, turnoTurma, horarioAulas, status ;
	private Date dataInicio, dataTermino;
		
	public Turma() {}
	
	public Turma(int codTurma, int codProf, int codCurso, String idTurma, String turnoTurma, String horarioAula, String status, Date inicio, Date termino) {
		this.codTurma = codTurma;
		this.codProfessor = codProf;
		this.codCurso = codCurso;
		this.idTurma = idTurma;
		this.turnoTurma = turnoTurma;
		this.horarioAulas = horarioAula;
		this.status = status;
		this.dataInicio = inicio;
		this.dataTermino = termino;
	}

	public Integer getCodTurma() {
		return codTurma;
	}

	public void setCodTurma(Integer codTurma) {
		this.codTurma = codTurma;
	}

	public Integer getCodProfessor() {
		return codProfessor;
	}

	public void setCodProfessor(Integer codProfessor) {
		this.codProfessor = codProfessor;
	}

	public Integer getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(Integer codCurso) {
		this.codCurso = codCurso;
	}

	public String getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(String idTurma) {
		this.idTurma = idTurma;
	}

	public String getTurnoTurma() {
		return turnoTurma;
	}

	public void setTurnoTurma(String turnoTurma) {
		this.turnoTurma = turnoTurma;
	}

	public String getHorarioAulas() {
		return horarioAulas;
	}

	public void setHorarioAulas(String horarioAulas) {
		this.horarioAulas = horarioAulas;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
 
	public void setTurma(int codTurma, int codProf, int codCurso, String idTurma, String turnoTurma, String horarioAula, String status, Date inicio, Date termino) {
		setCodTurma(codTurma);
		setCodProfessor(codProf);
		setCodCurso(codCurso);
		setIdTurma(idTurma);
		setTurnoTurma(turnoTurma);
		setHorarioAulas(horarioAula);
		setStatus(status);
		setDataInicio(inicio);
		setDataTermino(termino);
	}
	
	public boolean turmaCadastrar() {
		String sql = "INSERT INTO tbl_Turma (id_turma, professor_turma, curso_turma, data_inicio_turma, data_termino_turma, turno_turma, horario_aulas, status_turma) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			conectar();
            try (PreparedStatement inserir = conexao.prepareStatement(sql)) {
            	inserir.setString(1, idTurma);
            	inserir.setInt(2, codProfessor);
            	inserir.setInt(3, codCurso);
            	inserir.setDate(4, new java.sql.Date(dataInicio.getTime()));
            	inserir.setDate(5, new java.sql.Date(dataTermino.getTime()));
            	inserir.setString(6, turnoTurma);
            	inserir.setString(7, horarioAulas);
            	inserir.setString(8, status);
                
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
	
	public boolean turmaAlterar() {
		String sql = "UPDATE tbl_Turma SET id_turma = ?, professor_turma = ?, curso_turma = ?, data_inicio_turma = ?, data_termino_turma = ?, turno_turma = ?, horario_aulas = ?, status_turma = ?  WHERE cod_interno = ?";
		
		try {
			conectar();
            try (PreparedStatement alterar = conexao.prepareStatement(sql)) {
            	alterar.setString(1, idTurma);
            	alterar.setInt(2, codProfessor);
            	alterar.setInt(3, codCurso);
            	alterar.setDate(4, new java.sql.Date(dataInicio.getTime()));
            	alterar.setDate(5, new java.sql.Date(dataTermino.getTime()));
            	alterar.setString(6, turnoTurma);
            	alterar.setString(7, horarioAulas);
            	alterar.setString(8, status);
            	alterar.setInt(9, codTurma);
                
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
	
	public boolean turmaDeletar() {
	    String sql = "DELETE FROM tbl_Turma WHERE cod_interno = ?";
	    
	    try {
	        conectar();
	        try (PreparedStatement deletar = conexao.prepareStatement(sql)) {
	            deletar.setInt(1, codTurma);
	            
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
	
	public ResultSet turmaConsulta() throws SQLException {
        final String sql = "SELECT id_turma, professor_turma, curso_turma, data_inicio_turma, data_termino_turma, turno_turma, horario_aulas, status_turma FROM tbl_turma WHERE cod_interno";
        try {
            conectar();
            try (PreparedStatement consulta = conexao.prepareStatement(sql)) {
            	 consulta.setInt(1, codTurma);

                try (ResultSet turma = consulta.executeQuery()) {
                    while (turma.next()) {
                    	//codTurma = turma.getInt("cod_interno");
                    	codProfessor = turma.getInt("professor_turma");
                    	codCurso = turma.getInt("curso_turma");
                    	idTurma = turma.getString("id_turma");
                    	turnoTurma = turma.getString("turno_turma");
                    	horarioAulas = turma.getString("horario_aulas");
                    	status = turma.getString("status_turma");
                    	dataInicio = turma.getDate("data_inicio_turma");
                    	dataTermino = turma.getDate("data_termino_turma");
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
		return "Turma [codTurma=" + codTurma + ", codProfessor=" + codProfessor + ", codCurso=" + codCurso
				+ ", idTurma=" + idTurma + ", turnoTurma=" + turnoTurma + ", horarioAulas=" + horarioAulas + ", status="
				+ status + ", dataInicio=" + dataInicio + ", dataTermino=" + dataTermino + "]";
	}

}
