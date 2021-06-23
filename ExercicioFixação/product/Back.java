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

    public void addDeposit(double moneyCont) {
        this.moneyCont += moneyCont;
    }

    public void remMoney(double moneyCont) {
        this.moneyCont -= (moneyCont + 5.00);
    }

    public String toString() {
        return "Account: " + numberC + ", Holder: " + nameH + ", Balance: $ " + moneyCont;
    }

}