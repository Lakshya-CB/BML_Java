package Lec_48_49;

public class Student {
	int age;
	String Name;
	static int Total_S = 0;

	public Student() {
		Total_S++;
		// TODO Auto-generated constructor stub
	}
//	WRT static functions
	
// Can you use a non static variable inside a static fn?  
// No, there is NO!!! "this"/ reference or instance, therefore no memory allocated to the datamembers

// Can you use a non static fn inside a static fn?   
// No, there is NO!!! "this"/ reference or instance, therefore no memory allocated to the datamembers

// Can you use a static variable inside a static fn ?   Yes!! no need for instance
	

// Can you use a static variable fn in a static fn ?   Yes!! no need for instance

//-----------------------------------------------------------------	
//	WRT non static functions

// Can you use a non static variable inside a non static fn?   Yes, you have "this" 
	
// Can you use a non static fn inside a non static fn?   Yes, you have "this" 
	
// Can you use static variable inside a non static fn?   Yes, you have "this" 

// Can you use static fn inside a non static fn?   Yes, no need for this

	public static void Total_students() {
		System.out.println(Total_S);
//		Intro(); No icoorect!!
		Total_students11();
		
	}

	public static void Total_students11() {
		System.out.println(Total_S);
//		Intro(); No icoorect!!
		
	}

	public Student(String str) {
		Total_S++;
		// TODO Auto-generated constructor stub
		Name = str;
	}

	public String toString() {

		return "Name is " + Name + " , Age is " + age;
	}

	public void Intro() {
		
		System.out.println("Name is " + Name + " , Age is " + age);
	}
}
