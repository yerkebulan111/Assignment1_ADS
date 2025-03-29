public class Task_2 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        double result = printAVG();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("The average of {3,2,4,1} is: " + result);
        System.out.println("Time taken: " + duration + "milliseconds");
    }


    /**
     * This method returns the average of {3,2,4,1} : 2.5
     * It is a convenience method that internally calls the printAVG(int length, int[] arr) with default length of {3,2,4,1} which is 4
     *
     * @return Average of {3,2,4,1} : 2.5
     */
    public static double printAVG() {
        int[] array = {3,2,4,1};
        int length = 4;
        return printAVG(length, array);
    }


    /**
     * This method returns average of array
     * It uses iteration approach: for loop
     * Time complexity: O(n) where n is length of array
     * It calculates sum of elements in array and divide sum by length of the array
     *
     * @param length The length of the array
     * @param arr Array of numbers which its average will be calculated
     * @return The average of array
     */
    public static double printAVG(int length, int[] arr) {
        double sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }
        return sum / length;
    }
}