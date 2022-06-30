import java.util.Scanner;

public class switch_elif {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age:");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        /*

        if( age>56){
            System.out.println("you are experienced");
        }
        else if( age>46){
            System.out.println("you are semi experienced");
        }
        else if(age>36){
            System.out.println("you are semi semi experienced");
        }
        else{
            System.out .println("you are not experienced");
        }
        */


         switch(age){
             case 18:
                 System.out.println("you are going to become an adult");
                 break;
             case 23:
                 System.out.println("you are going to join a adult");
                 break;
             case 60:
                 System.out.println("you are going to get retired");
                 break;
             default:
                 System.out.println("Enjoy your life");
         }
         System.out.println("thanks for using my javacode");
    }
}
