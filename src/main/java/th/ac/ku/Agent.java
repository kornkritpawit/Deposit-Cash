package th.ac.ku;

import java.util.ArrayList;
import java.util.Arrays;

public class Agent {
    private final float DepositLimitPerOneTimeTransaction = 30000;
    private final float DepositLimitPerOneDay = 50000;

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
}
