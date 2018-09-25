package testpro;

import java.util.*;

class Car {
	int line = 10;
	private String chessino[] = new String[line];
	private String[] tyre = new String[line];
	private String seat[] = new String[line];
	private String engine[] = new String[line];
	private String stering[] = new String[line];
	private String paint[] = new String[line];

	// Taking input from car Manufacturer
	public void insert(int carcount) {
		Scanner sc = new Scanner(System.in);
		if (carcount < line) {
			for (int i = 0; i < carcount; i++) {
				System.out.println("Enter The " + i + " Car Deatail:");
				System.out.println("Enter Chessi No:");
				chessino[i] = sc.next();

				System.out.println("Engine: ");
				engine[i] = sc.next();

				System.out.println("Tyre: ");
				tyre[i] = sc.next();

				System.out.println("Stering: ");
				stering[i] = sc.next();

				System.out.println("Seat: ");
				seat[i] = sc.next();

				System.out.println("Paint: ");
				paint[i] = sc.next();

			}
		}
	}

	// Current Status of car by using chessiNo
	public void status(String sr) {
		int idx = 0;
		for (int j = 0; j < 10; j++) {
			if (sr.equals(chessino[j])) {
				idx = j;
			}
		}
		System.out.println("Car Details:");
		System.out.println("Chessi Number: " + chessino[idx]);
		System.out.println("Engine: " + engine[idx]);
		System.out.println("Tyre: " + tyre[idx]);
		System.out.println("Stering: " + stering[idx]);
		System.out.println("Seat: " + seat[idx]);
		System.out.println("Paint: " + paint[idx]);
	}

	// Validation for Next Consignment
	public void eligible(int carcount) {
		String str = "n";
		int flag = 0;
		for (int i = 0; i < carcount; i++) {
			for (int j = 0; j < chessino.length; j++) {
				if (str.equals(engine[j]) || str.equals(tyre[j]) || str.equals(stering[j]) || str.equals(seat[j])
						|| str.equals(paint[j])) {
					flag = 1;
				}
			}

		}
		if (flag == 0) {
			System.out.println("Eligible for taking Next Order");
		} else {
			System.out.println("Not Elgible for taking Next Order");
		}
	}

}

public class CarManufacturing {
	public static void main(String x[]) {
		Car ob = new Car();
		Scanner sc = new Scanner(System.in);
		// Getting user input for No Of car count to manufacture on line
		System.out.println("Enter the No Car To Manufacture:");
		int no = sc.nextInt();
		ob.insert(no);

		System.out.println("Enter the Chessi No to Check Status:");
		String srchessi = sc.next();
		ob.status(srchessi);

		System.out.println("Next Order: ");
		ob.eligible(no);

	}
}
