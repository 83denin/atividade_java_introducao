package Aul20_ex1_Repeticao;

import java.util.Scanner;

public class Aluno_1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Float nota1, nota2, media;
		
		System.out.println("Digite a primeira nota ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota ");
		nota2 = leia.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		if(media >= 6 ) {
			System.out.println("Parabens você foi Aprovado ");			
			
		}
		
		else if(media == 5){			
			System.out.println("Voce esta de exame ");
								
			}
		
		
		else {			
			System.out.println(" Infelizmente você foi Reprovado ");
								
			}
				
	}

}
