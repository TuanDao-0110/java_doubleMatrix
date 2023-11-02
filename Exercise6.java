import java.util.Scanner;

public class Exercise6 {

    public Exercise6() {
        // TODO Auto-generated constructor stub
    }

    // Input n:
    public static int inputN(Scanner scan) {
        int n;
        do {
            System.out.println("Enter a value > 1: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1);
        return n;
    }

    // Create a 2D array:
    public static int[][] createArray(int numRows, int numCols, Scanner scan) {
        int[][] a = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.println("a[" + i + "]" + "[" + j + "] =");
                a[i][j] = Integer.parseInt(scan.nextLine());
            }
        }
        return a;
    }

    // Display a 2D array:
    public static void displayArray(int a[][], int numRows, int numCols) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    // Check if all elements in the 2D array are negative:
    public static void allNegative(int a[][], int numRows, int numCols) {
        boolean flag = false;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (a[i][j] >= 0) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("The array contains both positive and negative numbers.");
        } else {
            System.out.println("The array contains only negative numbers.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numRows = inputN(scan);
        int numCols = inputN(scan);
        int a[][] = createArray(numRows, numCols, scan);
        System.out.println("Array A values are: ");
        displayArray(a, numRows, numCols);

        System.out.println("\n");
        allNegative(a, numRows, numCols);
    }
}
