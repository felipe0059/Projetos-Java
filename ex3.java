package LACOSREPETICAO;
/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/
import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		
		int y = 0, id, contIdadeMenor = 0, contIdadeMaior = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		id = scan.nextInt();
		
		while(id != -99) {
			
			if(id < 21) {	
				
				contIdadeMenor++;
			}
			
			else if(id > 50) {
				
				contIdadeMaior++;
			}
			System.out.println("Total de pessoas abaixo de 21 anos: " + contIdadeMenor + "\nTotal de pessoas acima de 50 anos: " + contIdadeMaior);			
			break;
		}
		
		System.out.println("Para sair digite -99: ");
		id = scan.nextInt();
		
	}
}
