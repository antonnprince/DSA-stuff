import java.util.*;


public class Main
{
	public static void main(String[] args) {
    
    Map<Integer, String> map = new HashMap<>();
		
    map.put(1,"Bus");
    map.put(2, "Car");
    map.put(3, "Bike");
    
    System.out.println("The 2nd value is "+map.get(2));
    System.out.println(map.containsKey(1));
    System.out.println(map.containsValue("skibidi"));
        
        for(Map.Entry entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }

	/*
	 	1 : Bus
		2 : Car
		3 : Bike
 	*/
        
        Set<Integer> keys = map.keySet();
        for(Integer key : keys)
        {
            System.out.println("Key: "+key+" Value: "+map.get(key));
        }

	/* 
		Key: 1 Value: Bus
		Key: 2 Value: Car
		Key: 3 Value: Bike
	*/
	
	}
}
