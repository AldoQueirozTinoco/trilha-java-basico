package main;

public record Iphone() implements ReprodutorMusical,AparelhoTelefonico,NavegadorInternet{

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina:" + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para "+ numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Ligacao atendida");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica!");
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Musica " + musica + " selecionada!");
	}
	
}

