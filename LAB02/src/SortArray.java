/**
 * Name : Yalagooradappa Hebbal
 * Description : program to get the sorted list of Products name
 * Date : 15/03/2021
 */
public class SortArray {

	public static void main(String[] args) {
		System.out.println("Given Array String :");
		String str="cognizant";
		System.out.println(str);
		char[] chArray=str.toCharArray();
		for(int i=0;i<chArray.length;i++)
		{
			for(int j=i+1;j<chArray.length;j++)
			{
				if(chArray[i]>chArray[j])
				{
					char temp=chArray[i]; 
					chArray[i]=chArray[j];
					chArray[j]=temp;
				}
			}    
		}
		System.out.println("Sorted Array String : ");
		for(char arr:chArray)
		System.out.print(arr);
	}

}
