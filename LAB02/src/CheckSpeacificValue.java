/**
 * Name : Yalagooradappa Hebbal
 * Description : Java program to test if an array contains a specific value
 * Date : 15/03/2021
 */
public class CheckSpeacificValue {

	public static void main(String[] args) {
		System.out.println("Given Array :");
		int ar[]= {1,2,3,4,5,6,7};
		for(int a:ar)
		System.out.print(a+" ");
		System.out.println();
		int speValue=5;
		System.out.println("specific Value : "+speValue);
		boolean flag=false;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==speValue)
			{
			flag=true;	
			}
			
		}
		
		if(flag)
		{
			System.out.println("Yes " +speValue+" Is Present In The Given Array");
		}
		else
		{
			System.out.println("No " +speValue+"  Is Not In The Given Array");
		}
	}

}
