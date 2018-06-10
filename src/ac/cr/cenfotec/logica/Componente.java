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
	String string;

	public Componente() {
		this.string = "";
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

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		String cadena = "";

		cadena += "" + getNumero() + "";
		cadena += getString();

		return cadena;
	}

	public String recibirNumero(int pNumero)throws Exception {
		

		return encontrarDivisible(pNumero);

	}

	public String encontrarDivisible(int pNumero) {
		String string = "";
		Componente componente = new Componente(pNumero);

		if (divisiblePorTres(pNumero) && divisiblePorCinco(pNumero)) {
			string += "" + pNumero + "";
			string += "FOOBAR";
		}

		if (divisiblePorTres(pNumero) && divisiblePorSiete(pNumero)) {
			componente.setString("FOOQIX");
			string = componente.toString();
		}

		if (divisiblePorCinco(pNumero) && divisiblePorSiete(pNumero)) {
			componente.setString("BARQIX");
			string = componente.toString();
		}

		if (divisiblePorTres(pNumero) ^ divisiblePorCinco(pNumero) ^ divisiblePorSiete(pNumero)) {

			if (divisiblePorTres(pNumero)) {
				componente.setString("FOO");
				string = componente.toString();
			}

			if (divisiblePorCinco(pNumero)) {
				componente.setString("BAR");
				string = componente.toString();
			}

			if (divisiblePorSiete(pNumero)) {
				componente.setString("QIX");
				string = componente.toString();
			}

		}

		if (!divisiblePorTres(pNumero) && !divisiblePorCinco(pNumero) && !divisiblePorSiete(pNumero)) {
			componente.setString("");
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
