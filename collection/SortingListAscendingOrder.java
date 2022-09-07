package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListAscendingOrder {

	public static void main(String[] args) {
		List < Integer > myList = new ArrayList < Integer > ();
	    myList.add(10);
	    myList.add(4);
	    myList.add(1);
	    myList.add(2);
	    myList.add(9);
	    myList.add(8);
	    myList.add(7);
	    myList.add(5);
	    Collections.sort(myList);
	   
	    for (Integer a: myList) {
	      System.out.print(" " + a);
	    }
	}

}
