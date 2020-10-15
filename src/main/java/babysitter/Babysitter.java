package babysitter;

public class Babysitter {

    int beforeBedtimeWage = 12;
    int bedtimeWage = 8;
    int midnightWage = 16;
    int beforeBedtimeEarnings;
    int bedtimeEarnings;
    int midnightEarnings;
    int totalPay;

    public int calculateBeforeBedtimePay(int startTime, int endTime, int bedtime) {
        if (startTime < bedtime && endTime <= bedtime) {
            return beforeBedtimeEarnings = beforeBedtimeWage * (endTime - startTime);
        } else if (startTime < bedtime && endTime > bedtime) {
            return beforeBedtimeEarnings = beforeBedtimeWage * (bedtime - startTime);
        } else {
            return beforeBedtimeEarnings = 0;
        }
    }

    public int calculateBedtimePay(int startTime, int endTime, int bedtime) {
        if (endTime > bedtime && endTime > 24) {
            return bedtimeEarnings = bedtimeWage * (24 - bedtime);
        } else if (endTime > bedtime && endTime <= 24) {
            return bedtimeEarnings = bedtimeWage * (endTime - bedtime);
        } else {
            return bedtimeEarnings = 0;
        }
    }

    public int calculateMidnightPay(int startTime, int endTime, int bedTime) {
        if (endTime > 24) {
            return midnightEarnings = midnightWage * (endTime - 24);
        } else {
            return midnightEarnings = 0;
        }
    }

    public int calculateTotalPay(int startTime, int endTime, int bedTime) {
        calculateBeforeBedtimePay(startTime, endTime, bedTime);
        calculateBedtimePay(startTime, endTime, bedTime);
        calculateMidnightPay(startTime, endTime, bedTime);
        totalPay = beforeBedtimeEarnings + bedtimeEarnings + midnightEarnings;
        return totalPay;
    }
}
