public class Vargs {
    /*
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a, int b,int c){
        return a+b+c;
    }
    */
     static int sum(int ...arr){
         //Available as int[] arr;
         int result=0;
         for(int a:arr){
             result+=a;
         }
         return result;

     }
    public static void main(String[] args) {
        // we can give more than one agrument to a variable
        System.out.println("Welcome to the Varargs Tutorial");
        System.out.println("The sum of 4 and 5 is: " +sum(4,5));
        System.out.println("the sum of 4, 3 and 5 is:" +sum(4,3,5));
        System.out.println("The sum of 2, 4 and 3 is:" +sum(4,3,5));


    }
}
