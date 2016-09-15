/*
 * fizz-buzz.java
 * Version 20160915
 * Written by Harry Wong (RedAndBlueEraser)
 */

public class FizzBuzz {

    /** The maximum length of the fizz buzz sequence. */
    private final static int FIZZ_BUZZ_MAX_LENGTH = 50;

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(getFizzBuzz(FIZZ_BUZZ_MAX_LENGTH));
    }

    /**
     * Get the fizz buzz sequence string with the specified length.
     * @param length Length of the fizz buzz sequence string.
     * @return Fizz buzz sequence string.
     */
    public static String getFizzBuzz(int length) {
        String fizzBuzz = "";  // Fizz buzz sequence string.

        // Iterate over fizz buzz sequence.
        for (int i = 1; i <= length; i++) {
            // Iteration is divisible by 3; add "Fizz".
            if (i % 3 == 0) {
                fizzBuzz += "Fizz";
                // Iteration is divisible by 3 and 5; add "Buzz" after "Fizz".
                if (i % 5 == 0) {
                    fizzBuzz += " Buzz";
                }
            }

            // Iteration is divisible by 5; add "Buzz".
            else if (i % 5 == 0) {
                fizzBuzz += "Buzz";
            }

            // Add iteration.
            else {
                fizzBuzz += i;
            }

            // Separate values with a comma except for last value.
            if (i != length) {
                fizzBuzz += ", ";
            }
        }

        return fizzBuzz;
    }

}
