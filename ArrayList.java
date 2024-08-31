import java.util.*;


public class Main
{
	public static void main(String[] args) {
		List<Integer> arraylist = new ArrayList<>();
		
		arraylist.add(110);
		arraylist.add(1);
		arraylist.add(2);
	
	   // for(Integer element: arraylist)
	   // {
	   //     System.out.println(element);
	   // }
	    
	    System.out.println(arraylist.get(0));
	    
	    arraylist.add(2, 400);
	    arraylist.add(3,6969);
	    
	    System.out.println(arraylist);
	    
	}
}
