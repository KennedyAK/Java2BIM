
import java.util.Scanner;
import product.Back;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        System.out.println("");

        double moneyCont = 0;
        System.out.print("Enter account number: ");
        int numberC = ler.nextInt();
        ler.nextLine();

        System.out.print("Enter account holder: ");
        String nameH = ler.nextLine();

        System.out.print("Is thre na initial deposit (y/n)? ");
        char dep = ler.next().charAt(0);

        if (dep == 'y') {
            System.out.print("Enter initial deposit value: ");
            moneyCont = ler.nextDouble();
        } else if (dep == 'n') {
            moneyCont = 0;
        }

        System.out.println();

        Back construtorP = new Back(nameH, numberC, moneyCont);

        System.out.println("Accont data:");
        System.out.println(construtorP);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        moneyCont = ler.nextDouble();
        construtorP.addDeposit(moneyCont);
        System.out.println("Updated account data:");
        //nameH = ler.next();
        //construtorP.setNameH(nameH);
        System.out.println(construtorP);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        moneyCont = ler.nextDouble();
        construtorP.remMoney(moneyCont);
        System.out.println("Updated account data:");
        //nameH = ler.next();
        //construtorP.setNameH(nameH);
        System.out.println(construtorP);

        ler.close();
    }
}