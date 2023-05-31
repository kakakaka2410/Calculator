package Calculator;

import java.util.Scanner;

public class getNumber {
    public static int getVariable(){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        a = sc.nextInt();
        System.out.println("Enter b:");
        b = sc.nextInt();
        return a + b;
    }
}
