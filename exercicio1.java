/*1-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/


package Projeto28;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		int x, y, z;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		x = read.nextInt();
		System.out.println("\nEntre com o segundo n�mero: ");
		y = read.nextInt();
		System.out.println("\nEntre com o terceiro n�mero: ");
		z = read.nextInt();
	
		if(x > y && x > z)
		{
			System.out.println("\n"+x+" � o maior!");
		}
		else if (y>x && y>z)
		{
			System.out.println("\n"+y+" � o maior n�mero!");
		}
		else
			System.out.println("\n"+z+" � o maior!");

	}	

	}


