package ac.cr.cenfotec.logica;

/*
 * Kata FOO-BAR-QIX Un componente recibe numeros y retorna codigos para imprimir
 * El programa retorna el mismo numero como String. (Recibe 3 -entero- retorna
 * “3” string Cuando el numero es divisible por 3, retorna “FOO” Cuando el
 * numero es divisible por 5, retorna “BAR” Cuando el numero es divisible entre
 * 7 retorna “QIX” Cuando el numero es divisible entre 2 o mas de las
 * condiciones anteiores, retorna la concatenacion de menor a mayor
 * 
 */

public class Componente {

	int numero;

	public Componente() {
		this.numero = 0;
	}

	public Componente(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return ""+numero+"";
	}

	public String recibirNumero(int pNumero) {

		return encontrarDivisible(pNumero);

	}

	public String encontrarDivisible(int pNumero) {
		String string = "";
		Componente componente = new Componente(pNumero);

		if (divisiblePorTres(pNumero) && divisiblePorCinco(pNumero)) {
			string = componente.toString() + "FOOBAR";
		}

		if (divisiblePorTres(pNumero) && divisiblePorSiete(pNumero)) {
			string = componente.toString() + "FOOQIX";
		}

		if (divisiblePorCinco(pNumero) && divisiblePorSiete(pNumero)) {
			string = componente.toString() + "BARQIX";
		}

		if (divisiblePorTres(pNumero)) {
			string = componente.toString() + "FOO";
		}

		if (divisiblePorCinco(pNumero)) {
			string = componente.toString() + "BAR";
		}
		if (divisiblePorSiete(pNumero)) {
			string = componente.toString() + "QIX";
		} else {
			string = componente.toString();
		}

		return string;
	}

	public boolean divisiblePorTres(int pNumero) {
		boolean bandera = true;
		if (pNumero % 3 == 0) {
			return bandera;
		} else {
			bandera = false;
		}
		return bandera;

	}

	public boolean divisiblePorCinco(int pNumero) {
		boolean bandera = true;
		if (pNumero % 5 == 0) {
			return bandera;
		} else {
			bandera = false;
		}
		return bandera;

	}

	public boolean divisiblePorSiete(int pNumero) {
		boolean bandera = true;
		if (pNumero % 7 == 0) {
			return bandera;
		} else {
			bandera = false;
		}
		return bandera;
	}

}
