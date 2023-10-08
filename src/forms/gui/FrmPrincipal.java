package forms.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Insets;

public class FrmPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel ctpPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
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
	public FrmPrincipal() {
		setTitle("COURSE FLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(1, 1, 1, 1));
		menuBar.setForeground(new Color(100, 149, 237));
		setJMenuBar(menuBar);
		
		JMenu menuAlunos = new JMenu("Alunos");
		menuBar.add(menuAlunos);
		
		JMenuItem AlunosCadastro = new JMenuItem("Cadastrar");
		menuAlunos.add(AlunosCadastro);
		
		JMenuItem AlunosAlterar = new JMenuItem("Alterar");
		menuAlunos.add(AlunosAlterar);
		
		JMenuItem AlunosExcluir = new JMenuItem("Excluir");
		menuAlunos.add(AlunosExcluir);
		
		JMenuItem AlunosListar = new JMenuItem("Listar");
		menuAlunos.add(AlunosListar);
		
		JMenu MenuCursos = new JMenu("Cursos");
		menuBar.add(MenuCursos);
		
		JMenuItem CursosCadastro = new JMenuItem("Cadastrar");
		MenuCursos.add(CursosCadastro);
		
		JMenuItem CursosAlterar = new JMenuItem("Alterar");
		MenuCursos.add(CursosAlterar);
		
		JMenuItem CursosExcluir = new JMenuItem("Excluir");
		MenuCursos.add(CursosExcluir);
		
		JMenuItem CursosListar = new JMenuItem("Listar");
		MenuCursos.add(CursosListar);
		
		JMenu MenuProfessores = new JMenu("Professores");
		menuBar.add(MenuProfessores);
		
		JMenuItem ProfsCadastro = new JMenuItem("Cadastrar");
		MenuProfessores.add(ProfsCadastro);
		
		JMenuItem ProfsAlterar = new JMenuItem("Alterar");
		MenuProfessores.add(ProfsAlterar);
		
		JMenuItem ProfsExcluir = new JMenuItem("Excluir");
		MenuProfessores.add(ProfsExcluir);
		
		JMenuItem ProfsListar = new JMenuItem("Listar");
		MenuProfessores.add(ProfsListar);
		
		JMenu MenuTurmas = new JMenu("Turmas");
		menuBar.add(MenuTurmas);
		
		JMenuItem TurmasCadastrar = new JMenuItem("Cadastrar");
		MenuTurmas.add(TurmasCadastrar);
		
		JMenuItem TurmasAlterar = new JMenuItem("Alterar");
		MenuTurmas.add(TurmasAlterar);
		
		JMenuItem TurmasExcluir = new JMenuItem("Excluir");
		MenuTurmas.add(TurmasExcluir);
		
		JMenuItem TurmasListar = new JMenuItem("Lsitar");
		MenuTurmas.add(TurmasListar);
		ctpPrincipal = new JPanel();
		ctpPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ctpPrincipal);
		ctpPrincipal.setLayout(null);
	}
}
