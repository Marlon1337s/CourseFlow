package entidades;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import banco.Conexao_bd;


public class Curso {
	public int codigoCurso;
    public String nomeCurso, conteudoProgramatico, cargaHoraria;
    public double valorMensalidade;
    public String tabela = "tbl_cursos";
    Conexao_bd objConexao = new Conexao_bd();

    

 
}
