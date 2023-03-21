package progrmas;

import java.util.Scanner;

public class tablebyarrray {

			public void gettable()
	{
		int a[]= new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int k=0;k<=4;k++)
		{
			int num=a[k];
			
			for(int j=1;j<=10;j++)
			{
				System.out.println(num+"*"+j+"="+num*j);
			}
			
			
			
		}
		
	}
	
	public static void main(String[] args) {
		tablebyarrray ob = new tablebyarrray();
		ob.gettable();
	}

}
