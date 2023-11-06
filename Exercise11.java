import java.util.Scanner;

public class Exercise11 {

	public Exercise11() {
		// TODO Auto-generated constructor stub
	}

	// Input n:
	public static int enterN(Scanner scan) {
		int n;
		do {
			System.out.println("Enter a value >1 ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	// Input a 2D array:
	public static int[][] createArray(int numberOfRows, int numberOfColumns, Scanner scan) {
		int[][] a = new int[numberOfRows][numberOfColumns];
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfColumns; j++) {
				System.out.println("a[" + i + "]" + "[" + j + "] =");
				a[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		return a;
	}

	// Output a 2D array:
	public static void displayArray(int a[][], int numberOfRows, int numberOfColumns) {
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfColumns; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

	// Check if a matrix column is in ascending order:
	public static void ascendingOrder(int a[][], int numberOfRows, int numberOfColumns) {
		boolean flag = false;
		for (int i = 0; i < numberOfColumns; i++) {
			for (int j = 0; j < numberOfRows - 1; j++) {
				if (a[j][i] > a[j + 1][i]) {
					flag = true;
					break;
				}
			}
			if (flag == true) {
				System.out.println("Column " + i + " of the matrix is not in ascending order.");
			} else {
				System.out.println("Column " + i + " of the matrix is in ascending order.");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int numberOfRows = enterN(scan);
		int numberOfColumns = enterN(scan);
		int a[][] = createArray(numberOfRows, numberOfColumns, scan);
		System.out.println("The values of array A are: ");
		displayArray(a, numberOfRows, numberOfColumns);

		System.out.println("\n");
		ascendingOrder(a, numberOfRows, numberOfColumns);
	}
}
