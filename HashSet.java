import java.util.*;


public class Main
{
	public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    
    set.add(1);
    set.add(2);
    System.out.println("The state of set having 100 is " +set.contains(100));
    System.out.println(set);
   
    // set.add(1); 
    // set.forEach(element -> System.out.print(element + " "));
    
    
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        
        System.out.println("Size of set is "+set.size());
	}
}
