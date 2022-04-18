import java.util.Scanner;
public class takinginput {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in); // Scanner class object is created here
        // System.out.println("Enter number 1");
        // // int a=sc.nextInt();
        // float a=sc.nextFloat();
        // System.out.println("Enter number 2");
        // // int b =sc.nextInt();
        // float b=sc.nextFloat();
        // // int sum = a+b;
        // float sum=a+b;
        // System.out.println("Sum of numbers" + " " + sum);

        // boolean b1=sc.hasNextInt();
        // System.out.print(b1);

        // String str = sc.next();
        // System.out.println("Name:" + str); //only one word input

        String str1 = sc.nextLine();
        System.out.println("Name and Age: " + str1);
        // whole sentence

    }
}
