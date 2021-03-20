import java.util.Scanner;

/**
 * Name : Yalagooradappa Hebbal
 * Description : Create the mirror image of a String
 * Date : 16/03/2021
 */ 

public class MirrorImageOfString {

	public static String getImage(String str)
	{
		
		char[] ch=str.toCharArray();
		String buf="";
		for(int i=ch.length-1;i>=0;i--)
		{
			buf+=ch[i];
		}
		
		String img=str+"|"+buf;
		return img;
	}
	public static void main(String[] args) {
		System.out.println("Give Input String : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println("Mirror Image Of The Given String :");
	String img=	getImage(str);
		System.out.println(img);

	}

}
