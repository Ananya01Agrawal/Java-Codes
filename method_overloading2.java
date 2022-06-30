public class method_overloading2 {
    static void foo() {
        System.out.println("Good Morning bro!");
    }
    //Two or more methods can have same name but different parameters such methods are
    // are called overloaded methods.

    static void foo(int a,int b) {
        System.out.println("Good Morning" + a + "bro!");
        System.out.println("Good morning"+b+"bro!");
    }

    public static void main(String[] args) {
        //Method Overloading
        foo();
        foo(3000,4000);
    }
}

