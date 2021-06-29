package product;

public class Back {
    private double moneyCont;
    private String nameH;
    private int numberC;

    public Back(String nameH, int numberC, double moneyCont) {
        this.nameH = nameH;
        this.numberC = numberC;
        this.moneyCont = moneyCont;
    }

    public String getNameH() {
        return nameH;
    }

    public void setNameH(String nameH) {
        this.nameH = nameH;
    }

    public String getNumberC() {
        return nameH;
    }

    public double getMoneyCont() {
        return moneyCont;
    }

    public void setMoney(double moneyCont) {
        this.moneyCont = moneyCont;
    }

    public void addDeposit(double moneyCont) {
        this.moneyCont += moneyCont;
    }

    public void remMoney(double saq) {
        if (saq <= this.moneyCont && saq > 0) {
            this.moneyCont -= (saq + 5.00);
        } else if (saq > this.moneyCont) {
            System.out.println("There's no money suficient in the account!!\n");
        } else if (saq < 0) {
            System.out.println("Enter value valied!!\n");
        }
    }

    public void menu() {
        System.out.println("Informe o número correspondente para o que deseja fazer: \n" + "1 - Sacar: \n"
                + "2 - Depositar: \n" + "3 - Alterar nome: \n" + "4 - Status: \n" + "0 - Sair do sistema \n");
    }

    public String toString() {
        return "Account: " + numberC + ", Holder: " + nameH + ", Balance: $ " + moneyCont + "\n ";
    }

}