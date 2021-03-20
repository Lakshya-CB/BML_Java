package Lec_11;

public class Sorting_algos {
	public static void main(String[] args) {
		int[] Arr = { 3 ,4 ,2 ,1};
		ins_sort(Arr);
//		selec_sort(Arr);
//		bub_sort(Arr);
//		disp(Arr);
	}
	public static void ins_sort(int[] arr) {
		for(int size = 2;size<=arr.length;size++) {
			int val = arr[size-1];
			int end = size-2;
			while(end >=0 ) {
				if(arr[end]>val) {
					arr[end+1]=arr[end];
					end--;
				}
				else {
					break;
				}
			}
//			System.out.println("Val : " +val );
			disp(arr);
			arr[end+1]=val;
			System.out.println(end+1);
			disp(arr);
			System.out.println("-------------");
			break;
		}
	}

	public static void selec_sort(int[] arr) {
		for (int counter = 1; counter < arr.length-1; counter++) {
			int max_in = 0;
			for (int i = 1; i <= arr.length - counter; i++) {
				if (arr[i] > arr[max_in]) {
					max_in = i;
				}
			}
			System.out.println("arr search start : "+ 0 +"  Max : "  + arr[max_in] + "  arr search end  : " + (arr.length - counter-1));
			int temp = arr[arr.length - counter];
			arr[arr.length - counter] = arr[max_in];
			arr[max_in] = temp;
			disp(arr);
			System.out.println("--------------");
		}
	}

	public static void bub_sort(int[] arr) {
		for (int counter = 1; counter < arr.length; counter++) {
			for (int i = 0; i < arr.length - counter; i++) {
				if (arr[i] > arr[i + 1]) {
//					Swap
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			disp(arr);
			System.out.println("----------------");
		}
	}

	public static void disp(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
}
