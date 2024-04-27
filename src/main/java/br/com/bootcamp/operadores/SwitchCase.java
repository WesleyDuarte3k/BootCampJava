package br.com.bootcamp.operadores;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Conectar? y = sim  n = não");
		String resultado = scanner.nextLine();

		switch (resultado) {
			case "y" : {
				System.out.println("Online");
				break;
			}
			case "n" : {
				System.out.println("offline");
				break;
			}
		}
	}
}
