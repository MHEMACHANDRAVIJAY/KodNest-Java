import java.util.Scanner;
public class userinput2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = scan.nextInt();
    
        System.out.println("Enter your height :");
        float height = scan.nextFloat();
        System.out.println("Your height is : " + height);
        scan.nextLine();
        System.out.println("Enter your name :");
        String name = scan.nextLine();
        System.out.println("Your name is : " + name);

    }

}
