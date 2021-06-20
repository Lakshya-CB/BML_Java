package lec_36;

public class Student {
	String name = "Slim Shady";
	int age = 35;

	public Student() {
		this.name = "Read Slim Shady";
		this.age =40;
	}
	public Student(int aa, String bb) {
		this.name = bb;
		this.age =aa;
	}

	public void Introduce_urself() {
		System.out.println("My name is " + name + " with age " + age);
	}

	public void Say_Hi(String name) {
		System.out.println("Hello bro " + this.name + " im " + name);
	}

	public void party(Student s) {
		System.out.println("Hello bro " + s.name + " im " + this.name + " lets hhave a party! ");
	}
}
