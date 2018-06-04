package home.vovchenko;

public class Task {
    public static void main(String[] args) {
        tasklong( 60, 80, 90, 120);
        taskint(10,20,7,2);
        taskfloat (5.6f,6.8f,8.8f, 8.4f);
        taskdouble (66.7,88.8,55.5,34.6);
    }

    //имя метода с прописной буквы
    public static void tasklong (long x, long y, long z, long n)
    {
        System.out.println ("Long result: " + (x - ( y + 123) / z * n));
    }

    //имя метода с прописной буквы
    public static void taskint (int x, int y, int z, int n)
    {
        System.out.println ("Int result: " + ((x + (50 - y * z) / n) - x ));
    }
    
    //имя метода с прописной буквы
    public static void taskfloat (float x, float y, float z, float n)
    {
        System.out.println ("Float result: " + (x / (y * (z - 1) - 564) + n ));
    }

    //имя метода с прописной буквы
    public static void taskdouble (double x, double y, double z, double n)
    {
        System.out.println("Double result: " + ( -x / -y + z / (n + 15)));
    }
}
