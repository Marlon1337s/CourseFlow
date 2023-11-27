package Back.Curse.Entidades;

import java.sql.Date;
import java.sql.ResultSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Bruno H
 */
public class AlunoTest {
    
    public AlunoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getCodAluno method, of class Aluno.
     */
    @Test
    public void testGetCodAluno() {
        System.out.println("getCodAluno");
        Aluno instance = new Aluno();
        Integer expResult = null;
        Integer result = instance.getCodAluno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodAluno method, of class Aluno.
     */
    @Test
    public void testSetCodAluno() {
        System.out.println("setCodAluno");
        Integer codAluno = null;
        Aluno instance = new Aluno();
        instance.setCodAluno(codAluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdTurmaAluno method, of class Aluno.
     */
    @Test
    public void testGetIdTurmaAluno() {
        System.out.println("getIdTurmaAluno");
        Aluno instance = new Aluno();
        Integer expResult = null;
        Integer result = instance.getIdTurmaAluno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdTurmaAluno method, of class Aluno.
     */
    @Test
    public void testSetIdTurmaAluno() {
        System.out.println("setIdTurmaAluno");
        Integer idTurmaAluno = null;
        Aluno instance = new Aluno();
        instance.setIdTurmaAluno(idTurmaAluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeAluno method, of class Aluno.
     */
    @Test
    public void testGetNomeAluno() {
        System.out.println("getNomeAluno");
        Aluno instance = new Aluno();
        String expResult = "";
        String result = instance.getNomeAluno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeAluno method, of class Aluno.
     */
    @Test
    public void testSetNomeAluno() {
        System.out.println("setNomeAluno");
        String nomeAluno = "";
        Aluno instance = new Aluno();
        instance.setNomeAluno(nomeAluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCpfAluno method, of class Aluno.
     */
    @Test
    public void testGetCpfAluno() {
        System.out.println("getCpfAluno");
        Aluno instance = new Aluno();
        String expResult = "";
        String result = instance.getCpfAluno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCpfAluno method, of class Aluno.
     */
    @Test
    public void testSetCpfAluno() {
        System.out.println("setCpfAluno");
        String cpfAluno = "";
        Aluno instance = new Aluno();
        instance.setCpfAluno(cpfAluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGeneroAluno method, of class Aluno.
     */
    @Test
    public void testGetGeneroAluno() {
        System.out.println("getGeneroAluno");
        Aluno instance = new Aluno();
        String expResult = "";
        String result = instance.getGeneroAluno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGeneroAluno method, of class Aluno.
     */
    @Test
    public void testSetGeneroAluno() {
        System.out.println("setGeneroAluno");
        String generoAluno = "";
        Aluno instance = new Aluno();
        instance.setGeneroAluno(generoAluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailAluno method, of class Aluno.
     */
    @Test
    public void testGetEmailAluno() {
        System.out.println("getEmailAluno");
        Aluno instance = new Aluno();
        String expResult = "";
        String result = instance.getEmailAluno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmailAluno method, of class Aluno.
     */
    @Test
    public void testSetEmailAluno() {
        System.out.println("setEmailAluno");
        String emailAluno = "";
        Aluno instance = new Aluno();
        instance.setEmailAluno(emailAluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefoneAluno method, of class Aluno.
     */
    @Test
    public void testGetTelefoneAluno() {
        System.out.println("getTelefoneAluno");
        Aluno instance = new Aluno();
        String expResult = "";
        String result = instance.getTelefoneAluno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefoneAluno method, of class Aluno.
     */
    @Test
    public void testSetTelefoneAluno() {
        System.out.println("setTelefoneAluno");
        String telefoneAluno = "";
        Aluno instance = new Aluno();
        instance.setTelefoneAluno(telefoneAluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCepAluno method, of class Aluno.
     */
    @Test
    public void testGetCepAluno() {
        System.out.println("getCepAluno");
        Aluno instance = new Aluno();
        String expResult = "";
        String result = instance.getCepAluno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCepAluno method, of class Aluno.
     */
    @Test
    public void testSetCepAluno() {
        System.out.println("setCepAluno");
        String cepAluno = "";
        Aluno instance = new Aluno();
        instance.setCepAluno(cepAluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatusAluno method, of class Aluno.
     */
    @Test
    public void testGetStatusAluno() {
        System.out.println("getStatusAluno");
        Aluno instance = new Aluno();
        String expResult = "";
        String result = instance.getStatusAluno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatusAluno method, of class Aluno.
     */
    @Test
    public void testSetStatusAluno() {
        System.out.println("setStatusAluno");
        String statusAluno = "";
        Aluno instance = new Aluno();
        instance.setStatusAluno(statusAluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataNascimentoAluno method, of class Aluno.
     */
    @Test
    public void testGetDataNascimentoAluno() {
        System.out.println("getDataNascimentoAluno");
        Aluno instance = new Aluno();
        Date expResult = null;
        Date result = instance.getDataNascimentoAluno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataNascimentoAluno method, of class Aluno.
     */
    @Test
    public void testSetDataNascimentoAluno() {
        System.out.println("setDataNascimentoAluno");
        Date dataNascimentoAluno = null;
        Aluno instance = new Aluno();
        instance.setDataNascimentoAluno(dataNascimentoAluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAluno method, of class Aluno.
     */
    @Test
    public void testSetAluno() {
        System.out.println("setAluno");
        int codigo = 0;
        String nome = "";
        String cpf = "";
        String genero = "";
        String email = "";
        String telefone = "";
        String cep = "";
        String status = "";
        Date nascimento = null;
        int turma = 0;
        Aluno instance = new Aluno();
        instance.setAluno(codigo, nome, cpf, genero, email, telefone, cep, status, nascimento, turma);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alunoCadastrar method, of class Aluno.
     */
    @Test
    public void testAlunoCadastrar() {
        System.out.println("alunoCadastrar");
        Aluno instance = new Aluno();
        boolean expResult = false;
        boolean result = instance.alunoCadastrar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alunoAlterar method, of class Aluno.
     */
    @Test
    public void testAlunoAlterar() {
        System.out.println("alunoAlterar");
        Aluno instance = new Aluno();
        boolean expResult = false;
        boolean result = instance.alunoAlterar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alunoDeletar method, of class Aluno.
     */
    @Test
    public void testAlunoDeletar() {
        System.out.println("alunoDeletar");
        Aluno instance = new Aluno();
        boolean expResult = false;
        boolean result = instance.alunoDeletar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alunoConsulta method, of class Aluno.
     */
    @Test
    public void testAlunoConsulta() {
        System.out.println("alunoConsulta");
        Aluno instance = new Aluno();
        ResultSet expResult = null;
        ResultSet result = instance.alunoConsulta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alunoConsultaEspecifica method, of class Aluno.
     */
    @Test
    public void testAlunoConsultaEspecifica() throws Exception {
        System.out.println("alunoConsultaEspecifica");
        Aluno instance = new Aluno();
        ResultSet expResult = null;
        ResultSet result = instance.alunoConsultaEspecifica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Aluno.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Aluno instance = new Aluno();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
