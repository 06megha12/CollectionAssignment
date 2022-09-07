package com.collection;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		  
        v1.add("a");
        v1.add("d");
        v1.add("e");
        v1.add("b");
        v1.add("c");
        
        Collections.sort(v1);
        
        System.out.println("sorted vector : " + v1);
	}

}
