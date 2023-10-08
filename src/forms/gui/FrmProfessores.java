package forms.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrmProfessores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel ctpProfessores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmProfessores frame = new FrmProfessores();
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
	public FrmProfessores() {
		setTitle("Professores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ctpProfessores = new JPanel();
		ctpProfessores.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ctpProfessores);
		ctpProfessores.setLayout(null);
	}

}
