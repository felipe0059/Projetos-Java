/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package LACOSREPETICAO;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		int valorD = 0, valorT = 0, cont = 0, media;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.println("Entre um n�mero inteiro, para sair digite 0: ");
			valorD = scan.nextInt();
			
			if(valorD % 3 == 0) {
				valorT = valorT + valorD;
				
				cont++;
			}
		}
		while(valorD != 0);
		
		media = valorTotal / cont;
		
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: " + media);
	}
}