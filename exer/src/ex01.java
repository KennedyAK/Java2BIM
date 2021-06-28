package src;

import java.util.*;

public class ex01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("\nnumber ONE: ");
        int number = ler.nextInt();
        System.out.print("number TWO: ");
        int num = ler.nextInt();
        System.out.println();

        int soma = 0;
        int cont = 0;

        for (int i = number; i <= num; i++) {
            System.out.println(i);
            soma += i;
            cont++;
        }
        double media = soma / cont;

        System.out.println("\nNumbers: " + cont);
        System.out.println("Total: " + soma);
        System.out.printf("Media: %.2f\n", media);

        ler.close();
    }

}
