package Calculator;

import java.util.Scanner;

public class QuadraticEquation {
    public static void SolveQuadEqua(){
        double a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        a = sc.nextDouble();
        System.out.println("Enter b:");
        b = sc.nextDouble();
        System.out.println("Enter c:");
        c = sc.nextDouble();



        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The result of x1 is " + x1 + " and x2 is " + x2);
        }


        else{
            System.out.println("Delta is negative, please try again");
        }

    }
}
