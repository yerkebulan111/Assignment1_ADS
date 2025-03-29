import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the number of elements
        printReverse(n, scanner);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("\nTime taken: " + duration + " milliseconds");
        scanner.close();
    }

    /**
     * This method gives reverse order version of given an array of n elements
     * It uses a recursive approach
     * Time complexity: O(n), where n is number of elements of array
     *
     * @param n Number of elements of given array
     * @param scanner Scanner, to scan input elements of array
     */
    public static void printReverse(int n, Scanner scanner) {
        if (n == 0) {
            return;
        }
        int a = scanner.nextInt();
        printReverse(n - 1, scanner);
        System.out.print(a + " ");
    }
}
