import java.util.Arrays;
/**
 * Name : Yalagooradappa Hebbal
 * Description : Accept an array of String objects and sort in alphabetical order
 * Date : 15/03/2021
 */
public class SortStringToPrintUpperAndLowerCase {
    
	public static String sortStrings(char[] chArray)
	{
		Arrays.sort(chArray);
		int len=chArray.length;
		String a="";
		String b="";
		for(int i=0;i<len;i++) {
		   
			if(i<(len/2) && len%2==0)
			{
				a+=chArray[i];
			
			}
			
			else if(i>=(len/2) && len%2==0 )
			{
				b+=chArray[i];
				
			}
			 
			int l=(len/2)+1;
			if(i<l && len%2!=0)
			{
				a+=chArray[i];
			
			}
			
			else if(i>=l && len%2!=0)
			{
				b+=chArray[i];		
			}  
                  
		}
		
		String upper=a.toUpperCase();
		String lower=b.toLowerCase();
		String upperLowerCase=upper+lower;
		return upperLowerCase;
	}
	
	public static void main(String[] args) {
		System.out.println("Given String :");
		String str="cognizant";
		System.out.println(str);
		System.out.println("upperAndLowerCaseString :");
		char[] chArray=str.toCharArray();
		String upperLowerCase=sortStrings(chArray);
		System.out.println(upperLowerCase);

	}

}
