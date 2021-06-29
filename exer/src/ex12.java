package src;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("\nInsira um intervalo \nNumber One: ");
        int numberONE = ler.nextInt();
        int soma = 0;
        System.out.print("Number two: ");
        int numberTWO = ler.nextInt();
        
        while (numberTWO <= numberONE || numberONE < 0) {
            System.out.print("\nInsira um valor válido!\n");
            if (numberTWO <= numberONE) {
                System.out.print("Number Two: ");
                numberTWO = ler.nextInt();
            } else if (numberONE < 0) {
                System.out.print("Number One: ");
                numberONE = ler.nextInt();
            }
        }
        ler.close();
        int i = numberONE;

        while (i <= numberTWO) {
            soma += i;
            i++;
        }
        System.out.println("\nSoma do intervalo: " + soma);
    }

}
