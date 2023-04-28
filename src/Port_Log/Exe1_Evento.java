package Port_Log;

import java.io.IOException;
import java.util.Scanner;


public class Exe1_Evento {
		
	public static void main(String[]agr)throws IOException {

		@SuppressWarnings("resource")	
		Scanner input = new Scanner (System.in);
		int n, h, m, s;

		n = input.nextInt();


		h = (n /3600);
		m = (n % 3600)/ 60;
		s = (n % 3600)% 60;
		
		System.out.println("A duração do Evento será: \nh, " + h +"\nm, " + m + "\ns :" + s);
		
	}
				

}
	
	

