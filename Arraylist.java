import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);//adding the element to the list
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(5,5);  // inserts 5 at the 5th index in l1

        System.out.println(l1);
        System.out.println("Array list before : "+ l1);

        l1.remove(0);// it is used to remove delete or remove particular elemnt at the given index
        System.out.println("ArrayList after removing the value at index 0 :" + l1);
        System.out.println("L1 list contains 7 : " + l1.contains(7));// it is used to check whether the arraylist contains the specified elemnt or not
        System.out.println("L1 list contains 4 : " + l1.contains(4));
         System.out.println("The last occurrence of 3 in l1 is at index : " + l1.lastIndexOf(3));//find the index of the last occurrence of an element with the help of the lastIndexOf() method.

    }
}
/*
Output :
[1, 2, 3, 4, 6, 5]
Array list before : [1, 2, 3, 4, 6, 5]
ArrayList after removing the value at index 0 : [2, 3, 4, 6, 5]
L1 list contains 7 : false
L1 list contains 4 : true

*/


