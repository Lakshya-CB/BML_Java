package pack1;

public class if_else2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int milk = 1;
		int water = 1;
		
		if(milk==1 && water==1) {
			System.out.println("Both are present");
			
		}
		
		if(milk==1 || water==1) {
			System.out.println("Atleast one is present");
		}
		
		if(milk!=0) {
			System.out.println("Milk is present");
		}

	}

}
