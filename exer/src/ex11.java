package src;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("\nSalario Bruto: R$");
        double salarioBruto = ler.nextDouble();
        System.out.print("Valor da Prestação: R$");
        double prestacao = ler.nextDouble();

        while (prestacao > salarioBruto * 0.25) {
            System.out.print("\nValor da prestação é maior que o permitido. \nDigite outro valor! R$");
            prestacao = ler.nextDouble();
        }
        ler.close();
    }
}
