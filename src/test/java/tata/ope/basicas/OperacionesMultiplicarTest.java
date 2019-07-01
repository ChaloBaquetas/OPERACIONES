package tata.ope.basicas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperacionesMultiplicarTest {
	private OperacionesBasicas opes;

	@Before
	public void setUp() throws Exception {
		this.opes = new OperacionesBasicas();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void cuando15por10es150() {
		int resultado = this.opes.multiplicar(15, 10);
		assertTrue("Debería ser 150 pero es " + resultado, resultado == 150);
	}

	@Test
	public void cuandoB0entonces1() {
		int resultado = this.opes.multiplicar(20, 0);
		assertEquals(1, resultado);
	}

	@Test
	public void cuandoB0entonces1Forma2() {
		int resultado = this.opes.multiplicar(15, 0);
		assertTrue("Debería ser 1 pero es " + resultado, resultado == 1);
	}

	@Test
	public void cuandoMaxPorMazentonces1() {
		int resultado = this.opes.multiplicar(Integer.MAX_VALUE, Integer.MAX_VALUE);
		assertTrue("Debería ser 1 pero es " + resultado, resultado == 1);
	}
}
