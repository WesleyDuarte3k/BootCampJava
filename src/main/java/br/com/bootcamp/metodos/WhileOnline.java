package br.com.bootcamp.metodos;

import java.util.Scanner;

public class WhileOnline {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Deseja conectar? y = sim  n = não: ");
		boolean conectado = scanner.nextLine().equals("y") ? true : false;

		boolean desconectado = !conectado;

		while (conectado == true){
			if (conectado == true) {
				System.out.println("Você está conectado!");

				System.out.println("Deseja se desconectar? y = sim  n = nao: ");
				desconectado = scanner.nextLine().equals("y") ? true : false;

			}

			if (desconectado == true){
				while (desconectado == true) {
					System.out.println("Deseja conectar? y = sim  n = não: ");
					conectado = scanner.nextLine().equals("y") ? true : false;

					if (conectado == true){
						desconectado = false;
					}
				}
			}
		}

	}
}
