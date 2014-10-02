import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PrincipalTest {
	
	Principal principal;

	@Before
	public void setUp() throws Exception {
		principal = new Principal();
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
