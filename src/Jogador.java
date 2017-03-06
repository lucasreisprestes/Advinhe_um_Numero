
public class Jogador {
	
	private int numeroTentativas = 0;
	
	public Jogador(){

	}
	
	
	public void setTentativas(){
		
		this.numeroTentativas++;
	}
	
	public int getTentativas(){
		
		return this.numeroTentativas;
	}
}
