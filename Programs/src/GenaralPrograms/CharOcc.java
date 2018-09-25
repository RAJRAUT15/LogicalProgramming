package GenaralPrograms;

import java.util.*;

public class CharOcc {
	static void occur(String str) {
		int count[] = new int[256];
		int len = str.length();
		for (int i = 0; i < len; i++) {
			count[str.charAt(i)]++;
		}
		char ch[] = new char[str.length()];
		for (int j = 0; j < len; j++) {
			ch[j] = str.charAt(j);
			int find = 0;
			for (int k = 0; k <= j; k++) {
				if (str.charAt(j) == ch[k]) {
					find++;
				}
				if (find == 1) {
					System.out.println(str.charAt(j) + "=" + count[str.charAt(j)]);
				}
			}
		}
	}

	public static void main(String x[]) {
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.replace(" ", "");
		occur(str);
	}

}
