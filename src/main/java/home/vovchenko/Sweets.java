package home.lr1;

import java.util.Scanner;

public class Sweets {
    public static void main(String[] args) {

        Scanner price = new Scanner(System.in);
        double sweets = price.nextDouble();
        double cookies = price.nextDouble();

        double a = sweets * 0.3 + cookies * 0.4;
        double b = (sweets * 2 + cookies * 1.8)*3;

        System.out.println("First task result = " + a);
        System.out.println("Second task result = " + b);

    }
}
