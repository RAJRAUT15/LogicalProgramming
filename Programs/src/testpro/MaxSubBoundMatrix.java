package testpro;

import java.util.*;

public class MaxSubBoundMatrix {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Rows in Matrix:");
		int row = sc.nextInt();
		System.out.println("Enter the size of column in Matrix:");
		int col = sc.nextInt();
		int mat[][] = new int[row][col];
		System.out.println("Enter the Elements In Matrix:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		int trw = 0, tcl = 0;
		int max = 0;
		for (int k = 0; k < row; k++) {
			for (int l = 0; l < col; l++) {
				System.out.print(mat[k][l] + " ");
			}
			System.out.println();
		}
		System.out.println("Enter the Width Of SubMatrix To Search:");
		int width = sc.nextInt();
		int lwidth = width - 1;
		for (int i = 0; i < row - lwidth; i++) {
			for (int j = 0; j < col - lwidth; j++) {
				sum = 0;
				for (int rw = 0; rw < width; rw++) {
					for (int cl = 0; cl < width; cl++) {
						if (((rw == 0) || (cl == lwidth)) || (rw == lwidth || cl == 0)) {
							sum = sum + mat[rw + i][cl + j];
						}
					}
				}

				if (sum > max) {
					max = sum;
					trw = i;
					tcl = j;
				}

			}
		}
		System.out.println("Largest Matrix:");
		for (int i = trw; i < trw + width; i++) {
			for (int j = tcl; j < tcl + width; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sum of Boundary Element of Large Matrix: " + max);
	}

}
