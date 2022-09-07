package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateName {

	public static void main(String[] args) {
		 List < String > myList = new ArrayList < String > ();
		    myList.add("megha");
		    myList.add("veda");
		    myList.add("shital");
		    myList.add("reshma");
		    myList.add("pallu");
		    myList.add("megha");
		    myList.add("neha");
		    myList.add("kajal");
		   
		    Set<String> set = new LinkedHashSet<>();
		    set.addAll(myList);
		    myList.clear();
		    
		    myList.addAll(set);
		    System.out.println("ArrayList without duplicate elements: " + myList);
		    Collections.sort(myList);
		    Collections.reverse(myList);
		    
	        // Print the sorted ArrayList
	        System.out.println("Sorted ArrayList "+ "in Descending order : "+ myList);
		   
	}

}
