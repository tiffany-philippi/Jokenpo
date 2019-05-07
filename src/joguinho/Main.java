package joguinho;

import java.util.Scanner;

import jogador.Computador;
import jogador.Jogador;

public class Main {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		boolean decisao = true;
		int brunoGanha = 0;
		int comptGanha = 0;
<<<<<<< HEAD
<<<<<<< HEAD
		int jogadas = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			jogadas++;
=======
		int empate = 0;
=======
>>>>>>> 1b1eee6fe00b40d122604d387b0d8e8b31f378b5
		int jogadas = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
<<<<<<< HEAD
>>>>>>> ffab5b6914465ff644af5799e5df76e07ca93467
=======
			jogadas++;
>>>>>>> 1b1eee6fe00b40d122604d387b0d8e8b31f378b5
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
<<<<<<< HEAD
<<<<<<< HEAD
		}
		
		System.out.println("Jogar de novo? 1 - Sim, 2 - Não");
		int resposta = sc.nextInt();
		
			if (resposta == 2) {
				decisao = false;		
			} 	
			
		} while (decisao == true);
		sc.close();
	}
		
=======
		} else {
			empate++;
=======
>>>>>>> 1b1eee6fe00b40d122604d387b0d8e8b31f378b5
		}
		
		System.out.println("Jogar de novo? 1 - Sim, 2 - NÃ£o");
		int resposta = sc.nextInt();
		
			if (resposta == 2) {
				decisao = false;		
			} 	
			
		} while (decisao == true);
		sc.close();
		
	}
	
<<<<<<< HEAD
	
>>>>>>> ffab5b6914465ff644af5799e5df76e07ca93467
=======
>>>>>>> 1b1eee6fe00b40d122604d387b0d8e8b31f378b5
	private static void imprimirGanhador(Jogador ganhador) {
		
		if (ganhador == null) {
			System.out.println("Empate!");
		} else {
<<<<<<< HEAD
			System.out.println("O ganhador é: " + ganhador.getNome());
		}
		
	}
}
=======
			System.out.println("O ganhador Ã©: " + ganhador.getNome());
		}
		//System.out.println(ganhador);
	}
}
>>>>>>> ffab5b6914465ff644af5799e5df76e07ca93467
