package com.AccessModifiers;

import java.util.HashMap;
import java.util.Map;

public class ArrayandSum {

	static int k = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4, 5, 6 , 7, 8};
		int sum = 0;
//		for (int i : arr) {
//			sum = sum + i;
//		}

		int[] arr2 = checkarrsum(arr, 9);
		
		for(int p=0 ; p < arr2.length; p=p+2)
			System.out.println(arr2[p] + " and " + arr2[p+1] + " are Pairs" );
		
//		Map m = checkarrsum(arr, 7);
//		System.out.println(m.keySet());
	}

	public static int[] checkarrsum(int[] arr, int sum) {
		
		int[] m1 = arr;
		int[] m2 = new int[10];
		
		System.out.println(m2.length);
		//Map<int, int> map = new HashMap<>();
		int total = 0;
		for(int i=0 ; i < arr.length ; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i] + arr[j] == sum) {
					System.out.println("BOTH ARE EQUAL for " + arr[i] +"  and "+arr[j]);
					m2[k] = arr[i];
					m2[k+1] = arr[j];
					k = k+2;
					
					
					//System.out.println(m2[k]);
//					System.out.println(m2[k+1]);
//					Map<Integer, Integer> map = new HashMap();
//					map.put(arr[i], (arr[j]));
//					System.out.println(map.keySet());
					
								
				}
			}
			
		}
		
	return m2;
	}
}	
