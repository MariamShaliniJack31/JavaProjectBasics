package com.java.basics;

import java.util.*;

public class C2ArrayList {

	public static void main(String[] args) {

		////ArrayList
		List<Integer> al = new ArrayList<Integer>();

		for(int i = 0; i <= 10; i++)
			al.add(i);
		System.out.println("ArrayList : " +al);
		System.out.println("ArrayList Size is : " +al.size());
		al.remove(2);
		System.out.println(al.get(2));
		
		System.out.println("The elements in ArrayList are : ");
		for (int z : al)
			System.out.println(z);

		////// 	Traversing list through Iterator  		
		System.out.println("Using Iterator ... The elements in ArrayList are : ");
		Iterator<Integer> itr = al.iterator();  
		while ( itr.hasNext() ) {  
			System.out.println( itr.next() );  
		}  	
		
		//add, remove, clear, removeAll, get, iterator, size



		/////////HashSet
		Set<Integer> s = new HashSet<>();
		for( int i = 0; i <= 10; i++)
			s.add(i);
		System.out.println("\nHashSet : " + s);

		/////////////////////////TreeSet = gives result in alphabetical order
		Set<String> treeset = new TreeSet();
		treeset.add("Zebra");
		treeset.add("Yak");
		treeset.add("Xerox");
		treeset.add("Wolf");
		treeset.add("Viper");
		treeset.add("Yak");

		System.out.println();
		System.out.println(treeset);
		System.out.println(treeset.size());
		
		SortedSet<String> sortedset = new TreeSet<>();
		sortedset.add("Zebra");
		sortedset.add("Yak");
		sortedset.add("Xerox");
		sortedset.add("Wolf");
		sortedset.add("Viper");
		sortedset.add("Yak");

		System.out.println("Sorted Set : \n"+sortedset);

		///////HashMap
		Map<String,String> map = new HashMap<>();

		map.put("a", "Apple");
		map.put("b", "Bird");
		map.put("c", "Chicago");
		map.put("d", "Dusty");

		System.out.println("HashMap : "+map);
		System.out.println( map.keySet());
		System.out.println( map.values());
		
		for(Map.Entry m : map.entrySet())  
			System.out.println(m.getKey()+"\t"+m.getValue());  
	}
}
