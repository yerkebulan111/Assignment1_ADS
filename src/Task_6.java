public class Task_6 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int result = aPowerOfn();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("2 to the power of 10 is: " + result);
        System.out.println("Time taken: " + duration + "milliseconds");
    }



    /**
     * This method returns 2^10
     * It is a convenience method that internally calls aPowerOfn(int a, int n) method
     *
     * @return 2^10
     */
    public static int aPowerOfn() {
        return aPowerOfn(2,10);
    }

    /**
     * The method calculates a to the power of n: a^n
     * It uses a recursive approach
     * Time complexity: O(n), where n is a given power
     * The method breaks down the task into smaller tasks: a^n = a*a^(n-1),
     * a^(n-1) = a*a*a(n-2), and so on, when it comes a^1 where n==1, it returns a
     *
     * @param a The number which will be calculated its n power
     * @param n Power of the a
     * @return The a to the power of n
     */
    public static int aPowerOfn(int a, int n) {
        if (n==1) {return a;}
        else {return a * aPowerOfn(a, n-1);}
    }
}