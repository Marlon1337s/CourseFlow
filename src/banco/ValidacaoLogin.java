package banco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		
        String sql = "SELECT * FROM tbl_usuario WHERE login = ? AND senha = ?";
        
        try {
            ResultSet resultSet;
            conectar();
            try (PreparedStatement statement = conexao.prepareStatement(sql)) {
                statement.setString(1, login);
                statement.setString(2, senha);
                resultSet = statement.executeQuery();
                return resultSet.next(); 
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
