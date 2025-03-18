package atividadejava4;

import java.util.Scanner;

public class Exercicio1CalculoSalario {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual o seu salário? ");
		float salario = ler.nextFloat();
		
		System.out.print("Qual o valor do abono? ");
		float abono = ler.nextFloat();
		
		float total = salario + abono;
		
		System.out.println("Total a ser recebido: " + total);

	}

}
