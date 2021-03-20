import java.util.Scanner;

/**
 * Name : Yalagooradappa Hebbal
 * Description :Accepts a number and modifies it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number
 * Date : 16/03/2021
 */

public class ModifyNumber {
   
	public static int modifyNumber(String str)
	{
		StringBuffer s=new StringBuffer();
		int len=str.length();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			int a=Integer.parseInt(String.valueOf(ch[i]));
			int b=Integer.parseInt(String.valueOf(ch[i+1]));
			int dif=Math.abs(a-b);
			s.append(dif);
	    }
		
		s.append(ch[len-1]);
		String st=s.toString();
		int ans=Integer.parseInt(st);
		return ans;
	}
	public static void main(String[] args) {
		System.out.println("Enetr  the Integer Number :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Modified Integer Number OutPut:");
		String str=String.valueOf(n);
		
	int modNum=modifyNumber(str);
		System.out.println(modNum);

	}

}
