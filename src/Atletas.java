
public class Atletas extends Pessoa{

	//Atributo
	
	String modalidadeAt;
	
	public Atletas(int idPar, String nomePar, int idadePar, String modalidadePar){
		
		super(idPar, nomePar, idadePar);
		
		this.modalidadeAt = modalidadePar;
	}
	
	//Getters
	public String getModalidade(){
		return modalidadeAt;
	}
	
	//Setters
		public String setModalidade(){
			this.modalidadeAt = modalidadePar;
		}
	
	@Override
	public void mostrarInformacoes(){
		System.out.println(Dados de Treinador);
		super.mostrarInformacoes;
		System.out.println("_____________");
	}
	
}
