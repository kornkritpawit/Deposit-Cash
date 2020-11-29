package th.ac.ku;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashPerDayTest {
    @Test
    void deposit_Less_Than_50000_In_One_Day_Should_Be_True() {
        //Arrange
        final boolean expectedResult = true;
        final float depositCash = 5000.00f;
        final float depositedCash = 5000;
        Agent agent = new Agent();

        //Act
        boolean actualResult = agent.allowDepositPerDay(depositCash, depositedCash);
        //Assert
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void deposit_Equal_To_50000_In_One_Day_Should_Be_True() {
        //Arrange
        final boolean expectedResult = true;
        final float depositCash = 5000;
        final float depositedCash = 45000;
        Agent agent = new Agent();

        //Act
        boolean actualResult = agent.allowDepositPerDay(depositCash, depositedCash);
        //Assert
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void deposit_More_Than_50000_In_One_Day_Should_Be_False() {
        //Arrange
        final boolean expectedResult = false;
        final float depositCash = 40000;
        final float depositedCash = 20000;
        Agent agent = new Agent();

        //Act
        boolean actualResult = agent.allowDepositPerDay(depositCash, depositedCash);
        //Assert
        assertEquals(expectedResult, actualResult);
    }
}
