package home.vovchenko.HomeWork2;

import java.util.Scanner;


public class Grid {
    public static void main(String[] args) {
        System.out.println("Enter your spaces:");
        Scanner num = new Scanner(System.in);
        String inputSpaces = num.nextLine();

        int width = 0;

        if (inputSpaces.length() % 3 == 0 && inputSpaces.length() <= 9 && inputSpaces.length() >= 3) {
            width = inputSpaces.length();
        } else {
            System.out.println("incorrect input length, please try again");
            return;
        }

        for (int i = 0; i < inputSpaces.length(); i++) {
            if (inputSpaces.charAt(i) != ' ') {
                System.out.println("incorrect input, please try again");
                return;
            }

        }

        int height = width / 3;
        int matrixSize = 4;

        StringBuilder valueSpaces = new StringBuilder();
        StringBuilder valueAsterix = new StringBuilder();

        for (int i = 0; i < width; i++) {
            valueSpaces.append(" ");
            valueAsterix.append("*");
        }

        String lastAsterixes = "";

        for (int indexRow = 0; indexRow < matrixSize; indexRow++) {
            String currentAsterix = "";
            StringBuilder currentSpaces = new StringBuilder();

            for (int indexColumn = 0; indexColumn < matrixSize; indexColumn++) {
                currentAsterix = currentAsterix + "*";
                currentSpaces.append("*");

                currentAsterix = currentAsterix + valueAsterix;
                currentSpaces.append(valueSpaces);
            }

            lastAsterixes = currentAsterix + "*";
            System.out.println(lastAsterixes);

            for (int i = 0; i < height; i++) {
                System.out.println(currentSpaces + "*");
            }
        }

        System.out.println(lastAsterixes);
    }
}