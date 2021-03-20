import java.util.Arrays;
/**
 * Name : Yalagooradappa Hebbal
 * Description : Accepts an array of integer elements and return the second smallest element in the array
 * Date : 15/03/2021
 */
public class SecondSmallest {
	
	
     public static int getSecondSmallest(int ar[])
     {
    	 Arrays.sort(ar);
    	 int secSmall=0;
    	 for(int i=0;i<ar.length;i++)
    	 {
    		 secSmall=ar[1];
    		 break;
    	 }
    	 return secSmall;
     }
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {7,8,5,2,1,5};
		int getSmall=getSecondSmallest(ar);
       System.out.println("Second Smallest Number In The Given Array : "+getSmall);
	}

}
