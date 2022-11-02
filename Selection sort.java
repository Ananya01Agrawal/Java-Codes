package JAVA_QUESTIONS;

public class selection {
	public static void main(String[]args) {
		int []arr= {3,4,5,7,6,8};
		Sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr);
		}
	}
	public static void Sort(int []arr) {
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
		}
	}
}
