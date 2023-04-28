package Trab_A;

import java.util.Scanner;

public class Ar_ray2 {

	public static void main(String[] args) {
		
		int dadoLancado = 3;
        int maiorNumero = 0;
        double somaLancado = 0;
        double media = 0;
        int[] dado = new int[dadoLancado];

        for (int i = 0; i < dadoLancado; ++i) {
            Scanner input = new Scanner(System.in);

            System.out.println("Qual o valor ?");
            dado[i] = input.nextInt();

            somaLancado += dado[i];

            if (maiorNumero < dado[i]) {
                maiorNumero = dado[i];
            }
        }

        media = somaLancado / dado.length;

        System.out.println("A média é: " + media);
        System.out.println("As maiores pontuações são:" +maiorNumero);

	}

}
