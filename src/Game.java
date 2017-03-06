import java.util.Scanner;

public class Game {
	
	private int numeroSelecionado = 0;
	private static Scanner entrada;
	
	public Game(){
		
		entrada = new Scanner(System.in);	
		setJogadores();
	}
	
	
	public void setJogadores(){
		
		int gamer = 0;
						
		System.out.println("*********** Adivinhe o N�mero *************");
		System.out.println(" Digite a quantidade de jogadores - [1] ou [2] :\n");			
					
		gamer = entrada.nextInt();
		
		switch (gamer) {
			case 1:
				
				this.numeroSelecionado = NumeroRandom.Random();	
				System.out.println("A m�quina est� sorteando um n�mero entre 1 e 1000...\n" + this.numeroSelecionado);	
				Jogador jogador1 = new Jogador();
				play(jogador1);			
	
				break;
			
			case 2:							
				
				System.out.println(" Digite um n�mero entre 1 e 1000 para seu oponente adivinhar!\n");	
				Jogador jogador2 = new Jogador();
				this.numeroSelecionado = entrada.nextInt();
				play(jogador2);			
	
				break;
	
			default:
				
				System.out.print("N�mero de jogadores inv�lidos!\n");	
				setJogadores();
				
				break;
			}			
	}
			
	
	
	private void play(Jogador jogador){
		
		boolean status = false;
		
		while (!status){
			
			System.out.println("Tente adivinhar o valor digitando-o!\n ");			
				
			status = resultado(entrada.nextInt());
			
			jogador.setTentativas();
		}
		
		System.out.println("********* Foram "+ jogador.getTentativas() + " tentativas ********* \n\n");
		
		setJogadores();
		
	}
	
	
	private boolean resultado(int valorDigitado){
		
		if(valorDigitado == this.numeroSelecionado){		
			
			System.out.println( "********* Parab�ns, voc� acertou!!*********");
			return true;
			
		}else if(valorDigitado >= this.numeroSelecionado){
			
			System.out.println("O n�mero digitado � Maior que o n�mero a ser adivinhado!\n");
			return false;
			
		}else{ 
			
			System.out.println("O n�mero digitado � Menor que o n�mero a ser adivinhado!\n");
			return false;
		}
				
	}
	
}
