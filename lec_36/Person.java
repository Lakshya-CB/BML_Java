package lec_36;

public class Person {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age < 0) {
//			System.out.println("Dont do this bro!");
			throw new Exception("Dont do this , age is -ve");
		}
		System.out.println("zxcvzxcvzv");
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		// TODO Auto-generated constructor stub

	}

	public Person(int age, String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}

	public void disp() {
		System.out.println(this.age + "," + this.name);
	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public void setName(String age) {
//		this.name = age;
//	}
}
