package home.vovchenko.HomeWork3;

/*Пользователь вводит строку.
Программа разбивает строку на слова, и “переворачивает” каждое слово, формирует из
новых слов предложение и выводит его на экран.*/

import java.util.Scanner;

public class TransferLine {

    public static void main(String[] arg) {

        System.out.println("Enter your line: ");

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        String[] s = line.split(" ");

        for(int i = s.length - 1 ; i >= 0 ; i-- ) {
            System.out.print(s[i] + " ");
        }


    }
}