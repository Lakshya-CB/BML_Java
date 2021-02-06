package pack1;

public class Code_1 {
	public static void main(String[] args) {
		int number = 5;
		int space = 4;
		int star = 1;
		int row=1;
		while(row<=number)
		{
		    int currspace = 1;
		    while(currspace<=space)
		    {
		        System.out.print(" ");
		        currspace--;
		    }
		    int currstar = 1;
		    while(currstar<=star)
		    {
		        System.out.print("* ");
		        System.out.print(" ");
		    }
		    System.out.println();
		    row++;
		    space--;
		    star++;
		}
	}

}
