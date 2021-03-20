import java.util.HashSet;

/**
 * Name : Yalagooradappa Hebbal
 * Description : Java program to find the length of the longest consecutive elements sequence from a given unsorted array of integers
 * Date : 15/03/2021
 */
public class LengthOfLongestConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]= {49,1,3,200,2,4,70,5};
	HashSet<Integer> set=new HashSet<Integer>();
	for(int i=0;i<ar.length;i++)
	{
		set.add(ar[i]);
	}
 
	int longLen=0;
	for(int i=0;i<ar.length;i++)
	{
		if(!set.contains(ar[i]-1))
		{
			int n=ar[i];
			while(set.contains(n))
			{
				n++;
			}
			
			if(longLen<n-ar[i])
			{
				longLen=n-ar[i];
			}
		}
	}
	
	System.out.println("Length of Longest Subsequance  : "+longLen);
	}

}
