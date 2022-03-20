package Java_Basics;

import java.util.Arrays;

public class StringsDemo_2 {

	public static void main(String[] args) {
		String str = "welcome,to,java,programming";
		
		String arr [] = str.split(",");
		
		System.out.println("--Output Before Sorting----------");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("--Output After Sorting----------");
		
		//Arrays.sort(arr); -> Sorting without passing any index.
		Arrays.sort(arr,1,3); // Method to sorting an Array in Java.
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
