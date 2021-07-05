/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package LACOSREPETICAO;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		int valorD = 0, valorT = 0, cont = 0, media;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.println("Entre um número inteiro, para sair digite 0: ");
			valorD = scan.nextInt();
			
			if(valorD % 3 == 0) {
				valorT = valorT + valorD;
				
				cont++;
			}
		}
		while(valorD != 0);
		
		media = valorTotal / cont;
		
		System.out.println("A média dos números múltiplos de 3 é: " + media);
	}
}