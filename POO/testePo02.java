
package Projeto28;

public class testePo02 {

	public static void main(String[] args) {
		
		exercicioPo02 Aviao1 = new exercicioPo02("Boeing","777","Tripulado",314);
		Aviao1.imprimirInfo();
		System.out.println("*****Peso m�ximo de decolagem : 247.200 kg*****\n");
		exercicioPo02 Aviao2 = new exercicioPo02("Antonov Airlines","AN225","N�o Tripulado",0);
		Aviao2.imprimirInfo();
		System.out.println("*****Peso m�ximo de decolagem 2,5 TON *****\n");
		exercicioPo02 Aviao3 = new exercicioPo02("Airbus","A380","Tripulado",853);
		Aviao3.imprimirInfo();
		System.out.println("*****Peso m�ximo de decolagem : 386.000 kg*****\n");
		exercicioPo02 Aviao4 = new exercicioPo02("FAB - For�a aerea brasileira","KC-390","N�o Tripulado",0);
		Aviao4.imprimirInfo();
		System.out.println("*****Peso m�ximo de decolagem : 86.999 kg*****\n");

}
}
