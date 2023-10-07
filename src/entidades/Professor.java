package entidades;
import java.sql.ResultSet;
import java.sql.SQLException;

import banco.Conexao_bd;


public class Professor {
	public int codigoProfessor;
    public String nomeCompleto, telefone;
    public double valorHoraAula;
    public String tabela = "tbl_professores";
    Conexao_bd objConexao = new Conexao_bd();

    public void cadastrarProfessor() throws SQLException {
        String inserir = String.format("INSERT INTO %s VALUES (null, ?, ?, ?);", tabela);

        try {
            objConexao.conectar();
            objConexao.setPreparedStatement(objConexao.getConexao().prepareStatement(inserir));
            objConexao.getPreparedStatement().setString(1, nomeCompleto);
            objConexao.getPreparedStatement().setDouble(2, valorHoraAula);
            objConexao.getPreparedStatement().setString(3, telefone);
            objConexao.getPreparedStatement().executeUpdate();
        } finally {
            objConexao.desconectar();
        }
    }

    public void alterarProfessor() throws SQLException {
        String alterar = String.format("UPDATE %s SET nome = ?, valorHoraAula = ?, telefone = ? WHERE codigo = ?;", tabela);

        try {
            objConexao.conectar();
            objConexao.setPreparedStatement(objConexao.getConexao().prepareStatement(alterar));
            objConexao.getPreparedStatement().setString(1, nomeCompleto);
            objConexao.getPreparedStatement().setDouble(2, valorHoraAula);
            objConexao.getPreparedStatement().setString(3, telefone);
            objConexao.getPreparedStatement().setInt(4, codigoProfessor);
            objConexao.getPreparedStatement().executeUpdate();
        } finally {
            objConexao.desconectar();
        }
    }

    public void excluirProfessor() throws SQLException {
        String excluir = String.format("DELETE FROM %s WHERE codigo = ?;", tabela);

        try {
            objConexao.conectar();
            objConexao.setPreparedStatement(objConexao.getConexao().prepareStatement(excluir));
            objConexao.getPreparedStatement().setInt(1, codigoProfessor);
            objConexao.getPreparedStatement().executeUpdate();
        } finally {
            objConexao.desconectar();
        }
    }

    public ResultSet listarProfessores() throws SQLException {
        String listar = String.format("SELECT * FROM %s ORDER BY codigo;", tabela);
        return objConexao.executarConsulta(listar);
    }


}
