package main;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Iphone i = new Iphone();
		int option =0;
		boolean rodando=true;
		while(rodando) {
			System.out.println("1. Adicionar aba\n2. Exibir pagina\n3. Atualizar pagina\n4. Ligar\n5. Atender\n6. Iniciar correio de voz\n7. Tocar musica\n8. Pausar musica\n9. Selecionar musica\n10. Sair");
			option = scanner.nextInt();
			switch(option) {
			case 1 -> i.adicionarNovaAba();
			case 2 -> {
				scanner.nextLine();
				System.out.println("Digite o URL da pagina:");
				String url = scanner.nextLine();
				i.exibirPagina(url);	
			}
			case 3 -> i.atualizarPagina();
			case 4 ->{
				scanner.nextLine();
				System.out.println("Digite o numero de telefone:");
				String numero = scanner.nextLine();
				i.ligar(numero);
			}
			case 5 -> i.atender();
			case 6-> i.iniciarCorreioVoz();
			case 7-> i.tocar();
			case 8-> i.pausar();
			case 9-> {
				scanner.nextLine();
				System.out.println("Digite o nome da musica:");
				String musicName = scanner.nextLine();
				i.selecionarMusica(musicName);
			}
			case 10 -> rodando = false;
			}
			
		}
	}
}
