
import java.util.Scanner;
import product.Back;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        System.out.println("");

        double moneyCont = 0;
        int cond = 0;

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
            System.out.println();
        } else if(dep == 'n'){
            System.out.println();
        }
        Back mon = new Back(nameH, numberC, moneyCont);


        while (cond != 10) {
            mon.menu();
            cond = ler.nextInt();

            if (cond == 1) {
                System.out.print("\nValue for deposit: ");
                moneyCont = ler.nextDouble();
                mon.addDeposit(moneyCont);
                System.out.println(mon);
                continue;
            } else if (cond == 2) {
                System.out.print("\nEnter a withdraw value: ");
                moneyCont = ler.nextDouble();
                mon.remMoney(moneyCont);
                System.out.println(mon);
                continue;
            } else if (cond == 3) {
                System.out.print("\nAccount name Update: ");
                ler.nextLine();
                nameH = ler.nextLine();
                mon.setNameH(nameH);
                System.out.println(mon);
                continue;
            } else if (cond == 4) {
                System.out.println("\n" + mon);
                continue;
            } else if (cond == 10) {
                System.out.println("\n" + mon);
            } else{
                System.out.println("\nenter a valid value\n");
                continue;
            }
        }
        ler.close();
    }
}