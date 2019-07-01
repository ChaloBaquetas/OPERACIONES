package tata.ope.basicas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperacionesRestarTest {
	private OperacionesBasicas opes;
	
	@Before
	public void setUp() throws Exception {
		this.opes = new OperacionesBasicas();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void cuando15menos5entonces10() {
		int resultado = this.opes.restar(15, 5);
		assertTrue("Debería ser 10 pero es: " + resultado, resultado==10);
	}
	
	@Test
	public void cuandoBesmayorqueAentonces0() {
		int resultado = this.opes.restar(0, 15);
		assertTrue("Debería ser 10 pero es: " + resultado, resultado==0);
	}
	
	@Test
	public void cuandoMaxMenosMaxEntonces0() {
		int resultado = this.opes.restar(Integer.MAX_VALUE, Integer.MAX_VALUE);
		assertTrue("Debería ser 10 pero es: " + resultado, resultado==0);
	}
}
