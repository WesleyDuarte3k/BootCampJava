package br.com.bootcamp.operadores;

import java.util.ArrayList;
import java.util.List;

public class OperadorRelacional {
	public static void main(String[] args) {
		List<Integer> crescente = new ArrayList<>();
		List<Integer> decrescente = new ArrayList<>();

		int tamanhoDaLista = 16;
		int tamanhoDaOtaLista = 16;

		int somaTamanhosDaLista = tamanhoDaLista + tamanhoDaOtaLista;

		for (int i = 0; i < tamanhoDaLista; i++){
			crescente.add(i);
			decrescente.add(--tamanhoDaOtaLista);
			boolean resultado = tamanhoDaOtaLista == (i-1)?true : false;

			if (resultado != false){
				System.out.println(--i);
				System.out.println(tamanhoDaOtaLista);
				System.out.println("os numeros são iguais");
			}
		}
		System.out.println(crescente.toString());
		System.out.println(decrescente.toString());
	}
}
