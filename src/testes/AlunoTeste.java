package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Date;

import org.junit.jupiter.api.Test;

import entidades.Aluno;

class AlunoTeste {

	 @Test
	    void testAlunoCadastrar() {
	        Aluno aluno = new Aluno(3,"Henrique","14076677821", "Masculino", "fulano@gmail.com","34824882","30280460","matriculado",Date.valueOf("2003-07-01"), 22);
	        assertTrue(aluno.alunoCadastrar(), "Falha ao cadastrar aluno");
	    }

	    @Test
	    void testalunoAlterar() {
	        Aluno aluno = new Aluno(3,"Henrique","14076677821", "Masculino", "fulano@gmail.com","34824882","30280460","matriculado",Date.valueOf("01/01/01"), 22);
	        assertTrue(aluno.alunoAlterar(), "Falha ao alterar aluno");
	    }

	    @Test
	    void testalunoDeletar() {
	        Aluno aluno = new Aluno(3,"Henrique","14076677821", "Masculino", "fulano@gmail.com","34824882","30280460","matriculado",Date.valueOf("2003-07-01"), 22);
	        assertTrue(aluno.alunoDeletar(), "Falha ao deletar aluno");
	    }

	    @Test
	    void testalunoConsulta() {
	        Aluno aluno = new Aluno();
	        try {
	            assertNotNull(aluno.alunoConsulta(), "Falha ao consultar aluno");
	        } catch (Exception e) {
	            fail("Exceção lançada durante a consulta: " + e.getMessage());
	        }
	    }

	    @Test
	    void testGettersAndSetters() {
	        Aluno aluno = new Aluno();
	        aluno.setCodAluno(1);
	        assertEquals(1, aluno.getCodAluno(), "Falha no getter ou setter do código do aluno");

	        // Repita para outros getters e setters
	    }

	    @Test
	    void testToString() {
	        Aluno aluno = new Aluno(3,"Henrique","14076677821", "Masculino", "fulano@gmail.com","34824882","30280460","matriculado",Date.valueOf("2003-07-01"), 22);
	        assertNotNull(aluno.toString(), "Falha ao chamar o método toString");
	    }

}