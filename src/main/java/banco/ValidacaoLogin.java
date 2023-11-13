package banco;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

public class ValidacaoLogin extends Conexao_bd{
	
	private String login , senha;
		
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.login = senha;
	}
	
	public boolean validarLogin(String login, String senha) {
	String sql = "SELECT * FROM tbl_usuario WHERE nome_usuario = '" + login + "' AND senha_usuario =" + "'"+ senha+"';";        
       
        try {
		if(super.executarConsulta(sql) != null) {
		  return true;
		}else {
		  return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
    }

}
