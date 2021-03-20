package cubeSum;

import java.util.Scanner;

/**
 * Name : Yalagooradappa Hebbal
 * Description :Check if a number is an increasing number
 * Date : 14/03/2021
 */
public class ChechIncreasingOrder {

	public static boolean checkNumber(int n)
	{
		boolean flag=false;
		int count=0;
		String str=String.valueOf(n);
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length()-1;i++)
		{
		
			if(ch[i]>ch[i+1])
			{
				count++;
				
			}
		}
		if(count==0)
		{
			flag=true;
		}
		return flag;
	}
	
	public static void main(String[] args) {

	  System.out.println("Enter the Number :");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
    boolean flag=checkNumber(n);
       if(flag)
       {
    	   System.out.println("Increasing Order ");
       }
       else
       {
    	   System.out.println("Not an Increasing Order :");
       }
	}

}
