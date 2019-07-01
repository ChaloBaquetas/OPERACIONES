package tata.ope.basicas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperacionesDividirTest {
	private OperacionesBasicas opes;

	@Before
	public void setUp() throws Exception {
		this.opes = new OperacionesBasicas();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void cuandoB0Entonces0() {
		double resultado = this.opes.dividir(152, 0);
		assertTrue("Debería ser " + resultado + " pero es 0", resultado == 0);
	}
	
	@Test
	public void cuando15Dividido20Entonces0_75() {
		double resultado = this.opes.dividir(15, 20);
		assertTrue("Es " + resultado + " pero debería ser 0.75", resultado == 0.75d);
	}

}
