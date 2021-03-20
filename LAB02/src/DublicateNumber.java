/**
 * Name : Yalagooradappa Hebbal
 * Description : Program to get the list of products with duplicate values
 * Date : 15/03/2021
 */
public class DublicateNumber {

	public static void main(String[] args) {
	System.out.println("Given Array :");
    int arr[]= {1,2,2,3,4,4,5};
    for(int ar:arr)
    	System.out.print(ar+" ");
    System.out.println();
    System.out.println("Dublicate Products :");
    for(int i=0;i<arr.length-1;i++)
    {
    	if(arr[i]==arr[i+1])
    	{
    		System.out.print(arr[i]+" ");
    	}
    }
  }
}
