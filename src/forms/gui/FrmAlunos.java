package forms.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrmAlunos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel ctpAlunos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAlunos frame = new FrmAlunos();
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
	public FrmAlunos() {
		setTitle("Alunos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ctpAlunos = new JPanel();
		ctpAlunos.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ctpAlunos);
		ctpAlunos.setLayout(null);
	}

}
