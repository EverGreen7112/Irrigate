import test.AlarmClock;
import test.Clock;
import test.CookoClock;

/**
 * Test
 */
public class Test {
    public static void main(String[] args) {

    }

    public void passHour(Clock clock) {
        for (int i = 0; i < 3600; i++) {
            clock.tick();
        }
    }
}