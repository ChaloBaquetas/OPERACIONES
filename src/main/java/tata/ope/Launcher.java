package tata.ope;

import tata.ope.basicas.OperacionesBasicas;

public class Launcher {

	public static void main(String[] args) {
		OperacionesBasicas op = new OperacionesBasicas();
		System.out.println("La suma de 15 + 20 es " + op.sumar(15, 20));
		System.out.println("La resta de 15 - 20 es " + op.restar(15, 20));
		System.out.println("La multiplicación de 15 * 20 es " + op.multiplicar(15, 20));
		System.out.println("La división de 15 / 20 es " + op.dividir(15, 20));
		System.out.println("la suma de max con max es " + op.sumar(Integer.MAX_VALUE, Integer.MAX_VALUE));
		System.out.println("la resta de max con max es " + op.restar(Integer.MAX_VALUE, Integer.MAX_VALUE));
		System.out.println("la multiplicación de max con max es " + op.multiplicar(Integer.MAX_VALUE, Integer.MAX_VALUE));
	}

}
