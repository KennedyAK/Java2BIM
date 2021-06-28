package src;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("\nSalario Bruto: ");
        double salario = ler.nextDouble();
        double cont;

        if(salario < 500){
            cont = salario * 0.3;
            salario += cont;
            System.out.printf("Reajuste: %.2f%n", cont);
            System.out.printf("Salario Liquido: %.2f%n", salario);
        }else{
            System.out.println("Funcionário não tem direito a aumento");
        }
        ler.close();
    }
}
