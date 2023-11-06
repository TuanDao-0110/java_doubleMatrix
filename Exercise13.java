import java.util.Scanner;

public class Exercise13 {

	public Exercise13() {
		// TODO Auto-generated constructor stub
	}

	final static int min = -50;
	final static int max = 50;

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
				a[i][j] = min + (int) (Math.random() * ((max - min) + 1));
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

	// Calculate the sum of integers in the matrix:
	public static void calculateSum(int a[][], int numberOfRows, int numberOfColumns) {
		int sum = 0;
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfColumns; j++) {
				sum += a[i][j];
			}
		}
		System.out.println("The sum of integers in the matrix is: " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int numberOfRows = enterN(scan);
		System.out.println("Enter the number of columns: ");
		int numberOfColumns = enterN(scan);
		int a[][] = createArray(numberOfRows, numberOfColumns, scan);
		displayArray(a, numberOfRows, numberOfColumns);
		calculateSum(a, numberOfRows, numberOfColumns);
	}
}
