package testpro;

import java.util.*;

public class MaxSubmatrix {
	public static void main(String x[]) {
		System.out.println("Enter the Elements of Matrix:");
		Scanner sc = new Scanner(System.in);
		// int matrix[][]=new int[8][6];
		int matrix[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 0, 1, 2 }, { 3, 4, 5, 6, 7, 8 }, { 9, 0, 1, 2, 3, 4 },
				{ 5, 6, 7, 8, 9, 0 }, { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 0, 1, 2 }, { 3, 4, 5, 6, 7, 8 } };

		// User Input
//		 for(int i=0;i<8;i++)
//		 {
//		 for(int j=0;j<6;j++)
//		 {
//		 matrix[i][j]=sc.nextInt();
//		 }
//		 }	
		// print matrix
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		// Calculation
		int max[][] = new int[3][3];
		// first max matrix

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				max[i][j] = matrix[i][j];
			}

		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(max[i][j] + " ");
			}
			System.out.println();
		}

		//
		int summax = 0;
		int frow = 0;
		int fcol = 0;
		int lrow = frow + 2;
		int lcol = fcol + 2;
		for (int i = fcol; i <= lcol; i++) {
			summax += max[frow][i];
		}
		for (int j = frow + 1; j <= lrow; j++) {
			summax += max[j][lcol];
		}
		for (int k = lcol - 1; k >= fcol; k--) {
			summax += max[lrow][k];
		}
		for (int l = lrow - 1; l >= frow + 1; l--) {
			summax += max[l][fcol];
		}
		System.out.println("Sum:" + summax);

		// compare matrix
		int tempmat[][] = new int[3][3];
		for (int line = 0; line < 6; line++) {
			
			for (int bm = 0; bm < 4; bm++) {
				// matrix selection
				frow=line;
				fcol = bm;
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						tempmat[i][j] = matrix[frow][fcol];
						fcol++;
					}
					frow++;
				}
				
				System.out.println("Matrix:");
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(tempmat[i][j]+" ");
					}
					System.out.println();
				}
			
//				// boundary element
//				int summax2 = 0;
//				for (int i = fcol; i <= lcol; i++) {
//					summax2 += tempmat[frow][i];
//				}
//				for (int j = frow + 1; j <= lrow; j++) {
//					summax2 += tempmat[j][lcol];
//				}
//				for (int k = lcol - 1; k >= fcol; k--) {
//					summax2 += tempmat[lrow][k];
//				}
//				for (int l = lrow - 1; l >= frow + 1; l--) {
//					summax2 += tempmat[l][fcol];
//				}
//				System.out.println("Sum:" + summax2);
//
//				// replace
//				if (summax2 > summax) {
//					for (int fc = 0; fc < 3; fc++) {
//						for (int fsc = 0; fsc < 3; fsc++) {
//							max[fc][fsc] = tempmat[fc][fsc];
//						}
//					}
//				}
//				summax2 = 0;

			}

		}
//		System.out.println("Maximum Matrix:");
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(max[i][j] + " ");
//			}
//			System.out.println();
//		}

	}
}
