package Projeto28;

import java.util.Scanner;
//Entre com um numero e informe se este numero � positivo, negativo ou 0;
public class Decis�o1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nEntre com um n�mero: ");
		num = read.nextInt();
		
		if(num>0)
		{
			System.out.println("\n"+num+" � positivo!");
		}
		else if (num<0)
		{
			System.out.println("\n"+num+" � negativo!");
		}
		else
			System.out.println("\n"+num+" � zero!");

	}

}
