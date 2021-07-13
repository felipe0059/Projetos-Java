package POO;

public class Cavalo extends ExercicioAnimal {
	private String genero;
	private String cor;
	private float peso;
	
	public Cavalo (String nome, String idade, String genero, String cor, float peso)
	{
		super(nome, idade);
		this.genero=genero;
		this.cor=cor;
		this.peso=peso;
	}


	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void imprimirInfo()
	{
		System.out.println("Cavalo \nNome:"+getNome()+"\nIdade:"+getIdade()+"\nGenero:"+genero+"\nCor:"+cor+"\nPeso:"+peso+" Kgs.");
	}
}