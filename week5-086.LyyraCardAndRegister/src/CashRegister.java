
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private final double econ = 2.5;
    private final double gour = 4.0;

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= econ) {
            economicalSold++;
            this.cashInRegister += econ;
            return cashGiven - econ;
        }
        return cashGiven;
    }
    

    public double payGourmet(double cashGiven) {
        if (cashGiven >= gour) {
            gourmetSold++;
            this.cashInRegister += gour;
            return cashGiven - gour;
        } else {
            return cashGiven;
        }
    }

public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= econ) {
            economicalSold++;
            card.pay(econ);
            return true;
        } else {
            return false;
        }
    }

public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= gour) {
            gourmetSold++;
            card.pay(gour);
            return true;
        } else {
            return false;
        }
    }    
public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
}

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
