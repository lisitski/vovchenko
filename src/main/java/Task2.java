import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите пятизначное число: ");

        int num = scan.nextInt();
        String text = Integer.toString(num);
        int i = 0;
        int length = Integer.toString(num).length();

        while(i < length){
            char result = text.charAt(i++);
            System.out.println(result);
        }
        scan.close();
    }
}
