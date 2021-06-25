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

    public Back(double moneyCont) {
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

    public void remMoney(double moneyCont) {
        this.moneyCont -= (moneyCont + 5.00);
    }

    public void menu() {
        System.out
                .println("Menu: \n" + "Deposit = 1: \n" + "withdraw = 2: \n" + "Update Account = 3 \n" + "Status = 4 \n" + "Exit = 10:");
    }

    public String toString() {
        return "Account: " + numberC + ", Holder: " + nameH + ", Balance: $ " + moneyCont + "\n ";
    }

}