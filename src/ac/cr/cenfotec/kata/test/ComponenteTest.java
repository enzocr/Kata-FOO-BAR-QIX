package ac.cr.cenfotec.kata.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ac.cr.cenfotec.logica.Componente;

public class ComponenteTest {

	Componente comp = new Componente();

	@Test
	public void itIsANumber() {
		assertEquals("11", comp.recibirNumero(11));
		
	}
	

}
