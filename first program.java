package JAVA_QUESTIONS;
import java.util.*;
public class First_program {

	public static void main(String[] args)/* throws IOExecption*/ {
		// TODO Auto-generated method stub
		//BufferdReader br =new BufferReader(new InputSteamReader(System.in));
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a);
		}
		else if(b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}

	}

}
