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

	public void notDivisible() throws Exception {
		assertEquals("11", comp.recibirNumero(11));
	}

	@Test
	public void hasDivisible3() throws Exception {
		assertEquals("3FOO", comp.recibirNumero(3));
	}

	@Test
	public void hasDivisible5() throws Exception {
		assertEquals("5BAR", comp.recibirNumero(5));
	}

	@Test
	public void hasDivisible7() throws Exception {
		assertEquals("7QIX", comp.recibirNumero(7));
	}

	@Test
	public void hasTwoDivisibles() throws Exception {
		assertEquals("15FOOBAR", comp.recibirNumero(15));
	}

	@Test
	public void hasTwoDivisibles2() throws Exception {
		assertEquals("21FOOQIX", comp.recibirNumero(21));
	}

	@Test
	public void hasTwoDivisibles3() throws Exception {
		assertEquals("35BARQIX", comp.recibirNumero(35));
	}

	@Test
	public void divisibleBy3() throws Exception {
		assertTrue(comp.divisiblePorTres(3));
	}

	@Test
	public void divisibleBy5() throws Exception {
		assertTrue(comp.divisiblePorCinco(5));
	}

	@Test
	public void divisibleBy7() throws Exception {
		assertTrue(comp.divisiblePorSiete(7));
	}

}
