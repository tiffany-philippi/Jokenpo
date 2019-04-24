package joguinho;

import java.util.Scanner;

import jogador.Computador;
import jogador.Jogador;

public class Main {
	
	//pergunta jogada e atribui com a escolha; pergunta se quer jogar novamente; imprime resultados.

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		boolean decisao = true;
		int brunoGanha = 0;
		int comptGanha = 0;
		int empate = 0;
		int jogadas = 0;
		
		Scanner sc = new Scanner(System.in);
		//for (@SuppressWarnings("unused")
		//boolean decisao = true; decisao = true; jogadas++) {
		//A declara��o 1 � executada (uma vez) antes da execu��o do bloco de c�digo. 
		//A instru��o 2 define a condi��o para executar o bloco de c�digos. 
		//A instru��o 3 � executada (todas as vezes) ap�s o bloqueio do c�digo ter sido executado.
		do {
			Jogador bruno = null;
			
			System.out.println("Qual a jogada de Bruno? 1 - Pedra, 2 - Papel, 3 - Tesoura, 4 - Lagarto, 5 - Spock");
			int jogada = sc.nextInt();
			
			switch(jogada) {
			case 1:
				bruno = new Jogador("Bruno", Escolha.PEDRA);
				break;
			case 2:
				bruno = new Jogador("Bruno", Escolha.PAPEL);
				break;
			case 3:
				bruno = new Jogador("Bruno", Escolha.TESOURA);
				break;
			case 4:
				bruno = new Jogador("Bruno", Escolha.LAGARTO);
				break;
			case 5:
				bruno = new Jogador("Bruno", Escolha.SPOCK);
				break;
			default:
				System.out.println("ERRO");	
			}

		Computador computador = new Computador();
		Regras regras = new Regras();
		Jogador ganhador = regras.jogar(bruno, computador);
		imprimirGanhador(ganhador);
		
		if (ganhador == bruno) {
			brunoGanha++;
		} else if (ganhador == computador) {
			comptGanha++;
		} else {
			empate++;
		}
		
		System.out.println("Jogar de novo? 1 - Sim, 2 - N�o");
		int resposta = sc.nextInt();
		
			if (resposta == 2) {
				decisao = false;
			} 	
			
		
		} while (decisao == true);
		sc.close();
		System.out.println("Relat�rio de jogo:");
		System.out.println("Jogador venceu " + brunoGanha + " vezes.");
		System.out.println("Adver�rio venceu " + comptGanha + " vezes");
		System.out.println("O jogo empatou " + empate + " vezes");
	
	}
	
	
	private static void imprimirGanhador(Jogador ganhador) {
		
		if (ganhador == null) {
			System.out.println("Empate!");
		} else {
			System.out.println("O ganhador �: " + ganhador.getNome());
		}
		System.out.println(ganhador);
	}
}