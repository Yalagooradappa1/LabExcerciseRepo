package cubeSum;

import java.util.Scanner;

/**
 * Name : Yalagooradappa Hebbal
 * Description :Checks if the entered number is a power of two or not
 * Date : 14/03/2021
 */
public class powerOfTwo {

	
	public static boolean checkNumber(int n)
	{
		while(n%2==0)
		 {
		 n=n/2;
		 }
		 if(n==1)
		 {
		 return true;
		 }
		 else
		 {
		 return false;
		 }
	}
	public static void main(String[] args) {
		System.out.println("Enetr the Number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=checkNumber(n);
		if(flag)
		{
			System.out.println(n+" is Power of 2 ");
		}
		else
		{
			System.out.println(n+" is Not a Power Of 2");
		}
	}

}
