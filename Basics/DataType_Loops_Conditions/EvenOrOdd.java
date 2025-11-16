//Program to find Even or Odd numbers from 1 to 100
package JavaPractice;

import java.util.Scanner;

public class PrintEvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter the range end value:");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println("Even Numbers");
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		System.out.println("Odd Numbers");
		for(int i=0;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
			
		}
		input.close();

	}

}

