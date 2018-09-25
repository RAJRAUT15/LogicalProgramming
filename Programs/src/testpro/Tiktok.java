package testpro;

import java.util.*;

public class Tiktok {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		String arr[][] = new String[3][3];
		System.out.println("Enter the Elements Of Matrix:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextLine();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int flag = 0;
		int flag1 = 0;

		if ((arr[0][0].equals("x")) && (arr[0][1].equals("x")) && (arr[0][2].equals("x"))) {
			flag++;
		} else if ((arr[1][0].equals("x")) && (arr[1][1].equals("x")) && (arr[1][2] == "x")) {
			flag++;
		} else if ((arr[2][0].equals("x")) && (arr[2][1].equals("x")) && (arr[2][2] == "x")) {
			flag++;
		} else if ((arr[0][0].equals("x")) && (arr[1][1].equals("x")) && (arr[2][2] == "x")) {
			flag++;
		}

		//
		else if ((arr[0][0].equals("x")) && (arr[1][0].equals("x")) && (arr[2][0].equals("x"))) {
			flag++;
		} else if ((arr[0][1].equals("x")) && (arr[1][1].equals("x")) && (arr[2][1].equals("x"))) {
			flag++;
		} else if ((arr[0][2].equals("x")) && (arr[1][2].equals("x")) && (arr[2][2].equals("x"))) {
			flag++;
		} else if ((arr[0][2].equals("x")) && (arr[1][1].equals("x")) && (arr[2][0].equals("x"))) {
			flag++;
		}

		else if ((arr[0][0]=='o') && (arr[0][1]=='o') && (arr[0][2]=='o')) {
			flag1++;
		} else if ((arr[1][0].equals("o")) && (arr[1][1].equals("o")) && (arr[1][2].equals("o"))) {
			flag1++;
		} else if ((arr[2][0].equals("o")) && (arr[2][1].equals("o")) && (arr[2][2].equals("o"))) {
			flag1++;
		} else if ((arr[0][0].equals("o")) && (arr[1][1].equals("o")) && (arr[2][2].equals("o"))) {
			flag1++;
		}
		//
		else if ((arr[0][0].equals("o")) && (arr[1][0].equals("o")) && (arr[2][0].equals("o"))) {
			flag1++;
		} else if ((arr[0][1].equals("o")) && (arr[1][1].equals("o")) && (arr[2][1].equals("o"))) {
			flag1++;
		} else if ((arr[0][2].equals("o")) && (arr[1][2].equals("o")) && (arr[2][2].equals("o"))) {
			flag1++;
		} else if ((arr[0][2].equals("o")) && (arr[1][1].equals("o")) && (arr[2][0].equals("o"))) {
			flag1++;
		}
		else
		{
			System.out.println("No One Win:");
		}

		if (flag >= 1) {
			System.out.println("X is Winner:");
		} else if (flag1 >= 3) {
			System.out.println("O is Winner:");
		}

	}

}
