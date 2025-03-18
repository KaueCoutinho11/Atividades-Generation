package atividadejava4;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		float nota1 = ler.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		float nota2 = ler.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		float nota3 = ler.nextFloat();
		
		System.out.print("Digite a quarta nota: ");
		float nota4 = ler.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Média final: " + media);
		
		}

}
