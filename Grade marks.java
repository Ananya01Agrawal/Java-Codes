package JAVA_QUESTIONS;
import java.util.*;

public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks>=75) {
			System.out.println("A");
		}
		else if(marks >=65) {
			System.out.println("B");
		}
		else if(marks>=55) {
			System.out.println("C");
		}
		else if(marks>=45) {
			System.out.println("D");
		}
		else {
			System.out.println("Fail");
		}
		// TODO Auto-generated method stub

	}

}
