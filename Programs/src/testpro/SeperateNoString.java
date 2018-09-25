package testpro;

import java.util.*;

public class SeperateNoString {
	public static void main(String x[]) {
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int sum = 0;
		StringBuffer chara = new StringBuffer();
		StringBuffer no = new StringBuffer();
		StringBuffer special = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {

				no.append(str.charAt(i));
				sum=sum+Integer.parseInt(String.valueOf(str.charAt(i)));

			} else if (Character.isAlphabetic(str.charAt(i))) {
				chara.append(str.charAt(i));

			} else {
				special.append(str.charAt(i));
			}
		}
		System.out.println(chara);
		System.out.println(special);
		System.out.println(no);
		System.out.println("Sum:" + sum);

	}

	private static int getNumericValue(char charAt) {
		// TODO Auto-generated method stub
		return 0;
	}

}
