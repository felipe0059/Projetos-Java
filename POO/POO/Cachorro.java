package POO;

public class Cachorro extends ExercicioAnimal {
	

	private String raca;
	private String cor;

	public Cachorro(String nome, String idade, String raca, String cor)
	{
		super(nome, idade);
		this.raca=raca;
		this.cor=cor;		
	}

	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public void imprimirInfo()
	{
		System.out.println("Cachorro \nNome:"+getNome()+"\nIdade:"+getIdade()+"\nRa?a:"+raca+"\nCor:"+cor);
	}
	
}