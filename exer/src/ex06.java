package src;

public class ex06 {

    public static void main(String[] args) {
        int soma = 0;
        int cont = 0;

        for (int i = 500; i <= 700; i++) {
            soma += i;
            cont++;
        }
        double media = soma / cont;

        System.out.printf("\nMedia: %.2f\n", media);

    }

}
