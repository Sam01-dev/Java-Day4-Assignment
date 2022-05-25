package question2;

import java.util.Arrays;

public class evenSum {

	public static void main(String[] args) {
		
		int [][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int row=0;row<arr.length;row++)
		{
			int mainSum=0;
			for(int col=0;col<arr.length;col++)
			{
				int sum = 0;
				if(arr[col][row] % 2 == 0)
				{
					sum=sum+arr[col][row];
				}
				mainSum= mainSum+sum;			
			}
			System.out.println(mainSum);
			
		}
			
		
		
		

	}

}
