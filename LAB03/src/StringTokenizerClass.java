import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Name : Yalagooradappa Hebbal
 * Description :Java program that reads a line of integers and then displays each integer and the sum of all integers. (Use String Tokenizer class)
 * Date : 16/03/2021
 */
public class StringTokenizerClass {


	public static void main(String[] args) {
		System.out.println("Given Input String :");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str);
		System.out.println("String To Integer Output :");
		int sum=0;
		StringTokenizer st=new StringTokenizer(str," ");
		while(st.hasMoreTokens())
		{
			String temp=st.nextToken();
			int n=Integer.parseInt(temp);
			System.out.print(n+" ");
			sum+=n;
		}
		System.out.println();
		System.out.println("Integer Sum :");
        System.out.println(sum);
	}

}
