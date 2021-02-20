package Lec_7;

public class F_C {
	public static void main(String[] args) {
		int minF = 0;
		int maxF = 100;
		int Step = 20;
		
		for(int F = minF; F<=maxF;F=F+Step) {
//			C = (5/9)*(F-32)
			int C = (int)((5.0/9)*(F-32));
			System.out.println(F+ "\t"+C);
		}
	}
}
