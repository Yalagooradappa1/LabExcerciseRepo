/**
 * Name : Yalagooradappa Hebbal
 * Description : program to Take 20 integer inputs from user and print the Number of positive Numbers ,Negative Numbers,Even Numbers,Odd Numbers,Numbers of Zero's
 * Date : 15/03/2021
 */
public class PosNagEvenOddZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,3,4,5,6,7,0,-1,2,-4,2,8,8,9,-8,10,11,12,-18};
		int pos=0;
		int nag=0;
		int even=0;
		int odd=0;
		int zero=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>=0)
			{
				pos++;
			}
			
			 if(ar[i]<0)
			{
				nag++;
			}
			
			 if(ar[i]%2==0)
			{
				even++;
			}
			
			 if(ar[i]%2!=0)
			{
				odd++;
			}
			
			 if(ar[i]==0)
			{
				zero++;
			}
			
		}
		System.out.println("Numbers of Postive Numbers in the Given Array : "+pos);
		System.out.println("Numbers of Nagative Numbers in the Given Array : "+nag);
		System.out.println("Numbers of Even Numbers in the Given Array : "+even);
		System.out.println("Numbers of Odd Numbers in the Given Array : "+odd);
		System.out.println("Numbers of Zero's Numbers in the Given Array : "+zero);

		
		

	}

}
