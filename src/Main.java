import java.util.Random;

import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	
/*	Crie um programa para jogar "Adivinhe o número". A ideia do jogo é adivinhar um número entre 1 e 1000.
	O programa deve primeiramente perguntar ao usuário se o jogo é para 1 ou 2 jogadores. 
	Caso seja para 1 jogador, o programa deve escolher um número aleatório entre 1 e 1000 e o usuário deve adivinhar (verificar a documentação da classe Random).
	Caso seja para 2 jogadores, o primeiro usuário deve digitar um número entre 1 e 1000 para que o segundo usuário adivinhe.
	Após a escolha do número, o programa deve pedir um número para o usuário até que ele acerte. Para isto, a cada número digitado pelo usuário o programa deve avisar se:
	- O número digitado é maior que o número a ser adivinhado
	- O número digitado é menor que o número a ser adivinhado
	- O usuário acertou o número. Neste caso, deve exibir a quantidade de tentativas até que o acerto.
*/
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int jogadores;
		
		System.out.println("*********** Adivinhe o número *************");
			
		System.out.println("Digite a quantidade de jogadores entre [1] e [2] ");
		
		jogadores = entrada.nextInt(); 
				
		switch (jogadores) {
		case 1:
			System.out.print("1");
			break;
		
		case 2:
			System.out.print("2");
			break;

		default:
			System.out.print("Quantidade jogadores inválidos!");
			break;
		}

	}

}
