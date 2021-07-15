package Projeto28;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * Crie uma um programa para trabalhar com estoque de uma loja, o programa
 * dever� trabalhar com Collection do tipo List do Java para manipular os dados
 * desse estoque, o programa dever� atender as seguintes funcionalidades:
 * 
 * Armazenar dados da List Remover dados da list; Atualizar dados da list.
 * Apresentar todos os dados da list.
 */

public class collection {
	
		public static void main(String[] args)
		{
			/*
			 * Crie uma um programa para trabalhar com estoque de uma loja, o programa
			 * dever� trabalhar com Collection do tipo List do Java para manipular os dados
			 * desse estoque, o programa dever� atender as seguintes funcionalidades:
			 * 
			 * Armazenar dados da List Remover dados da list; Atualizar dados da list.
			 * Apresentar todos os dados da list.
			 */
			int op;
			Scanner read = new Scanner(System.in);

			ArrayList<String> Roupas = new ArrayList();// interface list/ objeto estoqueRoupas
			do
			{
				System.out.println("\n(1)Armazenamento de roupa no estoque\n"
						+ "(2)Deseja remover um produto? \n(3)Atualizar\n(4)Mostrar todos os produtos do estoque"
						+ "\n(0) Encerrar o programa");
				System.out.println("\n*****************************************");
				System.out.println("\n\t\tDigite sua op��o: ");
				System.out.println("\n*****************************************");
				op = read.nextInt();
				if (op == 1)
				{
					read.nextLine();
					System.out.println("\nDigite o produto para adicionar ao estoque: ");
					String produto = read.nextLine();// ler uma vari�vel do tipo String
					Roupas.add(produto);
				} else if (op == 2)
				{
					read.nextLine();
					System.out.println("\nDigite o produto para remover do estoque: ");
					String produto1 = read.nextLine();
					if (Roupas.contains(produto1))
					{
						Roupas.remove(produto1);
					} else
					{
						System.out.println("\nProduto n�o existe no estoque...");
					}
					System.out.println(Roupas);
				} else if (op == 3)
				{
					read.nextLine();
					System.out.println("\nDigite o produto que quer atualizar: ");
					String verifica = read.nextLine();
					System.out.println("\nDigite o nome do produto que entrar� no lugar de " + verifica + " : ");
					String novo = read.nextLine();

					if (Roupas.contains(verifica))//contains verifica se existe aquele produto.
					{
						Roupas.remove(verifica);//remove:exclui
						Roupas.add(novo);//add:adiciona algo no local
					} else
					{
						System.out.println("\nProduto n�o existente...");
					}
					System.out.println(Roupas);
				} else if (op == 4)
				{
					System.out.println("\nOs produtos do estoque s�o: ");
					System.out.println(Roupas);
				} else
				{
					System.out.println("\nFinalizou o programa... Volte sempre...");
				}

			} while (op != 0);
		}


}
