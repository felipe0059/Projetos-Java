package POO;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro("Nina","5 anos","Mesti�a","Preta");
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
	 
	    BichoPregui�a preguica1= new BichoPregui�a("11 anos", "pregui�acomum","Am�rica Central");
	    BichoPregui�a preguica2= new BichoPregui�a("6 anos","pregui�a de coleira", "America do Sul");
	    BichoPregui�a preguica3= new BichoPregui�a("09 anos","Pregui�a bentinho", "America do Sul");
	    	
	    System.out.println("\n\n");
	    preguica1.imprimirInfo();
	    System.out.println("------------------------------------");
	    preguica2.imprimirInfo();
	    System.out.println("------------------------------------");
	    preguica3.imprimirInfo();
	    
	}

}