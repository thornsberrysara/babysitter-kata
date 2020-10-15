package babysitter;

public class Babysitter {

    int beforeBedtimeWage = 12;
    int beforeBedtimeEarnings;
    int bedtimeWage = 8;
    int bedtimeEarnings;
    int midnightWage = 16;
    int midnightEarnings;
    int totalPay;

    public int calculateBeforeBedtimeWage(int startTime, int endTime, int bedtime) {
        if (startTime < bedtime && endTime <= bedtime) {
            return beforeBedtimeEarnings = beforeBedtimeWage * (endTime - startTime);
        } else if (startTime < bedtime && endTime > bedtime) {
            return beforeBedtimeEarnings = beforeBedtimeWage * (bedtime - startTime);
        } else {
            return beforeBedtimeEarnings = 0;
        }
    }

    public int calculateBedtimeWage(int startTime, int endTime, int bedtime) {
        if (endTime > bedtime && endTime > 24) {
            return bedtimeEarnings = bedtimeWage * (24 - bedtime);
        } else if (endTime > bedtime && endTime <= 24) {
            return bedtimeEarnings = bedtimeWage * (endTime - bedtime);
        } else {
            return bedtimeEarnings = 0;
        }
    }

    public int calculateMidnightWage(int startTime, int endTime, int bedTime) {
        if (endTime > 24) {
            return midnightEarnings = midnightWage * (endTime - 24);
        } else {
            return midnightEarnings = 0;
        }
    }

    public int calculateTotalPay(int startTime, int endTime, int bedTime) {
        calculateBeforeBedtimeWage(startTime, endTime, bedTime);
        calculateBedtimeWage(startTime, endTime, bedTime);
        calculateMidnightWage(startTime, endTime, bedTime);
        totalPay = beforeBedtimeEarnings + bedtimeEarnings + midnightEarnings;
        return totalPay;
    }
}
