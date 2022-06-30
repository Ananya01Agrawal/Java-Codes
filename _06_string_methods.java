import java.sql.SQLOutput;
import java.util.Locale;

public class _06_string_methods {
    public static void main(String[] args) {
        String name= "Ananya";
        //String a1=new String("Ananya");
        //System.out.println(a);
        //int value= name.length();//calculate the length of the String
        //String lstring =name.toLowerCase();// change to the lower case
        //System.out.println(lstring);

        //String ustring = name.toUpperCase();//change to the upper case
        //System.out.println(ustring);

        //String nonTrimmedString="    Ananya   ";
        //System.out.println(nonTrimmedString);

        //String trimmedString= nonTrimmedString.trim();// returned the string after removing the spaces
        //System.out.println(trimmedString);


        //System.out.println(name.substring(3));
        //System.out.println(name.substring(1,3));

        //System.out.println(name.replace("n","ip"));

        //System.out.println(name.endsWith("nya"));//return true if end with the given string

        //System.out.println(name.charAt(3));//return the character at the given index

        //System.out.println(name.indexOf("n"));//return the position at the first occurence

        //String modifiedName ="Harryrry";
        //System.out.println(modifiedName.indexOf("rry",4));
        //if match didn't found it will return the -1
        //System.out.println(modifiedName.lastIndexOf("rry",4));

        System.out.println(name.equals("ananya"));//check whether the given string is equal or not
        // if we want to ignore the case

        System.out.println(name.equalsIgnoreCase("ananya"));








    }
}
