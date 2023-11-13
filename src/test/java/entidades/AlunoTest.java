package entidades;

import entidades.Aluno;
import org.junit.jupiter.api.Test;
import java.sql.Date;
import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void testAlunoCadastrar() {
        Aluno aluno = new Aluno(3,"Henrique","14076677821", "Masculino", "fulano@gmail.com","34824882","30280460","matriculado",Date.valueOf("01/01/01"), 22);
        assertTrue(aluno.alunoCadastrar(), "Falha ao cadastrar aluno");
    }

    @Test
    void testProfAlterar() {
        Aluno aluno = new Aluno(3,"Henrique","14076677821", "Masculino", "fulano@gmail.com","34824882","30280460","matriculado",Date.valueOf("01/01/01"), 22);
        assertTrue(aluno.profAlterar(), "Falha ao alterar aluno");
    }

    @Test
    void testProfDeletar() {
        Aluno aluno = new Aluno(3,"Henrique","14076677821", "Masculino", "fulano@gmail.com","34824882","30280460","matriculado",Date.valueOf("01/01/01"), 22);
        assertTrue(aluno.profDeletar(), "Falha ao deletar aluno");
    }

    @Test
    void testProfConsulta() {
        Aluno aluno = new Aluno();
        try {
            assertNotNull(aluno.profConsulta(), "Falha ao consultar aluno");
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
        Aluno aluno = new Aluno(3,"Henrique","14076677821", "Masculino", "fulano@gmail.com","34824882","30280460","matriculado",Date.valueOf("01/01/01"), 22);
        assertNotNull(aluno.toString(), "Falha ao chamar o método toString");
    }
}

