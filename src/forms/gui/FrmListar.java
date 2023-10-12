package forms.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;


public class FrmListar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel ctpListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmListar frame = new FrmListar();
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
	public FrmListar() {
		setBackground(new Color(128, 128, 128));
		setTitle("LISTAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 476);
		ctpListar = new JPanel();
		ctpListar.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ctpListar);
		ctpListar.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 434, 38);
		ctpListar.add(panel);
		panel.setLayout(null);
		
		JCheckBox ckbImprimeInativo = new JCheckBox("Registros Inativos");
		ckbImprimeInativo.setBounds(6, 7, 139, 23);
		panel.add(ckbImprimeInativo);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(335, 7, 89, 23);
		panel.add(btnListar);
		
		JCheckBox ckb = new JCheckBox("Valores");
		ckb.setBounds(143, 7, 75, 23);
		panel.add(ckb);
	}
}
