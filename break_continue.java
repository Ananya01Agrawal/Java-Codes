public class break_continue {
    public static void main(String[] args) {
        // break and continue using the for loop
        /*for (int i=0;i<5;i++){
            System.out.println(i);
            System.out.println("java is great");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }


        // while using with the while loop
        int i=0;
        while(i<5) {
            System.out.println(i);
            System.out.println("java is great");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }
        System.out.println("Loop ends here");

         */

        // use of continue statement
        for (int i=0;i<5;i++){
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }

    }
}
