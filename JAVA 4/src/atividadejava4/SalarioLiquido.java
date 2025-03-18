package atividadejava4;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual seu salário bruto? ");
		float salario_bruto = ler.nextFloat();
		
		System.out.print("Qual o adicional noturno? ");
		float adicional_noturno = ler.nextFloat();
		
		System.out.print("Quantidade de horas extras: ");
		float horas_extras= ler.nextFloat();
		
		System.out.print("Descontos: ");
		float descontos= ler.nextFloat();
		
		float salario_liquido = salario_bruto + adicional_noturno + (horas_extras*5) - descontos;
		System.out.println("Salário Líquido é de: " + salario_liquido);

	}

}
