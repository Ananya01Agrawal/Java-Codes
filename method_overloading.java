public class method_overloading {
    static void change(int a){
        a=98;
    }
    static void change2(int[] arr){
        arr[0]=98;
    }
    static void tellJoke(){
            System.out.println("I invented a new word!\n " +
                    "Plagiarism");
        }
    public static void main(String[] args) {
            //tellJoke();
        int []marks={52,75,77,89,98,64};
        // case 1:Changing the integer
        //int x=45;
        //change(x);
        //System.out.println("the value of x after running change is " + x);
        change2(marks);
        System.out.println("the value of x after running change is: " +marks[0]);

    }
}
