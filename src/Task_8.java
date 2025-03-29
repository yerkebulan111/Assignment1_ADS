public class Task_8 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        String result = CheckForDigits() ? "Yes" : "No";
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("12345a789  all consists of digits ? : " + result);
        System.out.println("Time taken: " + duration + "milliseconds");
    }

    /**
     * This method checks if "12345a789" has another type of character except digits
     * This method calls CheckForDigits(String s) method
     *
     * @return True or false, if it contains other type of char returns false, if it doesn't returns true
     */
    public static boolean CheckForDigits() {
        return CheckForDigits("12345a789");
    }

    /**
     * This method defines whether given string s all consists of digits or not
     * It uses a recursive approach
     * Time complexity:
     *
     * @param s String which will be checked if it contains characters that is not digit
     * @return
     */
    public static boolean CheckForDigits(String s) {
        if ((47 < s.charAt(0) & s.charAt(0) <58 ) & s.length()==1) {
            return true;
        }
        else if (47 < s.charAt(0) & s.charAt(0) <58 ) {
            return CheckForDigits(s.substring(1));
        }
        else{return false;}
    }
}
