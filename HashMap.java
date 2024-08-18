import java.util.*;

public class HashMap
{
	public static void main(String[] args) {
        // key, value
        HashMap <String, Integer> map = new HashMap<>();
        
        map.put("test",1);
        map.put("book",2);
        map.put("test",300);
        map.put("orange",400);
        System.out.println(map);
        
        if(map.containsKey("test"))
	    System.out.println("test is present");
	    
	    System.out.println(map.get("test")+" is present");
	    
	    Set<String> keys = map.keySet();
	    
	    for(String key : keys)
	    {
	        System.out.println(key + " " + map.get(key));
	       // System.out.print
	    }
	    
	    map.remove("orange");
	    
	    System.out.println("After removal");
	    for(String key : keys)
	    {
	        System.out.println(key + " " + map.get(key));
	       // System.out.print
	    }
	}   
}
