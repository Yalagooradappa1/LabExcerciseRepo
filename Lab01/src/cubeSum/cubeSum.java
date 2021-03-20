/**
 * Name : Yalagooradappa Hebbal
 * Description : Find the sum of the cubes of the digits of an n digit number
 * Date : 14/03/2021
 */
package cubeSum;

import java.util.Scanner;

public class cubeSum {
	
	private static int getInput(int n) {
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Enter The Number :");
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   System.out.println("Cube Sum Is :");
   int cubeSum=  getInput(n);
   System.out.println(cubeSum);
	}
}
