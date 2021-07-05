package LACOSREPETICAO;
/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5.*/
public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1000; i < 2000; i++){
		    if (i % 11== 5) 
		        System.out.print("\n"+i);
		    }
		}
	}

