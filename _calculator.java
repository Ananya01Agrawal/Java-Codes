import java.util.Scanner;
public class _calculator {
    public static void main(String[] args) {
        System.out.println("Making a calculator to calculate the marks of students:");
        Scanner sc = new Scanner(System.in);//taking input from the keyboard
        System.out.println("enter marks of subject 1");
        int a = sc.nextInt();
        System.out.println("enter marks of subject 2");
        int b = sc.nextInt();
        System.out.println("enter marks of subject 3");
        int c = sc.nextInt();
        System.out.println("enter marks of subject 4");
        int d = sc.nextInt();
        System.out.println("enter marks of subject 5");
        int e = sc.nextInt();
        System.out.println("calculating the marks of five subjects:");
        float sum = ((a + b + c + d + e)/500.0f)*100;
        System.out.println(sum);
    }
}


