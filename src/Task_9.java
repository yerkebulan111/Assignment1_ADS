public class Task_9 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int result = binomialC();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("7 choose 3: " + result);
        System.out.println("Time taken: " + duration + "milliseconds");
    }


    /**
     * This method calculates 7 choose 3
     * It is a convenience method that internally calls binomialC(int n, int k) method
     * @return 7 choose 3
     */
    public static int binomialC() {
        return binomialC(7,3);
    }

    /**
     * This method calculates binomial coefficient (n choose k)
     * It uses recursive approach
     * Time complexity: O(2^n)
     *The method breaks down the task into smaller tasks: binomialC(n,k) = binomialC(n-1,k-1) + binomialC(n-1,k),
     * everytime there is block binomialC(k,k) or binomialC(0,n) in STACK, it returns 1
     *
     * @param n The number of ways to choose k elements
     * @param k
     * @return Binomial coefficient n choose k
     */
    public static int binomialC(int n, int k) {
        if (k==0 || k==n)
            return 1;
        else return binomialC(n-1,k-1) + binomialC(n-1, k);

    }
}
