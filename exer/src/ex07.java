package src;

import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println();
        int number = ler.nextInt();

        int fatorial = 0;

        while (number != 0) {
            int i = number-1;
                fatorial =  number * i;
                number--;
        }

        System.out.println("Fatorial de " + number + " é: " + fatorial);
        ler.close();
    }

}
