package br.com.bootcamp.operadores;

import java.util.Scanner;

public class OperadorTernario2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a nota: ");
		int nota = scanner.nextInt();

		String resultado = nota >=7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "recuperação" : "reprovado!";

		System.out.println(resultado);
	}
}
