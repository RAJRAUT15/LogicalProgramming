package testpro;

import java.util.*;

public class Sepratematrix {
	public static void main(String x[]) {
		System.out.println("Enter the No In Matrix;");
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[8][6];
		int ar1[][] = new int[3][3];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int z = 0;
		int frow = 0;
		int fcol = 0;
		int lrow = frow + 2;
		int lcol = frow + 2;
		while (z < 6) {
			int p = 0;
		
			while (p < 4) {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						ar1[i][j] = arr[frow][fcol];
						fcol++;
					}
					fcol = p;
					frow++;
				}
				fcol = p;
				fcol++;
				frow = z;
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						System.out.print(ar1[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println();
				p++;
			}
			fcol=0;
			z++;
			frow =z ;
		}
	}

}
