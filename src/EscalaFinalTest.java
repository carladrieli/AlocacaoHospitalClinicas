import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class EscalaFinalTest {
	
	EscalaFinal escalaFinal;

	@Before
	public void setUp() throws Exception {
		escalaFinal = new EscalaFinal();
		System.out.println("Teste inicializado");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizado");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
