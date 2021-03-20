/**
 * Name : Yalagooradappa Hebbal
 * Description :Fibonacci sequence is defined by the following rule
 * Date : 14/03/2021
 */
package cubeSum;

import java.util.Scanner;

public class fibbonacciSeries {
	
public static void getInput(int num)
{
	
	int a=0;
	int b=1;
	while(num>0)
	{
		System.out.print(a+" ");
	 int   c=a+b;
		a=b;
		b=c;
		
		num--;
	}
}


public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter the Number to print Fibbonacci sequance :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Fibonnacci Sequance is :");
		getInput(n);
	}
}
