import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AutenticacaoTest {
	
	Autenticacao autenticacao;

	@Before
	public void setUp() throws Exception {
		autenticacao = new Autenticacao();
		System.out.println("Teste inicializado");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizado");
	}

	@Test
	public void testEqual() {
		autenticacao = new Autenticacao();
		autenticacao.setUsuario("Nome");
		
		Assert.assertEquals("Nome", autenticacao.getUsuario());
		//assertEquals(autenticacao.getSenha();
		
	}
	
	/*@Test
	public void testEmpty() {
		autenticacao = new Autenticacao();
		autenticacao.setUsuario("Nome");
		
		assertEquals(autenticacao.autentica("Nome", autenticacao.setUsuario("Nome"));
		
	}*/

	
}
