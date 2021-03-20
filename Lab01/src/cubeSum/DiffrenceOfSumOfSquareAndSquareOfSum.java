package cubeSum;

import java.util.Scanner;

/**
 * Name : Yalagooradappa Hebbal
 * Description : Find the difference between the sum of the squares and the square of the sum of the first n natural numbers
 * Date : 14/03/2021
 */
public class DiffrenceOfSumOfSquareAndSquareOfSum {
	
	public static int calculateDifference(int n)
	{
		int sum1=0;
		int squareOfSum=0;
		for(int i=1;i<=n;i++)
		{
			sum1+=i;
			int square=i*i;
			squareOfSum+=square;
		}
		int sumOfSquare=sum1*sum1;
		
		return Math.abs(sumOfSquare-squareOfSum);
		
	}
	
	public static void main(String[] args) {
        System.out.println("Enter The Natural Number :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int diffrence= calculateDifference(n);
        System.out.println("Diffrence between Sum of Square and Square of Sum : ");
        System.out.println(diffrence);
	}

}
 