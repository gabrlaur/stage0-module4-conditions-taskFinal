package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean isLeapYear = false;
        if (year <= 0) {
            System.out.println("invalid date");
            return;
        }
        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 100 == 0) {
            isLeapYear = false;
        } else if (year % 4 == 0) {
            isLeapYear = true;
        }

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            case 2 -> System.out.println(isLeapYear? 29: 28);
            case 4, 6, 9, 11 -> System.out.println(30);
            default -> System.out.println("invalid date");
        }
    }
}
