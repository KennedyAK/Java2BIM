package src;

public class ex09 {
    public static void main(String[] args){
        int soma = 0;
        int i;
        int y = 0;
        int j = 0;

        for(i=300; i<=700; i++){
            if(i % 2 != 0){
                j++;
                soma += i;
            }else{
                y++;
                continue;
            }
        }
        System.out.println("\nSoma: " + soma + "\nTotal de numeros pares: " + y + "\nTotal de numeros impar: " + j);
    }
    
}
