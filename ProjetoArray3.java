package Projeto28;

import java.util.Scanner;

public class ProjetoArray3 {
//preencha um array do tipo matriz 3x3 e calcule a media dos
//	valores e o somatorio da diagonal principal
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] valor = new float[3][3];//3 linhas e 3 colunas
		float somavalor=0, mediavalor, somadiagonal=0;
		int l,c = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<3;l++)
		{
			System.out.println("\nEntre com um valor: ");
			valor[l][c] = leia.nextFloat();
			
			somavalor = somavalor+valor[l][c];
			
			if(l == c)
			{
				somadiagonal = somadiagonal + valor [l][c];
			}
		}
		mediavalor = somavalor /9;
		System.out.println("\nSomatório da diagonal principal: "+somadiagonal);
		System.out.println("\nMédia dos valores: "+mediavalor);
	}
}

