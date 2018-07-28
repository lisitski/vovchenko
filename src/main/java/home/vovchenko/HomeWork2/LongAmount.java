package home.vovchenko.HomeWork2;
/*Задача 2.
Есть целое положительное число (long). Программа должна определить сумму цифр из которых состоит число.
Сумма цифр числа 15875 => 26*/

import java.util.Scanner;

public class LongAmount {
     public static void main (String [] args){
        System.out.print("Enter your value: ");
         Scanner sc = new Scanner(System.in);
              Long valueLong = sc.nextLong();
        String value = valueLong.toString();
        int summ = 0;

        for (int index = 0; index < value.length(); index++){
             char valueChar = value.charAt(index);
             int resultInt = Character.getNumericValue(valueChar);
             summ = summ + resultInt;
            // System.out.println("Result: " + resultInt);
        }
        System.out.println(summ);

     }
}
