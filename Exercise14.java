import java.util.Scanner;

public class Exercise14 {

    public Exercise14() {
        // TODO Auto-generated constructor stub
    }

    final static int min = -50;
    final static int max = 50;

    // Input n:
    public static int enterN(Scanner scan) {
        int n;
        do {
            System.out.println("Enter a value greater than 1: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1);
        return n;
    }

    // Input a 2D array:
    public static int[][] createArray(int numRows, int numCols, Scanner scan) {
        int[][] a = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                a[i][j] = min + (int) (Math.random() * ((max - min) + 1));
            }
        }
        return a;
    }

    // Output a 2D array:
    public static void printArray(int a[][], int numRows, int numCols) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    // Find the value that appears the most in the array:
    public static int[][] findValues(int a[][], int numRows, int numCols) {
        int b[][] = a;
        int c[][] = new int[numRows][numCols];
        for (int x = 0; x < numRows; x++) {
            for (int y = 0; y < numCols; y++) {
                for (int i = 0; i < numRows; i++) {
                    for (int j = 0; j < numCols; j++) {
                        if (a[x][y] == b[i][j]) {
                            c[x][y]++;
                        }
                    }
                }
            }
        }
        return c;
    }

    // Find the largest value in the sub-array:
    public static int findLargestValue(int c[][], int numRows, int numCols) {
        int largestValue = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (c[i][j] > largestValue) {
                    largestValue = c[i][j];
                }
            }
        }
        return largestValue;
    }

    // Output the number that appears the most in the array
    public static void mostFrequentNumber(int a[][], int c[][], int numRows, int numCols, int largestValue) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (c[i][j] == largestValue) {
                    System.out.println("The value: " + a[i][j] + " appears the most with a frequency of: " + c[i][j]);
                    break;
                }
            }
        }
    }

    // Another way to convert it to a 1D array:
    public static int[] to1DArray(int a[][], int numRows, int numCols) {
        int[] newArray = new int[numCols * numRows];
        int i = 0;
        for (int x = 0; x < numRows; x++) {
            for (int y = 0; y < numCols; y++) {
                newArray[i++] = a[x][y];
            }
        }
        return newArray;
    }

    // Output the 1D array:
    public static void print1DArray(int newArray[]) {
        for (int i : newArray) {
            System.out.print(i + "\t");
        }
    }

    // Count how many times each number appears in the 1D array:
    public static void mostFrequentNumbers(int newArray[]) {
        int b[] = new int[newArray.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (newArray[i] == newArray[j] && j < i) {
                    break;
                }
                if (newArray[i] == newArray[j] && j >= i) {
                    b[i]++;
                }
            }
        }
        int largestCount = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] > largestCount) {
                largestCount = b[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] == largestCount) {
                System.out.println("The most frequently appearing element is: " + newArray[i] + " with a count of: " + b[i] + " times");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numRows = enterN(scan);
        System.out.println("Enter the number of columns: ");
        int numCols = enterN(scan);
        int a[][] = createArray(numRows, numCols, scan);
        printArray(a, numRows, numCols);
        System.out.println("\n");
        System.out.println("The new 1D array is: ");
        findValues(a, numRows, numCols);
        int newArray[] = to1DArray(a, numRows, numCols);
        print1DArray(newArray);
        System.out.println("\n");
        mostFrequentNumbers(newArray);
    }
}
