package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCastAtTimeTest {
    @Test
    void deposit_At_6_30_Should_Be_Business_Hours() {
        final boolean expectedResult = true;
        int depositTimeHour = 6;
        int depositTimeMinute = 30;

        Time stubTime = new StubTime(depositTimeHour, depositTimeMinute);
        Agent agent = new Agent(stubTime);

        boolean actualResult = agent.isBusinessHours();
        assertEquals(expectedResult, actualResult);

    }
}
