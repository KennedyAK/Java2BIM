package src;

import java.util.Scanner;

public class ex03{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("\nNumber One: ");
        double number1 = ler.nextDouble();
        System.out.print("Number Two: ");
        double number2 = ler.nextDouble();

        double nm;
        double nmm;

        if (number1 > number2) {
            nm = number1;
            nmm = number2;
        } else {
            nmm = number1;
            nm = number2;
        }

        int escolha = 22;
        double op;

        while (escolha != 0) {
            System.out.println("\nTecle 1 ->  Média entre os números digitados");
            System.out.println("Tecle 2 ->  Diferença do maior pelo menor");
            System.out.println("Tecle 3 ->  Produto entre os números digitados");
            System.out.println("Tecle 4 ->  Divisão do primeiro pelo segundo\n");
            escolha = ler.nextInt();

            if (escolha == 1) {
                op = (number1 + number2) / 2;
                System.out.println("\nResultado: " + op + "\n");
                continue;
            } else if (escolha == 2) {
                op = nm - nmm;
                System.out.println("\nResultado: " + op + "\n");
                continue;
            } else if (escolha == 3) {
                op = nm + nmm;
                System.out.println("\nResultado: " + op + "\n");
                continue;
            } else if (escolha == 4 && number2 != 0) {
                op = number1 - number2;
                System.out.println("\nResultado: " + op + "\n");
                continue;
            } else {
                System.out.println("\nERRO");
                break;
            }
        }
        ler.close();
    }
}
