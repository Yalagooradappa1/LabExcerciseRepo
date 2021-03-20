/**
 * Name : Yalagooradappa Hebbal
 * Description : java program that simulates a traffic light
 * Date : 14/03/2021
 */
package cubeSum;

import java.util.Scanner;

public class trafficLight {
	public static String colour(int n)
	{
		String a="";
		switch(n)
		{
		case 1:
			a="RED";
			break;
			
		case 2:
			a="YELLOW";
			break;
			
		case 3:
			a="GREEN";
			break;
		}
		return a ;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter The Number :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String selColour=colour(n);
		System.out.println("User Selected Light Is :");
		System.out.println(selColour);
		System.out.println("Output Indicate : ");
		switch(selColour)
		{
		case "RED" :
			System.out.println("STOP");
			break;
			
		case "YELLOW" :
			System.out.println("READY");
			break;
			
		case "GREEN" :
			System.out.println("GO");
			break;
		}

	}

}
