public class Task_4 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int result = facto();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("The factorial of 5 is: " + result);
        System.out.println("Time taken: " + duration + "milliseconds");
    }



    /**
     * This method calculates factorial of 5
     *It is a convenience method that internally calls the facto(int n) method with default value of 5
     *
     * @return
     */
    public static int facto() {
        return facto(5);
    }

    /**
     * This method calculates factorial of a given number
     * It uses a recursive approach
     * Time complexity: O(n), where n is the parameter of this method
     * The method calculates this task by dividing (divide & conquer) it into smaller parts: facto(n) = n*facto(n-1)
     *facto(n-1) = (n-1)*facto(n-2) and so on
     *
     * @param n The number that will be calculated its factorial
     * @return Factorial of n
     */
    public static int facto(int n) {
        if (n == 1) return 1;
        else return n * facto(n - 1);
    }
}