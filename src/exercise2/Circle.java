package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

<<<<<<< HEAD
        System.out.print("Enter  radius: ");        double r = input.nextDouble();
=======
        System.out.print("Enter  radius: ");
        double r = input.nextDouble();
>>>>>>> 1d35b2986b44b06db38b10d49782db7d4b097036
        double c = 2 * Math.PI * r; 
        double a = Math.PI * r * r;
        System.out.println("Circumference: " + c);
        System.out.println("Area: " + a);
    }

}
