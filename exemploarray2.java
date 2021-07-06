package Projeto28;

import java.util.Scanner;

public class exemploarray2 {
/*Preencha uma matriz 2x3 e cada valor inserido, verifique se é impar ou par
informando no console*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] numero = new int[2][3];//primeira dimensao linha e segunda coluna
			int linha, coluna;
			
			Scanner leia = new Scanner(System.in);
			
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<3;coluna++)
				{
					System.out.println("Entre com um numero: ");
					numero[linha][coluna] = leia.nextInt();
				}
			}//cortar aqui
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<3;coluna++) //cortar aqui da na mesma
				{
					if(numero[linha][coluna] % 2 == 0)
					{
						System.out.println("\n"+numero[linha][coluna]+ " é par!");
					}
					else
					{
						System.out.println("\n"+numero[linha][coluna]+ " é impar!");
					}
				}
			}
		}
}
	


