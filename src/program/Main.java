package program;

import java.sql.Date;
//import java.sql.SQLException;
import java.time.LocalDate;

import entidades.Professor;

public class Main {

	public static void main(String[] args) {
		
		Professor prof = new Professor();
		
		int codigo = 5;
		
		String nomeProfessor = "Jose", cpfProfessor = "15447885446", generoProfessor = "M", emailProfessor = "a@a.com", telefoneProfessor = "36654875", cepProfessor = "35030258", statusProfessor = "A";
		Float salarioProfessor = (float) 2000;
		LocalDate data = LocalDate.of(2003, 10, 07);
		Date nascimento = Date.valueOf(data);
		
		
		
		prof.setProfessor(codigo, nomeProfessor, cpfProfessor, generoProfessor, emailProfessor, telefoneProfessor, cepProfessor, statusProfessor, nascimento, salarioProfessor);
		prof.profConsulta();
	
		
 }
}