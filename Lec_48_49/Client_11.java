package Lec_48_49;

public class Client_11 {
	public static void main(String[] args) {
//		Pair<Student, String> P1 = new Pair<>();
//		P1.data1 = new Student();
//		P1.data1.age = 99;
//		P1.data1.Name = "Good sir Oldy";
//		System.out.println(P1.data2);
//		P1.data1.Intro();
//		
//		Linked_List_Generic<Student> LL = new Linked_List_Generic<>();
//		LL.addLast(new Student("A1"));
//		LL.addLast(new Student("A2"));
//		LL.addLast(new Student("A3"));
//		LL.addLast(new Student("A4"));
//		LL.disp();
//		
		Student.Total_students();
		
		System.out.println(Student.Total_S);
		Student s1 = new Student("A1");
		System.out.println(Student.Total_S);
		Student s2 = new Student("A2");
		System.out.println(Student.Total_S);
		Student s3 = new Student("A3");
		
		System.out.println(Student.Total_S);
//		System.out.println(s2.Total_S);
//		System.out.println(s3.Total_S);
	}
}
