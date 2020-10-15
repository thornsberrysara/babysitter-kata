package babysitter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BabysitterTest {

    @Test
    public void initializeBabysitterClass() {
        Babysitter underTest = new Babysitter();
    }

    @Test
    public void pay12HourlyBeforeBedtime() {
        Babysitter underTest = new Babysitter();
        int beforeBedtimeWage = underTest.calculateBeforeBedtimeWage(19, 20, 20);
        assertThat(beforeBedtimeWage).isEqualTo(12);
    }

    @Test
    public void pay8HourlyAfterBedtimeAndBeforeMidnight() {
        Babysitter underTest = new Babysitter();
        int bedtimeEarnings = underTest.calculateBedtimeWage(20, 21, 20);
    }

}
