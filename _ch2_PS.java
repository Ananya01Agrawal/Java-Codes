import java.util.Scanner;
public class _ch2_PS {
    public static void main(String[] args) {
        /*
        1. write a java program to encrypt a grade by adding 8 to it. decrypt it to
        show the correct grade

        char grade='B';
        grade=(char)(grade+8);
        System.out.println(grade);

        //decrypt the grade
        grade=(char)(grade-8);
        System.out.println(grade);
        */

        /*
        2. use comparison operators to find out whether a  given number is greater than
        the user entered number or not.
         */

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a>8);


    }
}

