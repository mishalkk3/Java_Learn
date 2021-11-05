package Bank;

import Bank.accounts.*;
import inheritance.p2.A;

public class Main {
    public static void main(String[] args) {
        SilverCheckingAccount silver = new SilverCheckingAccount(250,0.026,1000);
        GoldCheckingAccount gold = new GoldCheckingAccount(250,0.026,1000);
        DaimondCheckingAccount daimond = new DaimondCheckingAccount(250,0.026,1000);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(daimond.getRewardPoints());

        silver.purchase(3500);
        gold.purchase(3500);
        daimond.purchase(3500);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(daimond.getRewardPoints());
    }
}
