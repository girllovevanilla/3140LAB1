import java.time.LocalDate;
import java.time.Period;


public class Main {
    public static void main(String[] args) {


        LocalDate currentDay = LocalDate.now();


        LocalDate dueDayOne = LocalDate.of(2022, 9, 28);
        LocalDate dueDayTwo = LocalDate.of(2022, 10, 26);
        LocalDate dueDayThree = LocalDate.of(2022, 11, 23);
        LocalDate dueDayFour = LocalDate.of(2022, 12, 7);

        System.out.println("Today is: ");
        System.out.println((currentDay));
        System.out.println("");


        System.out.println("Lab 1 due 2022-09-28");
        if(currentDay.isAfter((dueDayOne))) {
            System.out.println(dueDayOne + " Late");
        }else{
            Period period = Period.between(currentDay, dueDayOne);
            System.out.println("You still have: " + period.getMonths() + " month " + period.getDays() + " days");
        }

        System.out.println("----------------------------");

        System.out.println("Lab 2 due 2022-10-26");
        if(currentDay.isAfter((dueDayTwo))) {
            System.out.println(dueDayTwo + " Late");
        }else{
            Period period = Period.between(currentDay, dueDayTwo);

            System.out.println("You still have: " + period.getMonths() + " month " + period.getDays() + " days");
        }

        System.out.println("----------------------------");

        System.out.println("Lab 3 due 2022-11-23");
        if(currentDay.isAfter((dueDayThree))) {
            System.out.println(dueDayThree + " Late");
        }else{
            Period period = Period.between(currentDay, dueDayThree);

            System.out.println("You still have: " + period.getMonths() + " month " + period.getDays() + " days");
        }

        System.out.println("----------------------------");

        System.out.println("Lab 4 due 2022-11-23");
        if(currentDay.isAfter((dueDayFour))) {
            System.out.println(dueDayFour + " Late");
        }else{
            Period period = Period.between(currentDay, dueDayFour);

            System.out.println("You still have: " + period.getMonths() + " month " + period.getDays() + " days");
        }






    }
}