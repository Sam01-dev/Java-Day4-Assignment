package question3;
import java.util.Arrays;
public class Main {
	
	public void findAndReturnPrimeNumbers(int[] inputArray){
		int[] res = new int[8];
		for(int i=0;i<inputArray.length;i++)
		{
			if((inputArray[i] / inputArray[i] == 0) && (inputArray[i]/1 == 0))
			{
				System.out.println(inputArray[i]);
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		Main main = new Main();
		int[] arr = {10,12,5,50,11,14,15};
		main.findAndReturnPrimeNumbers(arr);

	}

}
