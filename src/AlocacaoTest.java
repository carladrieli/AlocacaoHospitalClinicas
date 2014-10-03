import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class AlocacaoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetDia() {
		Alocacao alocacao = new Alocacao();
		
		Assert.assertNotNull(alocacao.dia);		
				
	}

	@Test
	public void testGetTurno() {
		Alocacao alocacao = new Alocacao();
		
		Assert.assertNotNull(alocacao.turno);
	}

	@Test
	public void testEscolherDiaETurno() {
		Alocacao alocacao = new Alocacao();
		
		Assert.assertEquals(1, alocacao.dia=1);
		
		}
	

	@Test
	public void testEscolherTurno() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

}
