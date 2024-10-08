import java.util.LinkedList;

public class Main{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        // LinkedList<Integer> newList = new LinkedList<>();
        
        list.add(1);
        list.add(2);
        list.addFirst(0);
        list.addFirst(-1);
        list.addLast(100);
        
        System.out.println("0th element is "+list.get(0));
        
        for(Integer element: list )
        {
            System.out.println(element);
        }
        
        list.remove(1);
        list.removeLast();
        list.removeFirst();
          list.add(2,1000000);
	    
	    for(Integer item : list)
	    {
	        System.out.println(item);
	    }
        System.out.println("After removal");
        for(Integer item:list)
        {
            System.out.println(item);
        }

	    System.out.println(list) //prints items in list as array
		    
    }
}
