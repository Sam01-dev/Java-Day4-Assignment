package question4;
import java.lang.Math;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==1)
		{
			int n=Integer.parseInt(args[0]);
			
			int ans = 1;
			
			for(int i=2;i<=n;i++)
			{
				ans= ans*i;
			}
			System.out.println(ans);
			
		}
		if(args.length==2)
		{
			int a = Integer.parseInt(args[0]) - Integer.parseInt(args[1]);
			int x = Math.abs(a);
			int res = 1;
			for(int i=2;i<=x;i++)
			{
				res=res*i;
			}
			System.out.println(res);
		}
		if(args.length>=3)
		{
			System.out.println("Error");
		}
	}

}
