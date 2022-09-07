package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 4, 1, 3,2,2));
	    System.out.println("ArrayList with duplicate elements: " + numbers);

	    // convert the arraylist into a set
	    Set<Integer> set = new LinkedHashSet<>();
	    set.addAll(numbers);

	    // delete al elements of arraylist
	    numbers.clear();

	    numbers.addAll(set);
	    System.out.println("ArrayList without duplicate elements: " + numbers);
	    Collections.sort(numbers);
	    System.out.println("ArrayList Ascending Order: " + numbers);
	}

}
