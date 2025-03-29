public class Task_10 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int result = GCD();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("GCD(32,48): " + result);
        System.out.println("Time taken: " + duration + "milliseconds");
    }


    /**
     * This method solves GCD(32,48)
     * It calls GCD method
     *
     * @return GCD(32,48)
     */
    public static int GCD() {
        return GCD(32,48);
    }


    /**
     * This method calculates gcd of two number: a and b
     * It uses a recursive approach
     * Time complexity: O(log(x)) where x=a if a>=b, or x=b if b>=a
     * a = b*q + r, where q=a/b and r=a%b
     * if r!=0 we should find GCD(b,r) and so on until we get r=0
     *
     * @param a One of two numbers
     * @param b One of two numbers
     * @return GCD of two number
     */
    public static int GCD(int a, int b) {
        if (a%b == 0) return b;
        else return GCD(b, a%b);
    }
}
