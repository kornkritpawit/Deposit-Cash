package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckAccountStatusTest {
    @Test
    public void use_not_freeze_account_should_be_true() {
        // arrange
        final boolean expectedResult = true;
        final String accountID = "34542543";

        // act
        Agent agent = new Agent();
        boolean actualResult = agent.checkAccountStatus(accountID);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void use_freeze_account_should_be_false() {
        // arrange
        final boolean expectedResult = false;
        final String accountID = "9999";
        // act
        Agent agent = new Agent();
        boolean actualResult = agent.checkAccountStatus(accountID);

        // assert
        assertEquals(expectedResult, actualResult);
    }
}
