package main;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
		
		try {
			imprimeNumeros(parametroUm,parametroDois);
		} catch (ParametrosInvalidosException e) {
			e.printStackTrace();
		}
		}
	public static void imprimeNumeros(int um, int dois) throws ParametrosInvalidosException {
		if(um > dois) {
			throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
		}
		int diferenca = dois-um;
		for(int i=1;i<=diferenca;i++) {
			System.out.println("Imprimindo o numero "+i);
		}
	}

	}

