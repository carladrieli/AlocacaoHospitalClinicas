import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AlocacaoTest extends TestCase {

	Alocacao alocacao;
	
	@Before
	public void setUp() throws Exception {
		alocacao = new Alocacao();
		System.out.println("Teste inicializado");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalmente Finalizado");
	}

	@Test
	public void test() {
		//assertEquals(alocacao.alocarEscalaFinal(), actual);
		//assertEquals(alocacao.imprimirEscalaEscolhida(), actual);
		//assertEquals(alocacao.imprimirEscalaPorFuncionario(), actual);
		fail("Not yet implemented");
	}

}
