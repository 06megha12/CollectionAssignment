package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {

	static HashMap<String,Integer> map=new HashMap<String,Integer>(); 
	public static void main(String[] args) {
		         
	      map.put("Pune",12000000);    
	      map.put("Mumbai",2000000000);    
	      map.put("Indore",10000000);  
	      map.put("Nagpur",2100000); 
	      sortbykey();
	      
	      //map.entrySet().forEach(System.out::println);
	}
	 public static void sortbykey()
	    {
	        TreeMap<String, Integer> sorted = new TreeMap<>();
	 
	        sorted.putAll(map);
	 
	        for (Map.Entry<String, Integer> entry : sorted.entrySet())
	            System.out.println("Key = " + entry.getKey() +
	                         ", Value = " + entry.getValue());       
	    }
}
