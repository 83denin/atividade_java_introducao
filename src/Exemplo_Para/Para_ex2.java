package Exemplo_Para;

import java.util.Scanner;

public class Para_ex2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int resultado, numero, contador=1;
		
		while(contador < 4) {
			System.out.println("Digite o " + contador + "nome: ");
			numero = leia.nextInt();
			
			resultado = numero * 9;
			System.out.println(numero + " x 9 = " + resultado);
			System.out.println("\n***************************************************************************************************************************************************************/");
			
			contador++;
			
			System.out.println("\t\t__________________________Fim do Problema__________________");
					
		
		}
	}

}
