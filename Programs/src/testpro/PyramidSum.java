package testpro;

import java.util.*;

public class PyramidSum {
	public static void main(String x[]) {
		int no = 1;

		System.out.println("Enter the size:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			for (int j = size; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				if (k == 0) {
					no = 1;
				} else {
					no = no * (i - k + 1)/k;
				}
				System.out.print(" " + no);
			}
			System.out.println();
		}
	}

}
