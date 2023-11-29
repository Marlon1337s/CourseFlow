package Back.Curse.Entidades;

import entidades.Professor;
import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Bruno H
 */
public class ProfessorTeste {
	
	LocalDate data = LocalDate.of(2003,10,07); 
	Date nascimento = Date.valueOf(data);
	
  @Test
  public void testProfCadastrar() {
    Professor professor = new Professor("John Doe", "123456745", "Male", "johndoe@example.com", "1234567890", "12345", "Active", nascimento , 1000.0f);
    assertTrue(professor.profCadastrar());
  }
  
  @Test
  public void testProfAlterar() {
    Professor professor = new Professor();
    professor.setCodProfessor(2);
    professor.setNomeProfessor("John Doe");
    professor.setCpfProfessor("123456789");
    professor.setGeneroProfessor("Male");
    professor.setEmailProfessor("johndoe@example.com");
    professor.setTelefoneProfessor("1234567890");
    professor.setCepProfessor("12345");
    professor.setStatusProfessor("Active");
    professor.setDataNascimentoProfessor(nascimento);
    professor.setSalarioProfessor(1000.0f);
    assertTrue(professor.profAlterar());
  }
  
  @Test
  public void testProfDeletar() {
    Professor professor = new Professor();
    professor.setCodProfessor(2);
    assertTrue(professor.profDeletar());
  }
  
  @Test
  public void testProfConsulta() {
    Professor professor = new Professor();
    ResultSet result = professor.profConsulta();
      assertNotNull(result);
  }
}