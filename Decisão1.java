package Projeto28;

import java.util.Scanner;
//Entre com um numero e informe se este numero é positivo, negativo ou 0;
public class Decisão1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		num = read.nextInt();
		
		if(num>0)
		{
			System.out.println("\n"+num+" é positivo!");
		}
		else if (num<0)
		{
			System.out.println("\n"+num+" é negativo!");
		}
		else
			System.out.println("\n"+num+" é zero!");

	}

}
