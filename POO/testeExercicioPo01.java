package Projeto28;

public class testeExercicioPo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciando um objeto da classe pessoa
		
		exercicioPo01 pessoa1 = new exercicioPo01("Felipe Gustavo","25", "173");
		
		//troca de mensagens (chamada ao método imprimirInfo()
		pessoa1.imprimirInfo();
		
		exercicioPo01 pessoa2 = new exercicioPo01("Gustavo Felipe","28", "173");
		pessoa2.imprimirInfo();
			

	}

}
