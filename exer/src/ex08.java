package src;

public class ex08 {
    public static void main(String[] args){
        int soma = 0;
        int i;
        int y= 0;
        int j= 0;

        for(i=100; i<=500; i++){
            if(i % 2 == 0){
                soma += i;
                y++;
            }else{
                j++;
                continue;
            }
        }
        System.out.println("\nSoma: " + soma + "\nTotal de numeros pares: " + y + "\nTotal de numeros impar: " + j);
    }
    
}
