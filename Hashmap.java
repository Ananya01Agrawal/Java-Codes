import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
	    hash_map.put(1,"Red");
	    hash_map.put(2,"Green");
	    hash_map.put(3,"Black");
	    hash_map.put(4,"White");
	    hash_map.put(5,"Blue");
	    for(Map.Entry x:hash_map.entrySet()){
	        System.out.println(x.getKey()+" "+x.getValue());
	    }
	}
}


//if we want to update the value
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
	    hash_map.put(1,"Red");
	    hash_map.put(2,"Green");
	    hash_map.put(3,"Black");
	    hash_map.put(4,"White");
	    hash_map.put(1,"Blue");
	    for(Map.Entry x:hash_map.entrySet()){
	        System.out.println(x.getKey()+" "+x.getValue());
	    }
	}
}


//copy all the mappings from the specified mao to another map

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
	    //HashMap<Integer,String> hash_map2=new HashMap<Integer,String>();
	    //populating the hashmap , putting the values
	    hash_map.put(1,"Red");
	    hash_map.put(2,"Green");
	    hash_map.put(3,"Black");
	    
	    boolean result=hash_map.isEmpty();
	    System.out.println("Is hashmap emypty:"+ result);
	    
	    hash_map.clear();
	    result=hash_map.isEmpty();
	    
	    System.out.println("Is hashmap empty:" + result);
	}
}
	
	    
	    
//program to remove all the mappings dform the map

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
	    //HashMap<Integer,String> hash_map2=new HashMap<Integer,String>();
	    //populating the hashmap , putting the values
	    hash_map.put(1,"Red");
	    hash_map.put(2,"Green");
	    hash_map.put(3,"Black");
	    
	    
	    System.out.println("the original linked map: " + hash_map);
	    hash_map.clear();
	    System.out.println("The New map:"+hash_map);
	}
}
	    
// to check whether whether map contains mappings or not or it is empty

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
	    //HashMap<Integer,String> hash_map2=new HashMap<Integer,String>();
	    //populating the hashmap , putting the values
	    hash_map.put(1,"Red");
	    hash_map.put(2,"Green");
	    hash_map.put(3,"Black");
	    
	    boolean result=hash_map.isEmpty();
	    System.out.println("Is hashmap emypty:"+ result);
	    
	    hash_map.clear();
	    result=hash_map.isEmpty();
	    
	    System.out.println("Is hashmap empty:" + result);
	}
}
	
	    
	    
