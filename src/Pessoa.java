
public class Pessoa {
	
	//Atributo
	
	int idAt;
	String nomeAt;
	int idadeAt;
	
	//Construtores
	
	public Pessoa(int idPar, String nomePar, int idadePar){
		
		this.idAt = idPar;
		this.nomeAt = nomePar;
		this.idadeAt = idadePar;
	
	}
	
	//Getters
	
	public int PegarID(){
		return idAt;
	}
	
	public String PegarNome(){
		return nomeAt;
	}
	
	public int Pegaridade(){
		return idadeAt;
	}
	
	//Setters
	
	public void alterarID(int idPar){
		this.idAt = idPar;
	}
	
	public void alterarNome(String nomePar){
		this.nomeAt = nomePar;
	}
	
	public void alterarIdade(int idadePar){
		this.idadeAt = idadePar;
	}
}
