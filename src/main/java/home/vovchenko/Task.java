package home.vovchenko;

public class Task {
    public static void main(String[] args) {
        TaskLong( 60, 80, 90, 120);
        TaskInt(10,20,7,2);
        TaskFloat (5.6f,6.8f,8.8f, 8.4f);
        TaskDouble (66.7,88.8,55.5,34.6);
    }

    public static void TaskLong (long x, long y, long z, long n)
    {
        System.out.println ("Long result: " + (x - ( y + 123) / z * n));
    }

    public static void TaskInt (int x, int y, int z, int n)
    {
        System.out.println ("Int result: " + ((x + (50 - y * z) / n) - x ));
    }
    public static void TaskFloat (float x, float y, float z, float n)
    {
        System.out.println ("Float result: " + (x / (y * (z - 1) - 564) + n ));
    }

    public static void TaskDouble (double x, double y, double z, double n)
    {
        System.out.println("Double result: " + ( -x / -y + z / (n + 15)));
    }
}
