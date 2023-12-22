package projetoJava;

import java.util.Scanner;
import compra.CompraProduto;
import anunciar.AnunciarProduto;


public class Menu {

	public static void main(String[] args) {
		
		
		
		Scanner leia = new Scanner (System.in);
		
		int opcao, comprar, anunciar, produtos;
		
		while (true){
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("               <-  Loja Vai e Vem  ->	             ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Quero comprar um produto             ");
			System.out.println("            2 - Quero anunciar um produto            ");
			System.out.println("            3 - Fale com a gente                     ");
			System.out.println("            4- sair                                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Digite o número da opção desejada:                   ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();
			
			if (opcao == 4) {
				System.out.println("Obrigado por escolher a Vai e Vem!");
				leia.close();
				System.exit(0);
			}
			
			if(opcao == 3) {
				System.out.println("Ligue para: (11)95784-8190 ");
				leia.close();
				System.exit(0);
			}
			
			
			switch (opcao) {
			case 1:
				System.out.println("\nQuero comprar um produto ");
				
				System.out.println("Escolha o Produto: " );
				comprar = leia.nextInt();
				
				
				break;
			case 2:
				System.out.println("\nQuero anunciar um produto ");

				break;

			case 3:
				System.out.println("\nFale com a gente  ");

				break;
			case 4:
				System.out.println("\nsair  ");
			
			}
			
		}
		
		
	}

}
