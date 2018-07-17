package GenaralPrograms;

import java.util.*;

public class perfectseq {
	public static void main(String x[]) {
		int no = 1, lm;
		int j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit:");
		lm = sc.nextInt();
		System.out.println("Perfect Numbers Between 0 To "+lm);
		for (j=0; j < lm; j++) {
			int temp = no;
			int i=1;
			int sum=0;
			while (i < no) {

				if (no % i == 0) {
					sum = sum + i;
				}
				i++;
			}
			if (sum == temp) {
				
				System.out.print(no + " ");
			}
			no++;
		}
	}
}
