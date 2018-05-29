public class Task3 {
    
    /**
      Это длинна вектора, а нужно найти единичный вектор.
    **/
    public static void main(String[] args)
    {
        vector(1, 0, 0);
    }
    public static void vector (int X, int Y, int Z)
    {
        System.out.println("Result: " +(Math.sqrt( X * X + Y * Y + Z * Z )));
    }
}
