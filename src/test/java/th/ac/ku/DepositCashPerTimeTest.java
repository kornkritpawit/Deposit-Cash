package th.ac.ku;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashPerTimeTest {
    @Test
    void deposit_Less_Than_30000_Should_Be_True() {
        //Arrange
        final boolean expectedResult = true;
        final float depositCash = 5000.00f;
        Agent agent = new Agent();

        //Act
        boolean actualResult = agent.allowDepositPerTransaction(depositCash);
        //Assert
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void deposit_Equal_30000_Should_Be_True() {
        //Arrange
        final boolean expectedResult = true;
        final float depositCash = 30000.00f;
        Agent agent = new Agent();

        //Act
        boolean actualResult = agent.allowDepositPerTransaction(depositCash);
        //Assert
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void deposit_More_than_30000_Should_Be_False() {
        //Arrange
        final boolean expectedResult = false;
        final float depositCash = 50000.00f;
        Agent agent = new Agent();

        //Act
        boolean actualResult = agent.allowDepositPerTransaction(depositCash);
        //Assert
        assertEquals(expectedResult, actualResult);
    }
}
