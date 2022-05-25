package question1;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static String reversString(String input){
		//write the logic
		String string = "";
		for(int i=input.length()-1;i>=0;i--)
		{
			
			string = string + input.charAt(i);
		}
		
		char[] charArray = string.toCharArray();
		
		return(Arrays.toString(charArray));
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.nextLine();
		String result = reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);

	}

}
