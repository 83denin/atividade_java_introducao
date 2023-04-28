package Trab_A;

import java.util.Scanner;

public class Ar_ray1 {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        int contagem = 5;
        
        double maiorPontuacao = 0;
        
        double[] pontuacao = new double[contagem];
        
        for (int i = 0; i < contagem; ++i) {
        	
            System.out.println("Qual a pontuação do " + (i + 1) + "?");
            
            pontuacao[i] = input.nextDouble();
            
            System.out.println(pontuacao[i]);
            
            if (maiorPontuacao < pontuacao[i]) {
            	
                maiorPontuacao = pontuacao[i];
                
            }
            
         }
        
        System.out.println("A maior pontuação é : " + maiorPontuacao);
            }
	

	}
