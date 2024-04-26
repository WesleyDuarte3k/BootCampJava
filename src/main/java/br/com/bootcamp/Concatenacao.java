package br.com.bootcamp;

public class Concatenacao{
	public static void main(String[] args) {
		String concatenacao = "?";
		System.out.println(concatenacao);
		concatenacao = 1 + 1 + 1 + "1";
		System.out.println(concatenacao);
		concatenacao = 1 + "1" + 1 + 1;
		System.out.println(concatenacao);
		concatenacao = 1 + "1" + 1 + "1";
		System.out.println(concatenacao);
		concatenacao = "1" + (1 + 1 + 1);
		System.out.println(concatenacao);
	}
}
