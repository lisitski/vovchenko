package home.vovchenko.HomeWork2;

import java.util.Scanner;

/*Сначала единственным программистом в компании был ее основатель, а каждый
следующий программист, которого нанимали на работу, проходил по одному
собеседованию с каждым из программистов, которые уже работали в компании на тот
момент. Зная текущее количество программистов (вводится пользователем), определите,
сколько всего собеседований было проведено в стенах компании.*/
public class Recursion {
    public static void main(String[] args) {
        System.out.println("Enter number of developers: ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int a = fact(value);
        System.out.println("Quantity of interview: " + a);

    }

    static int fact(int n) {
        int result;

        if (n == 1)
            return 1;

        result = fact(n - 1) * n;
        return result;
    }
}
