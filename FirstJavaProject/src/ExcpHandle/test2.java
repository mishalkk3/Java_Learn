package ExcpHandle;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount that) throws CurrenciesDoNotMatch{
        if (that.currency.equals(this.currency)) {
            this.amount += that.amount;
        }
        else {
            //throw new Exception("Currencies Don't Match");
            throw new CurrenciesDoNotMatch("Currencies Don't Match");
        }
    }

    public String toString() {
        return amount+ " "+ currency;
    }
}

class CurrenciesDoNotMatch extends Exception {
    public CurrenciesDoNotMatch(String message){
        super(message);
    }
}

public class test2 {
    public static void main(String[] args) throws CurrenciesDoNotMatch{
        Amount amount1 = new Amount("USD", 10);
        Amount amount2 = new Amount("EUR", 20);
        amount1.add(amount2);
        System.out.println(amount1);
    }
}
