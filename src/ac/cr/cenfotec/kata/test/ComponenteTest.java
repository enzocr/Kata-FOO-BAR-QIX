package ac.cr.cenfotec.kata.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.logica.Componente;

public class ComponenteTest {

	static Componente comp;

	@Before
	public void init() {
		comp = new Componente();
	}

	@Test
	public void notDivisible() {
		assertEquals("11", comp.recibirNumero(11));
	}

	@Test
	public void hasDivisible3() {
		assertEquals("3FOO", comp.recibirNumero(3));
	}

	@Test
	public void hasDivisible5() {
		assertEquals("5BAR", comp.recibirNumero(5));
	}

	@Test
	public void hasDivisible7() {
		assertEquals("7QIX", comp.recibirNumero(7));
	}
	
	@Test
	public void hasTwoDivisibles() {
		assertEquals("15FOOBAR", comp.recibirNumero(15));
	}
	
	@Test
	public void hasTwoDivisibles2() {
		assertEquals("21FOOQIX", comp.recibirNumero(21));
	}
	
	@Test
	public void hasTwoDivisibles3() {
		assertEquals("35BARQIX", comp.recibirNumero(35));
	}

	@Test
	public void divisibleBy3() {
		assertTrue(comp.divisiblePorTres(3));
	}

	@Test
	public void divisibleBy5() {
		assertTrue(comp.divisiblePorCinco(5));
	}

	@Test
	public void divisibleBy7() {
		assertTrue(comp.divisiblePorSiete(7));
	}

}
