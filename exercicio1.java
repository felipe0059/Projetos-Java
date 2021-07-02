/*1-	Faça um programa que receba três inteiros e diga qual deles é o maior.*/


package Projeto28;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		int x, y, z;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		x = read.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		y = read.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		z = read.nextInt();
	
		if(x > y && x > z)
		{
			System.out.println("\n"+x+" é o maior!");
		}
		else if (y>x && y>z)
		{
			System.out.println("\n"+y+" é o maior número!");
		}
		else
			System.out.println("\n"+z+" é o maior!");

	}	

	}


