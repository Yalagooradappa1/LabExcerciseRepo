import java.util.Scanner;
/**
 * Name : Yalagooradappa Hebbal
 * Description : Accepts a String and checks if it is a positive string
 * Date : 16/03/2021
 */
public class positiveString {

	public static void main(String[] args) {
		System.out.println("Enetr the string :");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println("Positive String OutPut :");
		char[] ch=str.toCharArray();
		boolean flag=true;
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]>ch[i+1])
			{
				flag=false;
			}
		}
		System.out.println(flag);

	}

}
