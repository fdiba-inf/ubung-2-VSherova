package exercise2;

import java.util.Scanner;

<<<<<<< HEAD

public class DayOfWeek {

    public static void main(String[] args) {
      System.out.println("Chose a number between 1 and 7");
      Scanner input= new Scanner(System.in);
      int number = input.nextInt();

      if (number == 1) {
        System.out.println ("Day of week: Monday");
         } else if (number == 2) {
           System.out.println ("Day of week: Tuesday");
           } else if (number == 3){
              System.out.println ("Day of week: Wednesday");
           } else if (number == 4) {
              System.out.println ("Day of week: Thursday");
           } else if (number == 5) {
              System.out.println ("Day of week: Friday");
           } else if (number == 6) {
              System.out.println ("Day of week: Saturday");
           } else if (number == 7) {
              System.out.println ("Day of week: Sunday");
           } else  {
              System.out.println ("Day of week: Invalid day");
           }

    }












      }
=======
public class DayOfWeek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day of week: ");
        int number = input.nextInt();

        if (number == 1) {
         System.out.println("Day of week: Monday");
        } else if (number == 2){
          System.out.println("Day of week: Tuesday");
        }else if (number == 3){
          System.out.println("Day of week: Wednesday");
        }else if (number == 4){
          System.out.println("Day of week: Thursday");
        }else if (number == 5){
          System.out.println("Day of week: Friday");
        }else if (number == 6){
          System.out.println("Day of week: Saturday");
        }else if (number == 7){
          System.out.println("Day of week: Sunday");
        }else {
          System.out.println("Invalid day");
        }
      input.close();
    }}
>>>>>>> 1d35b2986b44b06db38b10d49782db7d4b097036
