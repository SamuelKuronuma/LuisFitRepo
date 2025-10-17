
public class Treinadores extends Pessoa{

	//Atributo
	
	String especialidadeAt;
	
	public Treinadores(int idPar, String nomePar, int idadePar, String especialidadePar){
		
		super(idPar, nomePar, idadePar);
		
		this.especialidadeAt = especialidadePar;
	}
	
	public String geteEspecialidade(){
		return especialidadeAt;
	}

}
