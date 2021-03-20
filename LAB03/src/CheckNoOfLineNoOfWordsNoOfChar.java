/**
 * Name : Yalagooradappa Hebbal
 * Description : Java program that displays the number of characters, lines and words in a text
 * Date : 16/03/2021
 */
public class CheckNoOfLineNoOfWordsNoOfChar {

	public static void main(String[] args) {
     String str="i love india.i love my momy .";
     String r=str.replace(".", " ");
     String[] sp=r.split(" ");
     System.out.println("No of word in the given string : "+sp.length);
     String rep=r.replaceAll(" ", "");
     System.out.println("No Of Characters In The Given String : "+rep.length());
      char[] ch=str.toCharArray();
      int line=0;
      for(int i=0;i<ch.length;i++)
      {
    	  if(ch[i]=='.')
    	  {
    		  line++;
    	  }
      }
      System.out.println("No of Lines in the given string : "+line);
	}

}
