package forms.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmEsqueceuSenha extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSenhaTemp;
	private JPasswordField pwdNovaSenha;
	private JPasswordField pwdConfirma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmEsqueceuSenha frame = new FrmEsqueceuSenha();
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
	public FrmEsqueceuSenha() {
		setTitle("Resetar a senha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAviso = new JLabel("ATENÇÃO: FOI ENVIADO PARA SEU E-MAIL UMA SENHA TEMPORÁRIA.");
		lblAviso.setForeground(new Color(139, 0, 0));
		lblAviso.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAviso.setLabelFor(this);
		lblAviso.setBounds(22, 11, 387, 35);
		contentPane.add(lblAviso);
		
		JLabel lblSenhaTemp = new JLabel("SENHA TEMPORÁRIA:");
		lblSenhaTemp.setBounds(162, 57, 171, 14);
		contentPane.add(lblSenhaTemp);
		
		txtSenhaTemp = new JTextField();
		txtSenhaTemp.setBounds(98, 82, 235, 20);
		contentPane.add(txtSenhaTemp);
		txtSenhaTemp.setColumns(10);
		
		JLabel lblNovaSenha = new JLabel("NOVA SENHA:");
		lblNovaSenha.setBounds(180, 135, 153, 14);
		contentPane.add(lblNovaSenha);
		
		pwdNovaSenha = new JPasswordField();
		pwdNovaSenha.setBounds(98, 165, 235, 20);
		contentPane.add(pwdNovaSenha);
		
		JLabel lblConfirma = new JLabel("CONFIRME A SENHA:");
		lblConfirma.setBounds(162, 208, 171, 14);
		contentPane.add(lblConfirma);
		
		pwdConfirma = new JPasswordField();
		pwdConfirma.setBounds(98, 236, 235, 20);
		contentPane.add(pwdConfirma);
		
		JButton btnSalvar = new JButton("SALVAR E VOLTAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(() -> {
					FrmLogin frmLogin = new FrmLogin();
		            frmLogin.setVisible(true);
		            setVisible(false);
		        });
			}
		});
		btnSalvar.setHorizontalAlignment(SwingConstants.LEADING);
		btnSalvar.setBounds(71, 285, 142, 35);
		contentPane.add(btnSalvar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(() -> {
					FrmLogin frmLogin = new FrmLogin();
		            frmLogin.setVisible(true);
		            setVisible(false);
		        });
			}
		});
		btnCancelar.setBounds(230, 285, 121, 35);
		contentPane.add(btnCancelar);
	}

}
