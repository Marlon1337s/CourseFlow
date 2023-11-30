
package Back.Curse.Entidades;

import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Bruno H
 */
public class TurmaTest {
	LocalDate dataInicio = LocalDate.of(2023,10,07); 
	Date inicio = Date.valueOf(dataInicio);
	LocalDate dataTermino = LocalDate.of(2023,12,07); 
	Date termino = Date.valueOf(dataTermino);
	

    @Test
    public void testTurmaCadastrar() {
        Turma turma = new Turma();
        turma.setCodTurma(1);
        turma.setCodProfessor(1);
        turma.setCodCurso(1);
        turma.setIdTurma("T001");
        turma.setTurnoTurma("Manhã");
        turma.setHorarioAulas("08:00 - 12:00");
        turma.setStatus("Ativo");
        turma.setDataInicio(inicio);
        turma.setDataTermino(termino);

        boolean result = turma.turmaCadastrar();

        assertTrue(result);
    }

    @Test
    public void testTurmaAlterar() {
        Turma turma = new Turma();
        turma.setCodTurma(1);
        turma.setCodProfessor(1);
        turma.setCodCurso(1);
        turma.setIdTurma("T001");
        turma.setTurnoTurma("Manhã");
        turma.setHorarioAulas("08:00 - 12:00");
        turma.setStatus("Ativo");
        turma.setDataInicio(inicio);
        turma.setDataTermino(termino);

        boolean result = turma.turmaAlterar();

        assertTrue(result);
    }

    @Test
    public void testTurmaDeletar() {
        Turma turma = new Turma();
        turma.setCodTurma(1);

        boolean result = turma.turmaDeletar();

        assertTrue(result);
    }

    @Test
    public void testTurmaConsulta() {
        Turma turma = new Turma();

        ResultSet result = turma.turmaConsulta();

        assertNotNull(result);
    }

    @Test
    public void testCursoConsultaEspecifica() {
        Turma turma = new Turma();
        turma.setCodTurma(1);

        ResultSet result = turma.turmaConsulta();

        assertNotNull(result);
    }

}