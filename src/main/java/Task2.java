public class Task2 {

    /**
    Эту задачу нужно решить математически. 
    Без преобразования числа в строку.
    Делим на 10000. Получаем первое число. Вычитаем из исходного числа результат полученной цифры умноженной на 10000.
    и так далее...
    **/
        public static void main (String [] args){
            int y = 67895;
            int x= 10;

            System.out.println (y/10000 % x);
            System.out.println (y/1000 % x);
            System.out.println (y/100 % x);
            System.out.println (y/10 % x);
            System.out.println (y % x);
        }
    }