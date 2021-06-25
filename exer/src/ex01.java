package src;

import java.util.*;
public class ex01 {

    public static void main (String[] args){
            Scanner ler = new Scanner(System.in);
            int number = ler.nextInt();
            int num = ler.nextInt();
            System.out.println();
            int soma = 0;

        for (int i = number; i<=num; i++){
            System.out.println(i);
             soma += i;
        }
        
        System.out.println();
        int dif = num - number;
        int media = soma / dif;
        System.out.println(dif + " = " + num + " - " + number);
        System.out.println("soma: " + soma);
        System.out.println("media: " + media);

        ler.close();
    }
    
}
