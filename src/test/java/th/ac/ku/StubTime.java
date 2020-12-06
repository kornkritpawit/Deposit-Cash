package th.ac.ku;

import java.time.LocalTime;

public class StubTime implements Time {
    LocalTime time;
    public StubTime(int depositTimeHour, int depositTimeMinute){
        time = LocalTime.of(depositTimeHour, depositTimeMinute);
        System.out.println(time);
    }

    @Override
    public LocalTime now() {
        return time;
    }
}
