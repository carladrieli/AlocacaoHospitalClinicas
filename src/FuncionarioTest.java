import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FuncionarioTest {
	
	Funcionario funcionario;

	@Before
	public void setUp() throws Exception {
		funcionario = new Funcionario();
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
