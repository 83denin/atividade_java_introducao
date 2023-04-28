package Port_Log;

import java.util.Scanner;
import java.io.IOException;


public class Exer2_IDa {
	
	public static void main(String[] args)throws IOException {
		
		@SuppressWarnings("resource")	
		
		Scanner leia = new Scanner (System.in);
		Float idade, anos, meses, dias;
		
		
		System.out.println("Digite dua idade ");
		idade = leia.nextFloat();
		
		anos = (idade /365);
		meses = (idade % 356)/ 30;
		 dias = (idade % 356)% 30;
		 
		 System.out.println("\nAnos " + anos);
		 System.out.println("\nMeses " + meses);
		 System.out.println("\nDias " + dias);
				
		}
	

}
