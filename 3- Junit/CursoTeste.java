package testes;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import entidades.Curso;

public class CursoTeste {

    @Test
    public void testCursoCadastrar() {
        Curso curso = new Curso("Curso Teste", "Conteúdo Teste", "Ativo", 40.0f, 1000.0f);
        assertTrue(curso.cursoCadastrar());
    }

    @Test
    public void testCursoAlterar() {
        Curso curso = new Curso("Curso Teste", "Conteúdo Teste", "Ativo", 40.0f, 1000.0f);
        curso.setCodCurso(1);
        assertTrue(curso.cursoAlterar());
    }

    @Test
    public void testCursoDeletar() {
        Curso curso = new Curso();
        curso.setCodCurso(1);
        assertTrue(curso.cursoDeletar());
    }

    @Test
    public void testCursoConsulta() {
        Curso curso = new Curso();
        assertNotNull(curso.cursoConsulta());
    }
}