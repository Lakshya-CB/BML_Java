package lec_36;

public class Client_Classroom {
	public static void main(String[] args) {

		Student s1 = new Student();
		Student s01 = new Student(20, "Me");
		s01.Introduce_urself();
		// to print or to get data members Age and Name
		System.out.println(s1.age + " : " + s1.name);

		// change the data members of your object

		s1.age = 20;
		s1.name = "Oh Boy";
		System.out.println(s1.age + " : " + s1.name);
		// playing with address
		Student s2 = s1; // s1 = 2k, s2 = 2k
		System.out.println(s2.age + " : " + s2.name);

		s2.age = 99;
		System.out.println(s1.age + " : " + s1.name);

		// create more oobjects of classes
		s2 = new Student();
		s2.name = "s2";
		s2.age = 2;
		Student s3 = new Student();
		s3.name = "s3";
		s3.age = 3;

		Test1(s2, s3);
//		Test2(s2, s3);

		System.out.println(s2.age + " : " + s2.name);
		System.out.println(s3.age + " : " + s3.name);

		Test2(s2, s3);

		System.out.println(s2.age + " : " + s2.name);
		System.out.println(s3.age + " : " + s3.name);

		System.out.println("----------------");
		String myName = "Slim Shady";
		int myAge = 35;
		Test3(s2, s2.name, s2.age, myName, myAge);

//		System.out.println(s2.age + " : " + s2.name);
		s2.Introduce_urself();
		s3.Introduce_urself();

		s2.Say_Hi("cehcekcekcekcekcekcekc");

		s2.party(s3);
		System.out.println("----------------");
		
	}

	public static void Test1(Student a, Student b) {
		Student temp = a;
		a = b;
		b = a;
	}

	public static void Test2(Student a, Student b) {
		a = new Student();
		String temp_s = a.name;
		a.name = b.name;
		b.name = temp_s;

		int temp_a = a.age;
		a.age = b.age;
		b.age = temp_a;

	}

	public static void Test3(Student a, String name, int age, String myName, int myAge) {
		a.name = "aa";
		a.age = 1;

		name = "aa2";
		age = 2;

		myName = "aa3";
		myAge = 3;
	}
}
