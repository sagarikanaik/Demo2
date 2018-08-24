/* Import required packages*/
import java.io.*;
import java.util.Scanner;
public class Multi
{
	public static void main(String[] args)
	{
		int sum=0;
		int diag1=0;
		int diag2=0;
		int i,j,k;
		int big=0;
		int arr[][]={{2,7,9},{3,6,1},{7,4,2}};
		
		System.out.println("The elements are");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				sum=sum+arr[i][j];
			}
			
		}
		System.out.println("Total= "+sum);
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(k=0;j<3;j++)
				{
					if(arr[i][k]>arr[k][j])
					{
						big=arr[i][k];
					
					}
					else
					{
						big=arr[k][j];
					}
				}
			}
			
		}	
		System.out.println("The Max is:"+big);
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			
				if(i==j)
					diag1=diag1+arr[i][j];
				if(i==3-j-1)
					diag2=diag2+arr[i][j];
			}
			
		}
		System.out.println("The total of diagonal value is:"+diag1);
		
		System.out.println("The total of diagonal2 value is:"+diag2);

	}
}