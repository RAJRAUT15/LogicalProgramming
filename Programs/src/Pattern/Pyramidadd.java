package Pattern;

import java.util.Scanner;

public class Pyramidadd {
	public static void main(String x[]) {
		int no = 1;
		System.out.println("Enter the row size:");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = row; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				if (i == 0 || k == 0) {
					no = 1;
				} else {
					no = no * (i - k + 1) / k;
				}
				System.out.print(" " + no);
			}
			System.out.println();
		}
	}

}