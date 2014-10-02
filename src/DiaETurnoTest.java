import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class DiaETurnoTest {

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
		DiaETurno diaETurno = new DiaETurno();
		
		Assert.assertNotNull(diaETurno.dia);		
				
	}

	@Test
	public void testGetTurno() {
		DiaETurno diaETurno = new DiaETurno();
		
		Assert.assertNotNull(diaETurno.turno);
	}

	@Test
	public void testEscolherDia() {
		fail("Not yet implemented");
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
