package br.com.bootcamp.operadores;

public class OperadoresLogicos {
	public static void main(String[] args) {
		int numero1 = 2;
		int numero2 = 2;
		int numero3 = 4;
		int numero4 = 5;

		if (numero1 == numero2 && numero3 != numero4){
			numero1 ++;
			if (numero1 > numero2 || numero4 > numero3){
				numero1 --;
				System.out.println(numero1);
			}
		}
	}
}
