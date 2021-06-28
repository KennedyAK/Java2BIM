package src;

import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("\nNumber: ");
        int number = ler.nextInt();

        int i = 1;
        int fatorial = number;

        while (i != number) {
            fatorial *= i;
            i++;
        }

        System.out.println("Fatorial de " + number + " é: " + fatorial);
        ler.close();
    }

}
