package home.vovchenko.HomeWork1;

public class Task {
    public static void main(String[] args) {
        taskLong( 60, 80, 90, 120);
        taskInt(10,20,7,2);
        taskFloat (5.6f,6.8f,8.8f, 8.4f);
        taskDouble (66.7,88.8,55.5,34.6);
    }

    //имя метода с прописной буквы
    public static void taskLong (long x, long y, long z, long n)
    {
        System.out.println ("Long result: " + (x - ( y + 123) / z * n));
    }

    //имя метода с прописной буквы
    public static void taskInt (int x, int y, int z, int n)
    {
        System.out.println ("Int result: " + ((x + (50 - y * z) / n) - x ));
    }
    
    //имя метода с прописной буквы
    public static void taskFloat (float x, float y, float z, float n)
    {
        System.out.println ("Float result: " + (x / (y * (z - 1) - 564) + n ));
    }

    //имя метода с прописной буквы
    public static void taskDouble (double x, double y, double z, double n)
    {
        System.out.println("Double result: " + ( -x / -y + z / (n + 15)));
    }
}
