/*
1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
 em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as 
 informações deste objeto no console.*/
package Projeto28;

public class exercicioPo01 {
	//declaração dos atributos da classe
	private String nomePessoa;
	private String altura;
	private String idade;
	
	
	//método construtor
	public exercicioPo01 (String nomePessoa,String idade, String altura)
	{
		this.nomePessoa = nomePessoa;
		this.altura = altura;
		this.idade = idade;
	
	}
	
	public exercicioPo01 (String nomePessoa)
	{
		this.nomePessoa = nomePessoa;
	}
	
		// TODO Auto-generated constructor stub
	//declaração dos demais métodos da classe
	public void imprimirInfo()
	{
		System.out.println(nomePessoa+" possui "+idade+
				" de idade e "+altura+" centimetros de altura");
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;		
	}

}
