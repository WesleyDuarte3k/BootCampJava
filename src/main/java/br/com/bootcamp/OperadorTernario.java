package br.com.bootcamp;

public class OperadorTernario {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;

		String resultado = "";

		if (a==b){
			resultado = "verdadeiro";
		}
		else {
			resultado = "falso";
		}
		System.out.println(resultado);

		int numero1 = 5;
		int numero2 = 6;
		int maior = numero1 > numero2? numero1 : numero2;

		resultado = a==b? "verdadeiro" : "falso";
		System.out.println(resultado);


	}
}
