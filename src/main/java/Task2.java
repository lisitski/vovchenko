import java.util.Scanner;
public class Task2 {

    /**
    Эту задачу нужно решить математически. 
    Без преобразования числа в строку.
    Делим на 10000. Получаем первое число. Вычитаем из исходного числа результат полученной цифры умноженной на 10000.
    и так далее...
    **/
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
