package atividadejava4;

import java.util.Scanner;

public class CalculoProdutos {

	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);

	     
	     System.out.print("Digite o numero1: ");
	     float n1 = ler.nextFloat();

	     System.out.print("Digite o numero2: ");
	     float n2 = ler.nextFloat();

	     System.out.print("Digite o numero3: ");
	     float n3 = ler.nextFloat();

	     System.out.print("Digite o numero4: ");
	     float n4 = ler.nextFloat();

	     
	     float diferenca = (n1 * n2) - (n3 * n4);

	      
	     System.out.println("Diferença: " + diferenca);

	}

}
