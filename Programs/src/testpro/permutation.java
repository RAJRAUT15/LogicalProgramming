package testpro;

import java.util.*;

public class permutation {
	public static void main(String x[]) {
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length() - 1;
		int init = 0;
		System.out.println("Permutation:");
		combination(str, init, len);
	}

	static void combination(String str, int init, int len) {
		if (init == len) {
			System.out.println(str);
		}  
			for (int i = init; i <= len; i++) {
				str = sp(str, init, i);
				combination(str, init + 1, len);

			
		}
	}

	public static String sp(String str, int init, int len) {
		char tmp;
		char arr[] = str.toCharArray();
		tmp = arr[init];
		arr[init] = arr[len];
		arr[len] = tmp;

		return String.valueOf(arr);

	}

}
