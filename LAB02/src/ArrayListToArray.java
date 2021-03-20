import java.util.ArrayList;
/**
 * Name : Yalagooradappa Hebbal
 * Description :Java program to convert an ArrayList to an array
 * Date : 15/03/2021
 */
public class ArrayListToArray {

	public static void main(String[] args) {
	    ArrayList list=new ArrayList();
	    {
	    	list.add(1);
	    	list.add(2);
	    	list.add(3);
	    	list.add(4);
	    	list.add(5);
	    	list.add(6);
	    	list.add(7);
	    }
	    System.out.println("ArrayList :");
	    System.out.println(list);
	    Object[] obj = list.toArray(); 
	    System.out.println("Array :");
        for(Object ar:obj)
        {
        	System.out.print(ar+" ");
        }
	}

}
