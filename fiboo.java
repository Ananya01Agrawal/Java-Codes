 import java.util.*;
public class fiboo {
    public static void main(String[]args) {
        int ans=fiboo(50);
        System.out.println(ans);
    }
    static void print(int n){
        //base condition
        if(n==5){
            System.out.println(5);
            return;
        }

        System.out.println(n);

        //recursive call
        //if you are calling a function again and again you can treat it as
        // a separate call int the stack
        print(n+1);

    }
    static int fiboo(int n){
        if(n<2){
            return n;
        }
        return fiboo(n-2)+fiboo(n-1);
    }
}
