package fes.aragon.utilerias;

public class Conjunto {
	public static boolean enteroCero(char c) {
		int valor = c;
		boolean valido = false;
		if (valor == 0) {
			valido = true;
		}
		return valido;
	}

	public static boolean enteroUno(char c) {
		int valor = c;
		boolean valido = false;
		if (valor == 1) {
			valido = true;
		}
		return valido;
	}
}