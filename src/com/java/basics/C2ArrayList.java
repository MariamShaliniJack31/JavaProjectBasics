package com.java.basics;

import java.util.*;

public class C2ArrayList {
	
	public static void main(String[] args) {
		
		////ArrayList
		List<Integer> al = new ArrayList<Integer>();
	
		for(int i = 0; i <= 10; i++)
			al.add(i);
			System.out.println("ArrayList : " +al);
			al.remove(2);
			System.out.println(al.get(2));
		
		System.out.println("The elements in ArrayList are : ");
		for (int z : al)
			System.out.println(z);
		
		/////////HashSet
		Set<Integer> s = new HashSet<>();
		for( int i = 0; i <= 10; i++)
			s.add(i);
		System.out.println("HashSet : " + s);
		
		///////HashMap
		Map<String,String> map = new HashMap<>();
		
		map.put("a", "Apple");
		map.put("b", "Bird");
		map.put("c", "Chicago");
		map.put("d", "Dusty");
				
		System.out.println("HashMap : "+map);
		System.out.println( map.values());
		System.out.println( map.keySet());

		for(Map.Entry m : map.entrySet())  
			System.out.println(m.getKey()+"\t"+m.getValue());  
	}
}
