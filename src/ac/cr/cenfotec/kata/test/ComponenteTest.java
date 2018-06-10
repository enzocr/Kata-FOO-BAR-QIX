package ac.cr.cenfotec.kata.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ac.cr.cenfotec.logica.Componente;

public class ComponenteTest {

	Componente comp = new Componente();

	@Test
	public void itIsANumber() {
		assertEquals("11", comp.recibirNumero(11));

	}

	@Test
	public void divisibleBy3() {
		assertTrue(comp.divisiblePorTres(3));
	}

	@Test
	public void divisibleBy5() {
		assertTrue(comp.divisiblePorCinco(5));
	}

	

}
