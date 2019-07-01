package tata.ope.basicas;

public class OperacionesBasicas {

	/************************* METODOS **************************************/
	public int sumar(int a, int b) {
		// return (a == 0 || b == 0)?0:a+b;
		if (a == 0 || b == 0) {
			return 0;
		}
		return a + b;
	}

	public int restar(int a, int b) {
		// return a < b?0:a-b;
		if (a < b) {
			return 0;
		}
		return a - b;
	}

	public int multiplicar(int a, int b) {
		// return b == 0?1:a*b;
		if (b == 0) {
			return 1;
		}
		return a * b;
	}

	public double dividir(int a, int b) {
		// return b == 0?0:a/b;
		if (b == 0) {
			return 0;
		}
		return (double)a / b;
	}
}
