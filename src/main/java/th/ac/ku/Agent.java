package th.ac.ku;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Agent {
    Time time;
    private final float DepositLimitPerOneTimeTransaction = 30000;
    private final float DepositLimitPerOneDay = 50000;
    private final double OpenDepositTime = 5.00;
    private final double CloseDepositTime = 0.00;
    public Agent() {
        time = new MyTime();
    };
    public  Agent(Time time) {
        this.time = time;
    }
    public boolean allowDepositPerTransaction(float money) {
        if (money <= DepositLimitPerOneTimeTransaction) {
            return true;
        }
        return false;
    }
    public boolean allowDepositPerDay(float deposit, float depositedAmount) {
        if (deposit + depositedAmount <= DepositLimitPerOneDay) {
            return true;
        }
        return false;
    }
    public boolean checkAccountStatus(String accountId) {
        String[] freezeAccount = FreezeAccount.getFreezeAccount();
        if(Arrays.asList(freezeAccount).contains(accountId)) {
            return false;
        }
        return true;
    }
    public boolean checkDepositMinimum(float deposit, Account account) {
        float accountMinimumDeposit = account.getMinimumDeposit();
        if(deposit >= accountMinimumDeposit) {
            return true;
        }
        return false;
    }
    public boolean checkDepositAtOpenTime(double depositTime) {
        double timeDeposit = depositTime % 12;
        if (timeDeposit >= 5) {
            return true;
        }
        return false;
    }
    public boolean isBusinessHours(){
        LocalTime currentTime = time.now();

        int totalMinute = currentTime.getHour() * 60 + currentTime.getMinute();

        return totalMinute >= 300 && totalMinute < 1440;
    }
}
