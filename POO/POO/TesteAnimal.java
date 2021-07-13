package POO;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro("Nina","5 anos","Mestiça","Preta");
		Cachorro cachorro2 = new Cachorro("Jack","8 anos","Pitbull","Cinza");
		Cachorro cachorro3 = new Cachorro("Zeus","6 anos","Rotweiller","Preto & marrom");
		
		cachorro1.imprimirInfo();
		System.out.println("------------------------------------");
		cachorro2.imprimirInfo();
		System.out.println("------------------------------------");
		cachorro3.imprimirInfo();
		
		System.out.println("\n\n");
		Cavalo cavalo1 = new Cavalo("Alicia","12 anos","Femea","Preto",380);
	    Cavalo cavalo2 = new Cavalo("Sargento", "14 anos", "Macho","Branco",360);
	    Cavalo cavalo3 = new Cavalo("Valente", "18 anos", "Macho","Marrom",400);
	    
	    cavalo1.imprimirInfo();
	    System.out.println("------------------------------------");
	    cavalo2.imprimirInfo();
	    System.out.println("------------------------------------");
	    cavalo3.imprimirInfo();
	 
	    BichoPreguiça preguica1= new BichoPreguiça("11 anos", "preguiçacomum","América Central");
	    BichoPreguiça preguica2= new BichoPreguiça("6 anos","preguiça de coleira", "America do Sul");
	    BichoPreguiça preguica3= new BichoPreguiça("09 anos","Preguiça bentinho", "America do Sul");
	    	
	    System.out.println("\n\n");
	    preguica1.imprimirInfo();
	    System.out.println("------------------------------------");
	    preguica2.imprimirInfo();
	    System.out.println("------------------------------------");
	    preguica3.imprimirInfo();
	    
	}

}