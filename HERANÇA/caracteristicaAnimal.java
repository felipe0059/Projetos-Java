package Projeto28;

public class caracteristicaAnimal extends Animal{
	private String somEmite;
	
public caracteristicaAnimal(String nome,String idade,String caracteristica,String somEmite)
{
	super(nome, idade, caracteristica);
	this.somEmite = somEmite;
}

public String getSom() {
	return somEmite;
}

public void setSom(String som) {
	this.somEmite = som;
}

	public void imprimirInfo()
	{
		System.out.println("\nNome do animal é: "+getNome()+"\n"+"O "+getNome()+", tem "+getIdade()+" anos de idade. Quando vai se locomover ele "+getCaracteristica()+" e para se comunicar ele "+somEmite);
		
	}
	}
