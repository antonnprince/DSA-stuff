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
	    arraylist.add(5,500); //will cause arrayindexoutofbounds exception
	    
	    arraylist.set(1,69969);
	    System.out.println("0th element is  "+arraylist.get(0));
	    System.out.println("All elements are " +arraylist);
	    
	    arraylist.remove(arraylist.size()-1);
	    System.out.println("All elements are " +arraylist);
	    
	    Collections.sort(arraylist);
	    System.out.println("After sorting:  " +arraylist);
	    
	}
}
