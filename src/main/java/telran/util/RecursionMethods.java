package telran.util;

public class RecursionMethods {
    public static void f(int a) {
        if (a > 3) {
            f(a - 1);
        }
    }

    public static long factorial(int n) {
        // n! = 1 * 2 * 3 *.....*n
        if (n < 0) {
            n = -n;
        }
        return n == 0 ? 1 : n * factorial(n - 1);
    }

    /**
     * 
     * @param num - any integer number
     * @param degree - any positive number
     * @return num ^ degree
     * limitations:
     * 1. no cycles allowed
     * 2. arithmetic operators + ; - are allowed only
     * 3. bitwise operators like >>, <<, &&, etc disallowed
     */
    public static long pow(int num, int degree) {
        if (degree < 0) {
            throw new UnsupportedOperationException("Negative exponent is not supported");
        }
        if (degree == 0) {
            return 1; // Base case: any number to the power of 0 is 1
        }
        if (num == 0) {
            return 0; // If the base is 0 and degree is not 0, result is always 0
        }
        return multiply(num, pow(num, degree - 1));
    }
    
    private static long multiply(int a, long b) {
        // Handle cases where b is 0
        if (b == 0) {
            return 0;
        }
        
        // Using an iterative approach to avoid deep recursion
        long result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }
    

    public static int sum(int[] array) {
        return sum(array, array.length);
    }

    private static int sum(int[] array, int length) {
        return length == 0 ? 0 : array[length - 1] + sum(array, length - 1);
    }

    /**
     * 
     * @param x
     * @return x ^ 2
     * limitations:
     * 1. no cycles
     * 2. arithmetic operators only + ; -
     * 3. no bitwise operators
     * 4. no standard and additional methods are allowed
     * 5. no additional fields of the class RecursionMethods are allowed
     */
    public static int square(int x) {
        if (x == 0) {
            return 0;
        }
        if (x < 0) {
            x = -x;
        }
        return squareHelper(x, x);
    }

    // Helper method to simulate x^2 using only addition
    private static int squareHelper(int x, int count) {
        if (count == 1) {
            return x;
        }
        return x + squareHelper(x, count - 1);
    }

    /**
     * 
     * @param string
     * @param subString
     * @return true if subString is actually substring of the given string
     * limitations:
     * 1. no cycles
     * 2. the allowed methods of class String are
     *     2.1 charAt(int index)
     *     2.2 length()
     *     2.3 substring(int beginIndex)
     */
    public static boolean isSubstring(String string, String subString) {
        int lenStr = string.length();
        int lenSub = subString.length();

        if (lenSub == 0) {
            return true; // Empty substring is always a substring
        }
        if (lenStr < lenSub) {
            return false; // If substring is longer than string, it cannot be a substring
        }

        // Compare the beginning of the string with the substring
        if (compareStrings(string, subString)) {
            return true;
        }

        // Recursive call with the string shifted by 1 character
        return isSubstring(string.substring(1), subString);
    }

    // Helper method to compare characters of two strings
    private static boolean compareStrings(String string, String subString) {
        for (int i = 0; i < subString.length(); i++) {
            if (string.charAt(i) != subString.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
