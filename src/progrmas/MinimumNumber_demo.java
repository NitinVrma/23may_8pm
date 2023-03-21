package progrmas;

import java.util.Scanner;

public class MinimumNumber_demo {
		public  void  getmin(int a[])
		{
			int min =a[0];
			for (int i=0;i<=a.length-1;i++)
			{
			if (a[i]<min)
				{
					min=a[i];
				}
			}
			System.out.println(min);
		}
		public static void main(String[] args) 
		{
			MinimumNumber_demo ob = new MinimumNumber_demo();
			int a[]=new int[5];
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter the 5 input ");
			for (int i=0;i<=4;i++)
			{
				a[i]=sc.nextInt();
			}
			ob.getmin(a);
		}
}

