package Pattern;

public class pat3 {
	public static void main(String x[]) {
		int n = 5,a=n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i==j ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		int tm=n;
		for (int i = 1; i <= n; i++) {
			for (int j = tm; j >=1; j--) {
				System.out.print(" ");

			}
			tm--;
			for (int k = 0; k <=a; k++) {
				if (k==1||k==a-1||(i==3&&k==2)||i==3&&k==3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

}
