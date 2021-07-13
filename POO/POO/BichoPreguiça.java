package POO;

public class BichoPreguiça extends ExercicioAnimal {
	private String especie;
	private String regiao;
	
	
	public BichoPreguiça(String idade, String especie, String regiao)
	{
		super(idade);
		this.especie=especie;
		this.regiao=regiao;	
	
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	public void imprimirInfo()
	{
		System.out.println("Preguiça \nIdade:"+getIdade()+"\nRegião:"+regiao+"\nEspecie:"+especie);
		
	}
	

}
