import java.util.Scanner;
public class _05_user_input{
    public static void main(String[] args) {
        System.out.println("The sum of two numbers:");
        Scanner sc=new Scanner(System.in);//taking input from the keyboard
        System.out.println("enter number 1");
        int a= sc.nextInt();
        //boolean b1=sc.hasNextInt();
        System.out.println("enter number 2");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println(sum);

    }
}