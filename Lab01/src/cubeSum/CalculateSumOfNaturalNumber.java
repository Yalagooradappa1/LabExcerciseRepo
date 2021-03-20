package cubeSum;

import java.util.Scanner;

/**
 * Name : Yalagooradappa Hebbal
 * Description : Calculate the sum of first n natural numbers which are divisible by 3 or 5
 * Date : 14/03/2021
 */
public class CalculateSumOfNaturalNumber {

	public static int calculateSum(int n,int a,int b) {
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=n;i++)
		{
			if(i%a==0)
			{
				sum1+=i;
			}
			else if(i%b==0)
			{
				sum2+=i;
			}
		}
		
		return sum1+sum2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Natural Number :");
		int n=sc.nextInt();
		int a=3;
		int b=5;
	int sumOfNatuNumber=calculateSum(n,a,b);
	System.out.println("Sum of The  Natural Number : " +sumOfNatuNumber);
	}

}
