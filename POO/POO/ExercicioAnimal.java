package POO;


public class ExercicioAnimal {
	
	private String nome;
	private String idade;
	
	
	public ExercicioAnimal(String nome, String idade)
	{
		super();
		this.nome= nome;
		this.idade=idade;
	}
	public ExercicioAnimal(String idade)
	{
		super();
		this.idade=idade;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
}