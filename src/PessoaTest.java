import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PessoaTest {
	
	Pessoa funcionario;

	@Before
	public void setUp() throws Exception {
		funcionario = new Pessoa();
		System.out.println("Teste inicializado");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalmente Finalizado");
	}

	@Test
	public void test() {
		//assertEquals(funcionario.cadastrarDisponibilidade();
		fail("Not yet implemented");
	}

}
