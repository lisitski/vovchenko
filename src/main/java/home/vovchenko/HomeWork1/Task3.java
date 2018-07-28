package home.vovchenko.HomeWork1;

public class Task3 {
    
    /**
      Это длинна вектора, а нужно найти единичный вектор.
    **/
    public static void main(String[] args)
    {
        vector(5, 0, 0);
    }
    public static void vector (int X, int Y, int Z)
    {
        double vectorLength = Math.sqrt( X * X + Y * Y + Z * Z );
        System.out.println("Vector Length: " + vectorLength);

        System.out.print ("Unit Vector: (" + X/vectorLength);
        System.out.print ("; " + Y/vectorLength);
        System.out.print ("; " + Z/vectorLength+ ")");
    }
}
