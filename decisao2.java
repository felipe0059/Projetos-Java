package Projeto28;

import java.util.Scanner;

// Digitar o mes e o numero remeter ao mes
public class decisao2 {

	public static void main(String[] args) {
int mes;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		mes = read.nextInt();
			
			switch(mes)
			{
			case 1:
				System.out.println("\nJaneiro");
			break;
			case 2:
				System.out.println("\nFevereiro");
			break;
			case 3:
				System.out.println("\nMarço");
			case 4:
				System.out.println("\nAbril");
			break;
			case 5:	
				System.out.println("\nMaio");
			break;
			case 6:
				System.out.println("\nJunho");
			break;
			case 7:
				System.out.println("\nJulho");
			break;
			case 8:
				System.out.println("\nAgosto");
			break;
			case 9:
				System.out.println("\nSetembro");
			break;
			case 10:
				System.out.println("\nOutubro");
			break;
			case 11:
				System.out.println("\nNovembro");
			break;
			case 12:
				System.out.println("\nDezembro");
			break;
			default:
				System.out.println("\nMês inválido.");
			}
	}

	}

