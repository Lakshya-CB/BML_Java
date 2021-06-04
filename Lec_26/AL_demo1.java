package Lec_26;

import java.util.ArrayList;

public class AL_demo1 {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> Big = new ArrayList<ArrayList<Integer>>();

//		Big.add(0,80); Wont work
//		ArrayList<Integer> list1= new ArrayList<>();
//		
//		list1.add(10);
//		list1.add(20);
//
////		System.out.println(list1);
//		Big.add(list1);
//		list1= new ArrayList<>();
//		list1.add(30);
//		list1.add(40);
//
//		Big.add(list1);
////		System.out.println(list1);
//
//		list1= new ArrayList<>();
//		list1.add(50);
//		list1.add(60);
//
////		System.out.println(list1);
//		Big.add(list1);
//		
//		System.out.println(Big);
//		
		
		/////////////////////////////////////////////////////
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(10);
		list1.add(20);
		
		Big.add(new ArrayList<>(list1));
	
		list1.add(30);
		list1.add(40);

		Big.add(new ArrayList<>(list1));

		list1.add(50);
		list1.add(60);

		Big.add(new ArrayList<>(list1));
		
		System.out.println(Big);
		
		
		/////////////////////////////////////////////////////


	}
}
