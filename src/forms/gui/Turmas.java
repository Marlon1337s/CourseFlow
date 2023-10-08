package forms.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Turmas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel ctpTurmas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Turmas frame = new Turmas();
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
	public Turmas() {
		setTitle("Turmas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ctpTurmas = new JPanel();
		ctpTurmas.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ctpTurmas);
		ctpTurmas.setLayout(null);
	}

}
