package LACOSREPETICAO;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int idade, identgenero, fatorpsico, x=1;
				int contpc=0, contmn=0,conttha=0,contoc=0,contpn40=0,contpc18=0;
				
				Scanner leia = new Scanner(System.in);
				
				while(x<=5)
				{
				System.out.println("\nentre com a sua idade: ");
				idade= leia.nextInt();
				System.out.println("\nEntre com a sua identidade de genero: ");
				identgenero = leia.nextInt();
				System.out.println("\nEntre com o fator psicológico: ");
				fatorpsico = leia.nextInt();
				
				if(fatorpsico ==1)
				{
					contpc++;
				}
				if(identgenero==1 && fatorpsico ==2) {
					contmn++;
				}
				if(identgenero==2 && fatorpsico==3) {
					conttha++;
				}
				if(identgenero==3 && fatorpsico==1) {
					contoc++;
				}
				if(fatorpsico==2 && idade>40) {
					contpn40++;
				}
				if(fatorpsico==1 && idade<18) {
					contpc18++;
				}
				
				x++;
			}
		
				System.out.println("\nPessoas calmas: "+contpc);
				System.out.println("\nMulheres nervosas: "+contmn);
				System.out.println("\nHomens agressivos: "+conttha);
				System.out.println("\nOutros calmas: "+contoc);
				System.out.println("\nPessoas nervosas acima de 40 anos: "+contpn40);
				System.out.println("\nPessoas calmas com menor de 18 anos: "+contpc18);
				
				
	}

}
