package home.vovchenko.HomeWork3;

import java.util.Scanner;

/*Пользователь вводит последовательность символов.
Программа должна определить, является ли последовательность палиндромом.
Вывести ДА, если последовательность символов палиндром и НЕТ в противном случае.*/


public class IsItPolindrom
{
    public static void main(String[] args){

        System.out.println("Enter сharacter sequence: ");

        Scanner scan = new Scanner(System.in);
        String sequence = scan.next();

        StringBuilder newSequence = new StringBuilder(sequence);
        System.out.println("Reversed sequance: " + newSequence.reverse().toString());

        boolean comparison = sequence.equals(newSequence.toString());
        System.out.println("Is string polindrom: " + comparison);
    }

}
