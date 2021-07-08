package Projeto28;

public class testeAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		caracteristicaAnimal Cao = new caracteristicaAnimal("cachorro","2","corre","late");
		
		Cao.imprimirInfo();
		caracteristicaAnimal Cavalo = new caracteristicaAnimal("Cavalo","6","corre","relincha");
		
		Cavalo.imprimirInfo();
		caracteristicaAnimal Preguiça = new caracteristicaAnimal("Bicho-Preguiça","15","sobe na arvore","emite um som exclusivo de sua espécie");
	
		Preguiça.imprimirInfo();
	
		}
}
