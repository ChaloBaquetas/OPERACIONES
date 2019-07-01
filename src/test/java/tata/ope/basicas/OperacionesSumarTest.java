package tata.ope.basicas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperacionesSumarTest {
	private OperacionesBasicas testing;
	
	@Before
	public void setUp() throws Exception {
		this.testing = new OperacionesBasicas();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Acá se terminan las pruebas");
	}

	@Test
	public void cuando15mas20entonces35() {
		int resultado = this.testing.sumar(15, 20);
		assertEquals(35, resultado);
		}
	
	@Test
	public void cuandoA0entonces0() {
		int resultado = this.testing.sumar(0, 20);
		assertEquals(0, resultado);
		}
	
	@Test
	public void cuandoB0entonces0() {
		int resultado = this.testing.sumar(20, 0);
		assertEquals(0, resultado);
		}
	
	@Test
	public void cuandoMaxMasMazentoncesMenos2() {
		int resultado = this.testing.sumar(Integer.MAX_VALUE, Integer.MAX_VALUE);
		assertEquals(-2, resultado);
		}
}
