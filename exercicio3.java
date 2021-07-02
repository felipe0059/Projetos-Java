/*3-	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
•	10-14 infantil
•	15-17 juvenil
•	18-25 adulto

*/


package Projeto28;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		int idade;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nEntre com a idade (10-25): ");
		idade=read.nextInt();
		
		if(idade>=10 && idade <=14){
		System.out.println("\nInfantil!");
		}
		
		else if (idade>= 15 && idade<=17) {
		System.out.println("\nVocê é juvenil!");
		}
		else if(idade>=18 && idade<=25) {
		System.out.println("\nVocê é adulto!");
		}
		else {
			System.out.println("Idade inválida..");
		}

	}

}
