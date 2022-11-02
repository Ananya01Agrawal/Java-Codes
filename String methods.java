package JAVA_QUESTIONS;

public class string_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HelloHey";
		System.out.println(s.charAt(3));
		System.out.println(s.length());
		System.out.println(s.substring(2,5));
		System.out.println(s.substring(1,1));
		String s1="Kunal";
		String s2="Komal";
		System.out.println(s1.compareTo(s2));
		SubString("HELLO");
		pallindrome("NAMAN");
		pallindrome("APPLE");
		pallindrome("11311");
		pallindrome("FLYLF");

	}
	public static int compareTo(String s1,String s2) {
		int i=0;
		int j=0;
		while(i<s1.length()&& j<s2.length()) {
			if(s1.charAt(i)!=s2.charAt(j)) {
				return s1.charAt(i)-s2.charAt(j);
			}
			i++;
			j++;
		}
		
		return s1.length()-s2.length();
		
	}
	public static void SubString(String s) {
		for(int i = 0;i < s.length();i++) {
			for(int j = i+1;j <= s.length();j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}
	public static void pallindrome(String s) {
		String p = "";
		int f = 0;
		for(int i = 0,j = s.length()-1;i <= j;i++ , j--) {
			if(s.charAt(i)==s.charAt(j)) {
				f = 1;
			}else {
				f = 0;
				break;
			}
		}
		if(f == 0) {
			System.out.println("not palindrome");
		}else {
			System.out.println("palindrome");
		}
		
	}
}
