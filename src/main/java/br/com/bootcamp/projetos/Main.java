package br.com.bootcamp.projetos;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int primeiroNumero = scanner.nextInt();

		System.out.println("Digite o segundo numero: ");
		int segundoNumero = scanner.nextInt();

		try{
			contaOsNumeros(primeiroNumero, segundoNumero);

		} catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parametro deve ser maior que o primeiro");
		}
	}

	public static void contaOsNumeros(int primeiroNumero, int segundoNumero)throws ParametrosInvalidosException{
		if (primeiroNumero >= segundoNumero){
			RuntimeException exception;
		}

		for (int i = primeiroNumero; i < segundoNumero; i++){
			System.out.println(i);
		}
	}





}
