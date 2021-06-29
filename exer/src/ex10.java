package src;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println();
        int number = ler.nextInt();

        if(number % 5 == 0){
            System.out.println("\n" + number + ": É divisivel por 5!");
        }else{
            System.out.println("\n" + number + ": Não é divisivel por 5!");
        }
        ler.close();
    }
    
}
