package assign;

import java.util.*;

class CarMan {
	int chessino;
	String engine;
	String tyre;
	String seat;
	String stering;
	String paint;

	public void setChessino(int chessino) {
		this.chessino = chessino;
	}

	public void addEngine() {
		engine = "Added";
	}

	public void addTyre() {
		seat = "Added";
	}

	public void addStering() {
		stering = "Added";
	}

	public void addSeat() {
		engine = "Added";
	}

	public void setPaint() {
		paint = "Painted";
	}

}

public class CarManObj {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);

		// Accepting User Input to Count Of Car to Produce

		System.out.println("Enter the No of Car to Manufacture:");
		int no = sc.nextInt();
		int line = 10;
		int rem = no - line;
		CarMan os[] = new CarMan[line];
		int count = 0;

		// Setting values for objects

		for (int i = 0; i < os.length; i++) {
			os[i].setChessino(i);
			os[i].addEngine();
			os[i].addTyre();
			os[i].addStering();
			os[i].addSeat();
			os[i].setPaint();

			count++;
		}

		// Prints the Status of Given Car

		System.out.println("Enter the Chessi no to Check Status:");
		int src = sc.nextInt();
		if (src < 10) {
			System.out.println("Chessi No: " + os[src].chessino);
			System.out.println("Engine: " + os[src].engine);
			System.out.println("Tyre: " + os[src].tyre);
			System.out.println("Stering: " + os[src].stering);
			System.out.println("Seat: " + os[src].seat);
			System.out.println("Paint: " + os[src].paint);
		} else {
			System.out.println("Wrong Input:");
		}

		// Validation For Next order
		if (count == 10) {
			System.out.println("Eligible for Next Production:");

		}

	}

}
