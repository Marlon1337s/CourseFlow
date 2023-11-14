package program;

import java.sql.SQLException;

//import java.sql.Date;
//import java.time.LocalDate;

import entidades.Turma;

public class Main {

	public static void main(String[] args) {
		
		Turma turma = new Turma();
		
		turma.setCodTurma(3);
			
		
		try {
			turma.turmaConsulta();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		System.out.println(turma.toString());
 }
}