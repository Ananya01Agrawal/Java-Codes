public class foreach_array {
    public static void main(String[] args) {
        int[] marks={100,70,80,71,98};
        //float [] marks={98.1f,45.5f,79.5f,99.5f,80.5f};// floating point array
        //String [] student={"harry","Rohan","Subham","Lovish"};
        System.out.println(marks.length);//if we want to calculate the length of the array
        /* Displaying the array(Naive way)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        this is not a nice practice so we will use the foreach loop
        */
        // Displaying the array with the help of for loop
        System.out.println("Printing using the for loop");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        // Quick quiz:Displaying the array in reverse order
        System.out.println("Printing the array in reverse order using the for loop");
        for(int i=marks.length -1;i>=0;i--) {
            System.out.println(marks[i]);
        }
        //Displaying array with the help of foreach loop
        System.out.println("Printing the array  using the foreach loop");
        for(int element:marks) {
            System.out.println(element);
        }



    }
}
