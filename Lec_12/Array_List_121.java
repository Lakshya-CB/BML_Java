package Lec_12;

import java.util.ArrayList;

public class Array_List_121 {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<>();
//		System.out.println(AL.size());
		System.out.println(AL);
		AL.add(10);
		AL.add(20);
		AL.add(30);
		AL.add(40);
		AL.add(50);
		AL.add(60);

//		Get and Set function ranges from 0 to arr.length-1
//		System.out.println(AL.size());
//		System.out.println(AL);
////		System.out.println(AL.get(0));
////		System.out.println(AL.get(1));
////		System.out.println(AL.get(2));
////		System.out.println(AL.get(3));
////		System.out.println(AL.get(4));
////		System.out.println(AL.get(5));
////		
////		
		
//		AL.set(AL.size(),100 );
		
		
//		Add at index ranges from 0 to AL.size()
		System.out.println(AL);
		AL.add(1,999);
		System.out.println(AL);
		AL.add(AL.size(),9999);
//		AL.add(9999);
		System.out.println(AL);
		
//		Function remove 
		AL.remove(AL.size()-1);
		System.out.println(AL);
		
		
		
		for(int i=0;i<AL.size();i++) {
			System.out.print(AL.get(i)+ " ");
		}
		System.out.println();
		
		for(int val : AL) {
			System.out.print(val+ " ");
		}
		System.out.println();
				
		
	}

}
