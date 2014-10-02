import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SetorTest {
	
	Setor setor;

	@Before
	public void setUp() throws Exception {
		setor = new Setor();
		System.out.println("Teste inicializado");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalmente Finalizado");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
