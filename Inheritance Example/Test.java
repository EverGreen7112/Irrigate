import test.AlarmClock;
import test.Clock;
import test.CuckooClock;

/**
 * Our main class, testing classes and methods
 */
public class Test {
    public static void main(String[] args) {

    }

    /**
     * Forwards through an hour on an input clock.
     * @param clock - the clock to fast forward.
     */
    public void passHour(Clock clock) {//NOTICE: the paramter is declared clock, but can also be 
        //passes on to the function as ant class that extends clock (such as Coo
        for (int i = 0; i < 3600; i++) { //Pass 3600 seconds (=1 hour)
            clock.tick();
        }
    }
}