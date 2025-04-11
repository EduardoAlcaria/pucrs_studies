package DateTimeE1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class dateTimeE1 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner scanner = new Scanner(System.in);


        System.out.println("Type your birth date: ");

        System.out.println("The day: ");
        String day = scanner.nextLine();

        System.out.println("The month: ");
        String month = scanner.nextLine();

        System.out.println("The year: ");
        String year = scanner.nextLine();

        if (day.length() == 1) {
            day = "0" + day;
        }

        if (month.length() == 1) {
            month = "0" + month;
        }

        String birthDay = day + "/" + month + "/" + year;
        LocalDate birthdayF = LocalDate.parse(birthDay, formatter);


        System.out.println(birthdayF);

        int dayOfTheYearBirthDay = birthdayF.getDayOfYear();

        isBirthDay(dayOfTheYearBirthDay);
        youBirthDayWillBe(dayOfTheYearBirthDay);
        birthDayWeekDay(birthdayF);


        System.out.println("you were born in a leap year? " + isLeapYear(birthdayF));
        System.out.println("you zodiac sign is: " + zodiac(birthdayF));

    }

    public static void isBirthDay(int dayOfTheYearBirthDayMethod) {

        int today = LocalDate.now().getDayOfYear();

        if (today == dayOfTheYearBirthDayMethod) {
            System.out.println("is your birthday");
        }
        if (today > dayOfTheYearBirthDayMethod) {
            int daysPassed = today - dayOfTheYearBirthDayMethod;
            System.out.println("its been: " + daysPassed + " days since it was your birthday");
        }

    }

    public static void youBirthDayWillBe(int dayOfTheYearBirthDayMethod) {
        int today = LocalDate.now().getDayOfYear();

        if (today < dayOfTheYearBirthDayMethod) {
            int daysLeft = dayOfTheYearBirthDayMethod - today;
            System.out.println("you will be making birthday in: " + daysLeft + " days");
        }
    }

    public static void birthDayWeekDay(LocalDate date) {
        DayOfWeek dayOfTheWeekBirthDay = date.getDayOfWeek();
        System.out.println("you were born on a: " + dayOfTheWeekBirthDay);
    }

    public static boolean isLeapYear(LocalDate birthDay) {
        return birthDay.isLeapYear();
    }

    public static String zodiac(LocalDate birthDay) {

        int dayOfTheYear = birthDay.getDayOfYear();

        int CapricornBeginStartDate = 0;
        int CapricornBeginEndDate = 18;

        int AquariusStartDate = 19;
        int AquariusEndDate = 48;

        int PiscesStartDate = 49;
        int PiscesEndDate = 79;

        int AriesStartDate = 80;
        int AriesEndDate = 108;

        int TaurusStartDate = 109;
        int TaurusEndDate = 139;

        int GeminiStartDate = 140;
        int GeminiEndDate = 170;

        int CancerStartDate = 171;
        int CancerEndDate = 202;

        int LeoStartDate = 203;
        int LeoEndDate = 233;

        int VirgoStartDate = 234;
        int VirgoEndDate = 265;

        int LibraStartDate = 266;
        int LibraEndDate = 295;

        int ScorpioStartDate = 296;
        int ScorpioEndDate = 324;

        int SagittariusStartDate = 325;
        int SagittariusEndDate = 354;

        int CapricornFinalStartDate = 355;
        int CapricornFinalEndDate = 364;

        if (isLeapYear(birthDay)) {
            AriesStartDate++;
            AriesEndDate++;
            TaurusStartDate++;
            TaurusEndDate++;
            GeminiStartDate++;
            GeminiEndDate++;
            CancerStartDate++;
            CancerEndDate++;
            LeoStartDate++;
            LeoEndDate++;
            VirgoStartDate++;
            VirgoEndDate++;
            LibraStartDate++;
            LibraEndDate++;
            ScorpioStartDate++;
            ScorpioEndDate++;
            SagittariusStartDate++;
            SagittariusEndDate++;
            CapricornFinalStartDate++;
            CapricornFinalEndDate++;
        }
        if (dayOfTheYear >= CapricornBeginStartDate && dayOfTheYear <= CapricornBeginEndDate) {
            return "Capricorn";
        }
        if (dayOfTheYear >= AquariusStartDate && dayOfTheYear <= AquariusEndDate) {
            return "Aquarius";
        }
        if (dayOfTheYear >= PiscesStartDate && dayOfTheYear <= PiscesEndDate) {
            return "Pisces";
        }

        if (dayOfTheYear >= AriesStartDate && dayOfTheYear <= AriesEndDate) {
            return "Aries";
        }

        if (dayOfTheYear >= TaurusStartDate && dayOfTheYear <= TaurusEndDate) {
            return "Taurus";
        }

        if (dayOfTheYear >= GeminiStartDate && dayOfTheYear <= GeminiEndDate) {
            return "Gemini";
        }

        if (dayOfTheYear >= CancerStartDate && dayOfTheYear <= CancerEndDate) {
            return "Cancer";
        }

        if (dayOfTheYear >= LeoStartDate && dayOfTheYear <= LeoEndDate) {
            return "Leo";
        }
        if (dayOfTheYear >= VirgoStartDate && dayOfTheYear <= VirgoEndDate) {
            return "Virgo";
        }
        if (dayOfTheYear >= LibraStartDate && dayOfTheYear <= LibraEndDate) {
            return "Libra";
        }
        if (dayOfTheYear >= ScorpioStartDate && dayOfTheYear <= ScorpioEndDate) {
            return "Scorpio";
        }
        if (dayOfTheYear >= SagittariusStartDate && dayOfTheYear <= SagittariusEndDate) {
            return "Sagittarius";
        }
        if (dayOfTheYear >= CapricornFinalStartDate && dayOfTheYear <= CapricornFinalEndDate) {
            return "Capricorn";
        }
        return "";
    }
}