import java.util.HashSet;

public class Main
{
	public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        
         if(!set.contains(6))
         System.out.println("6 doesn't exist");
        
        set.remove(1);
        if(!set.contains(1))
        System.out.println("Element doesn't exist");
        
        
        System.out.println("Size of set is "+set.size());
	}
}
