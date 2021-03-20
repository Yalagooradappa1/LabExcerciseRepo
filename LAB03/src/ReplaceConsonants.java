import java.util.Scanner;
/**
 * Name : Yalagooradappa Hebbal
 * Description :Accepts a String and replaces all the consonants in the String with the next alphabet
 * Date : 16/03/2021
 */
public class ReplaceConsonants {

	public static char alterString(char str)
	{
		char repChar=(char) (str+1);
		return repChar;
	}
	public static void main(String[] args) {
      System.out.println("Give Input String :");
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      System.out.println("Replace Consonant OutPut :");
      char[] ch=str.toCharArray();
      String buf="";
      for(int i=0;i<ch.length;i++)
      {
    	  if(ch[i]=='a' || ch[i]=='e'  ||  ch[i]=='i'  ||  ch[i]=='o'  || ch[i]=='u' ||
    			  ch[i]=='A' || ch[i]=='E'  ||  ch[i]=='I'  ||  ch[i]=='O'  || ch[i]=='U')
    	  {
    		  char c=ch[i];
    		  buf+=c;
    	  }
    	  else
    	  {
    		  char b= alterString(ch[i]);
               buf+=b;
    	  }
       
      }
      System.out.println(buf);
	}

}
