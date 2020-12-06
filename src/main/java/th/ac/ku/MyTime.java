package th.ac.ku;

import java.time.LocalTime;

public class MyTime implements Time{
    @Override
    public LocalTime now() {
        return LocalTime.now();
    }
}
