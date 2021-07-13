package POO;

public class BichoPregui�a extends ExercicioAnimal {
	private String especie;
	private String regiao;
	
	
	public BichoPregui�a(String idade, String especie, String regiao)
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
		System.out.println("Pregui�a \nIdade:"+getIdade()+"\nRegi�o:"+regiao+"\nEspecie:"+especie);
		
	}
	

}
