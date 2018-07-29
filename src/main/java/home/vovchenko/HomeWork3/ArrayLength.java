package home.vovchenko.HomeWork3;

/*Пользователь задает длину массива (положительное число от 10 до 100).
Программа заполняет массив случайными числами. Выводит массив и все числа массива
кратные 3-ем.*/

import java.util.Random;
import java.util.Scanner;

public class ArrayLength {

    public static void main(String[] args) {

        System.out.println("Enter array length: ");

        Scanner scan = new Scanner(System.in);
        int arrayLength = scan.nextInt();

        if (arrayLength > 100 || arrayLength < 10) {
            System.out.println("Error... Value must be from  10 to 100");
            return;
        }

        int[] myArray = new int[arrayLength];

        Random random = new Random();

        System.out.println("Full Array");

        for (int i = 0; i < arrayLength; i++) {
            myArray[i] = random.nextInt();
            System.out.println(myArray[i] + " ");
        }

        System.out.println("All numbers of array multiple 3: ");

        for (int i = 0; i < arrayLength; i++) {
            if(myArray[i]%3==0) {
                System.out.println(myArray[i]);
            }
        }


    }
}
