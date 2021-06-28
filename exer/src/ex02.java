package src;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("\nNumber One: ");
        double number1 = ler.nextDouble();
        System.out.print("Number Two: ");
        double number2 = ler.nextDouble();


        if (number1 > number2) {
            System.out.println("\nNumber TWO é o menor: " + number2);
        } else {
            System.out.println("\nNumber: ONE é o menor: " + number1);
        }
        ler.close();
    }
}
