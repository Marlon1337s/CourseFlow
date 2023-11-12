package entidades;
import java.sql.ResultSet;
import java.sql.SQLException;

import banco.Conexao_bd;


public class Turmas {
	public int codigoTurma, professor, curso;
    public String horaInicio, horaTermino, dataInicio, dataTermino;
    public String tabela = "tbl_turmas";
    Conexao_bd objConexao = new Conexao_bd();

    public void cadastrarTurma() throws SQLException {
        String inserir = String.format("INSERT INTO %s VALUES (null, ?, ?, ?, ?, ?, ?);", tabela);

        try {
            objConexao.conectar();
            objConexao.setPreparedStatement(objConexao.getConexao().prepareStatement(inserir));
            objConexao.getPreparedStatement().setInt(1, curso);
            objConexao.getPreparedStatement().setString(2, dataInicio);
            objConexao.getPreparedStatement().setString(3, dataTermino);
            objConexao.getPreparedStatement().setString(4, horaInicio);
            objConexao.getPreparedStatement().setString(5, horaTermino);
            objConexao.getPreparedStatement().setInt(6, professor);
            objConexao.getPreparedStatement().executeUpdate();
        } finally {
            objConexao.desconectar();
        }
    }

    public void alterarTurma() throws SQLException {
        String alterar = String.format("UPDATE %s SET idCurso = ?, dataInicio = ?, dataTermino = ?, horaInicio = ?, horaTermino = ?, idProfessor = ? WHERE codigo = ?;", tabela);

        try {
            objConexao.conectar();
            objConexao.setPreparedStatement(objConexao.getConexao().prepareStatement(alterar));
            objConexao.getPreparedStatement().setInt(1, curso);
            objConexao.getPreparedStatement().setString(2, dataInicio);
            objConexao.getPreparedStatement().setString(3, dataTermino);
            objConexao.getPreparedStatement().setString(4, horaInicio);
            objConexao.getPreparedStatement().setString(5, horaTermino);
            objConexao.getPreparedStatement().setInt(6, professor);
            objConexao.getPreparedStatement().setInt(7, codigoTurma);
            objConexao.getPreparedStatement().executeUpdate();
        } finally {
            objConexao.desconectar();
        }
    }

    public void excluirTurma() throws SQLException {
        String excluir = String.format("DELETE FROM %s WHERE codigo = ?;", tabela);

        try {
            objConexao.conectar();
            objConexao.setPreparedStatement(objConexao.getConexao().prepareStatement(excluir));
            objConexao.getPreparedStatement().setInt(1, codigoTurma);
            objConexao.getPreparedStatement().executeUpdate();
        } finally {
            objConexao.desconectar();
        }
    }

    public ResultSet listarTurmas() throws SQLException {
        String listar = String.format("SELECT * FROM %s ORDER BY codigo;", tabela);
        return objConexao.executarConsulta(listar);
    }

}
