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
        int beforeBedtimeWage = underTest.calculateBeforeBedtimePay(19, 20, 20);
        assertThat(beforeBedtimeWage).isEqualTo(12);
    }

    @Test
    public void pay8HourlyAfterBedtimeAndBeforeMidnight() {
        Babysitter underTest = new Babysitter();
        int bedtimeEarnings = underTest.calculateBedtimePay(20, 21, 20);
        assertThat(bedtimeEarnings).isEqualTo(8);
    }

    @Test
    public void pay16HourlyAfterMidnight() {
        Babysitter underTest = new Babysitter();
        int midnightWage = underTest.calculateMidnightPay(22, 25, 20);
        assertThat(midnightWage).isEqualTo(16);
    }

    @Test
    public void totalPayShouldEqual140() {
        Babysitter underTest = new Babysitter();
        int totalPay = underTest.calculateTotalPay(17, 28, 22);
        assertThat(totalPay).isEqualTo(140);
    }

}
