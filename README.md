# Babysitter Kata

#### Rules:

The babysitter:

- starts no earlier than 5:00PM
- leaves no later than 4:00AM
- gets paid $12/hour from start-time to bedtime
- gets paid $8/hour from bedtime to midnight
- gets paid $16/hour from midnight to end of job
- gets paid for full hours (no fractional hours)

### The Process
I chose to go the TDD route for this kata, so the first test I wrote was for the creation of the Babysitter class.

The second test was to ensure that the pay before bedtime was $12/hr. In the Babysitter class, I created a *Calculate Before Bedtime Earnings* method.
If the starting time took place before bedtime **AND** the ending time is before bedtime, the babysitter would make $12 times the amount of hours they worked before bedtime.
Let's say the babysitter arrived at 5:00pm and left at 8:00pm (before bedtime). They would have made $36 that evening.

The third test was pretty similar to the second. The pay should be $8/hr *after* bedtime **AND** *before* midnight.
So, if the babysitter arrived at 9:00pm, bedtime was also at 9:00pm, and they stayed till midnight, the babysitter would have made $24 that night.

Same thing for the fourth test. After midnight, the babysitter makes $16/hr. Let's say the babysitter arrived at midnight and stayed till 2:00am. They would make $32.

The final test calculated a full night of babysitting. If the babysitter started at 5:00pm, bedtime was at 10:00pm, and the babysitter left at 4:00am, they would have made $140 that night.
Between the start time and bedtime, the babysitter worked 5 hours, totaling $60.
Between bedtime and midnight, they worked 2 hours, totaling $16.
From midnight till the ending time, they worked 4 hours, totaling $64.
So if we add all of that together, the babysitter made $140.

### The Struggle
This kata was pretty straight forward and easy to complete. I realized throughout the process that I should have converted the times better.
It makes sense in my head, but I realize that 28:00 isn't a real time. To me, it just means 4:00 am. To better understand the code, I've included which number is equal to which time.

17 = 5:00pm <br>
18 = 6:00pm <br>
19 = 7:00pm <br>
20 = 8:00pm <br>
21 = 9:00pm <br>
22 = 10:00pm <br>
23 = 11:00pm <br>
24 = 12:00am <br>
25 = 1:00am <br>
26 = 2:00am <br>
27 = 3:00am <br>
28 = 4:00am <br>
