public class Task_5 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int result = fibb();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("The 17-th element in Fibonacci sequence is: " + result);
        System.out.println("Time taken: " + duration + "milliseconds");
    }



    /**
     * This function gives 17-th element in Fibonacci sequence
     * It is a convenience method that internally calls fibb(int n) method
     *
     * @return Element which is in 17-th position in Fibonacci sequence
     */
    public static int fibb() {
        return fibb(17);
    }

    /**
     * This function n-th element in Fibonacci sequence
     * It uses a recursive approach
     * Time complexity: O(2^n), where n is a given number
     * The method breaks down the task into smaller tasks: fibb(n) = fibb(n-1) + fibb(n-2),
     * fibb(n-1) = fibb(n-2) + fibb(n-3) and so on,
     * everytime there is block fibb(0) or fibb(1) in STACK, it returns 0 or 1 respectively
     *
     * @param n n-th position in Fibonacci sequence which will be calculated
     * @return n-th element in the Fibonacci sequence
     */
    public static int fibb(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        else return fibb(n - 1) + fibb(n - 2);
    }
}