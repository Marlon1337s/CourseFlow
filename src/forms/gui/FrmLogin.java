package forms.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
//import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class FrmLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel CtpLogin;
	private JTextField txtUsuario;
	private JPasswordField pwdSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmLogin frame = new FrmLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmLogin() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 274, 295);
		CtpLogin = new JPanel();
		CtpLogin.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(CtpLogin);
		CtpLogin.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(26, 64, 191, 20);
		CtpLogin.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblEntrar = new JLabel("ENTRAR");
		lblEntrar.setBounds(98, 11, 46, 14);
		CtpLogin.add(lblEntrar);
		
		JLabel lblUsuario = new JLabel("USUÁRIO:");
		lblUsuario.setBounds(94, 39, 55, 14);
		CtpLogin.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setBounds(98, 105, 46, 14);
		CtpLogin.add(lblSenha);
		
		pwdSenha = new JPasswordField();
		pwdSenha.setBounds(26, 143, 191, 20);
		CtpLogin.add(pwdSenha);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(() -> {
					FrmPrincipal frmPrincipal = new FrmPrincipal();
		            frmPrincipal.setVisible(true);
		            setVisible(false);
		        });
			}
		});
		btnEntrar.setBounds(77, 185, 89, 23);
		CtpLogin.add(btnEntrar);
		
		Button btnEsqueceuSenha = new Button("Esqueceu a senha?");
		btnEsqueceuSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(() -> {
					FrmEsqueceuSenha frmResetaSenha = new FrmEsqueceuSenha();
		            frmResetaSenha.setVisible(true);
		        });
			}
		});
		btnEsqueceuSenha.setBounds(10, 226, 123, 22);
		CtpLogin.add(btnEsqueceuSenha);
		
		
	}
}
