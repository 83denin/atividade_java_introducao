package Exemplo_Para;

import java.util.Scanner;
class Para_ex1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int contador;
		
		
		for(contador = 1; contador < 4; contador ++) {			
			System.out.println("Digite o " + contador + "nome: ");
			nome = leia.next();
			
			System.out.println("O" + contador + "2 nome é " + nome);
			
						
			
		}

		

	}

}
