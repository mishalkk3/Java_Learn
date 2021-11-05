package Bank.accounts;
import Bank.accounts.Account;

public abstract class CheckingAccount extends Account{
    protected int rewardPoints;

    public CheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate);
        this.rewardPoints = rewardPoints;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public boolean purchase(double cost) {
        if(cost > balance){
            return false;
        }
        balance -= cost;
        rewardPoints += calculateRewardPoints(cost);
        return true;
    }

    public abstract int calculateRewardPoints(double cost);
}
