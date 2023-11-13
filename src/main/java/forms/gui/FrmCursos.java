package forms.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrmCursos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel ctpCursos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCursos frame = new FrmCursos();
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
	public FrmCursos() {
		setTitle("Cursos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ctpCursos = new JPanel();
		ctpCursos.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ctpCursos);
		ctpCursos.setLayout(null);
	}

}
