package jogador;

import joguinho.Escolha;

public class Jogador {

	private Escolha escolha;
	private String nome;

	public Jogador(String nome, Escolha escolha) {
		this.escolha = escolha;
		this.nome = nome;
	}
	
	protected Jogador() {
		
	}

	public Escolha getEscolha() {
		return escolha;
	}

	public String getNome() {
		return nome;
	}

	protected void setEscolha(Escolha escolha) {
		this.escolha = escolha;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Jogador " 
				+ nome 
				+ " escolheu " 
				+ escolha;
=======
		return "Jogador " + nome + " escolheu " + escolha;
>>>>>>> ffab5b6914465ff644af5799e5df76e07ca93467
	}

}