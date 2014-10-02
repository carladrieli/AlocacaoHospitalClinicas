import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ChefeDoSetorTest {
	
	ChefeDoSetor chefeDoSetor;

	@Before
	public void setUp() throws Exception {
		chefeDoSetor = new ChefeDoSetor();
		System.out.println("Teste inicializado");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalmente Finalizado");
	}

	@Test
	public void test() {
		//assertEquals(chefeDoSetor.cadastrarSetor();
		//assertEquals(chefeDoSetor.cadastrarFuncionario();
		//assertEquals(chefeDoSetor.receberEscalaEscolhida()
		fail("Not yet implemented");
	}

}
