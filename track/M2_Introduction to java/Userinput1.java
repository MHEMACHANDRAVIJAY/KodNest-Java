import java.util.Scanner;
public class Userinput1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter byte value : ");
        byte a = scan.nextByte();
        System.out.println("Byte values is " + a);

        System.out.println("Enter short value :");
        short b = scan.nextShort();
        System.out.println("Short value is : " + b);
        System.out.print("Enter integer value : ");
        int c = scan.nextInt();
        System.out.println("Integer value is : " + c);

        System.out.print("Enter long value : ");
        long d = scan.nextLong();
        System.out.println("Long value is : " + d);
        System.out.print("Enter float value : ");
        float e = scan.nextFloat();
        System.out.println("Float value is : " + e);
        System.out.print("Enter double value : ");
        double f = scan.nextDouble();
        System.out.println("Double value is : " + f);
        System.out.print("Enter boolean value : ");
        boolean g = scan.nextBoolean();
        System.out.println("Boolean value is : " + g);
        System.out.print("Enter character value : ");
        char h = scan.next().charAt(0);
        System.out.println("Character value is : " + h);
        scan.close();

    }


}
