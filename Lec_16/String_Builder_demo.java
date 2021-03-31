package Lec_16;

public class String_Builder_demo {
	public static void main(String[] args) {
//		Create
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		
//		Range of index ? 0 to sb.length()-1;
		System.out.println(sb.charAt(0));
		System.out.println(sb.length());
		System.out.println(sb.charAt(sb.length()-1));
		System.out.println("-----------");
		sb.append("-No");
		System.out.println(sb);
		sb.insert(0, "nothing-");
		System.out.println(sb);
		
//		Insert function ranges from 0 to sb.length()  
		System.out.println("-----------");
		sb.insert(sb.length(), "-trying-");
		System.out.println(sb);

//		Range setChatAt 0 to  sb.length() -1
		System.out.println("-----------");
		sb.setCharAt(0, 'L');
		System.out.println(sb);
		sb.setCharAt(sb.length()-1, 'O');
		System.out.println(sb);

//		Delete Starting index including , ending index excluding 0 to sb.length() 
		System.out.println("-----------");
		sb.delete(2, sb.length());
		sb.append('l');
		System.out.println(sb);
		
//		DeleteCharAt ranges from 0 to size-1
		System.out.println("-----------");
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		
		String str = "No more bhaiya!";
		StringBuilder sb2 = new StringBuilder(str);
		String ss = sb2.toString();

	}
}
