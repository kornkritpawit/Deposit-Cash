package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashMinimumTest {

    @Test
    public void deposit_more_than_100_with_100_minimum_deposit_should_be_false() {
        // arrange
        final boolean expectedResult =  true;
        final float depositAmount = 2000;
        final Account account = new Account("23423", 100);
        // act
        Agent agent = new Agent();
        boolean actualResult = agent.checkDepositMinimum(depositAmount, account);
        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void deposit_equal_to_100_with_100_minimum_deposit_should_be_true() {
        // arrange
        final boolean expectedResult = true;
        final float depositAmount = 100;
        final Account account = new Account("34535", 100);
        // act
        Agent agent = new Agent();
        boolean actualResult = agent.checkDepositMinimum(depositAmount, account);
        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void deposit_less_than_100_to_account_with_100_minimum_deposit_should_be_false() {
        // arrange
        final boolean expectedResult = false;
        final float depositAmount = 1;
        final Account account = new Account("123412", 100);

        // act
        Agent agent = new Agent();
        boolean actualResult = agent.checkDepositMinimum(depositAmount, account);

        // assert
        assertEquals(expectedResult, actualResult);
    }
}
