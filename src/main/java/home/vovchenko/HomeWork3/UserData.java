package home.vovchenko.HomeWork3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Программа запрашивает у пользователя ФИО, мобильный телефон и email, и проверяет
данные на валидность с помощью регулярных выражений.
ФИО - только буквы английского алфавита, дефис и пробел
Мобильный телефон - +380 далее 2 цифры кода (украина) и 7 любых цифр
email - любые латинские символы, цифры, дефис и нижний прочерк, обязательный символ @
и . Проверить все вводимые данные и вывести неверно введенные.*/
public class UserData {

    public static void main(String[] args) {

        System.out.println("Enter your full name: ");
        Scanner scan = new Scanner(System.in);
        String fullName = scan.nextLine();

        Pattern namePattern = Pattern.compile("^([A-z\\-]*\\s)+([A-z\\-]*\\s)+([A-z\\-]*)$");
        Matcher nameMatcher = namePattern.matcher(fullName);

        if (!nameMatcher.find()) {
            System.out.println("Incorrect data: " + fullName);
        }

        System.out.println("Enter your phone number: ");
        String phoneNumber = scan.nextLine();

        Pattern phonePattern = Pattern.compile("^(\\+380(66|63|95|93|99|67|97|98)+([0-9]{7}))$");
        Matcher phoneMatcher = phonePattern.matcher(phoneNumber);

        if (!phoneMatcher.find()) {
            System.out.println("Incorrect phone number: " + phoneNumber);
        }

        System.out.println("Enter your email: ");
        String userEmail = scan.nextLine();

        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher emailMatcher = emailPattern.matcher(userEmail);

        if (!emailMatcher.find()) {
            System.out.println("Incorrect email address: " + userEmail);
        }

    }
}
