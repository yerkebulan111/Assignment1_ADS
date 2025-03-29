public class Task_3 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        String result = isItPrime() ? "Prime" : "Composite";
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("7 is: " + result);
        System.out.println("Time taken: " + duration + "milliseconds");
    }



    /**
     * This method defines whether 7 is prime or composite
     * It is a convenience method that internally calls the isItPrime(int number) with default number of 7
     *
     * @return true
     */
    public static boolean isItPrime() {
        int number = 7;
        return isItPrime(number);
    }


    /**
     * This method returns true or false, if number is prime it returns true, if it is not - false
     * This method uses conditions and for loop
     * Time complexity: O(n-2), where n is the given positive number
     * The condition will check if the positive number can be divided by any number in interval 2 to number-1,
     * if it can be divided without remainder, it is not prime number, it is composite
     *
     * @param number The positive number that either prime or composite
     * @return true or false, true - prime, false - composite
     */
    public static boolean isItPrime(int number) {
        boolean isPrime = true;
        if (number == 1) {isPrime = false;}
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {isPrime = false;}
        }
        return isPrime;
    }
}