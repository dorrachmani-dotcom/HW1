public class Assignment01Q03 {
    // Note: int overflows for x >= 47 (F(47) > Integer.MAX_VALUE); long would work up to x = 92.
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int numOdd = 0;
        int prev1 = 1;
        int prev2 = 1;
        for (int i = 0; i < x; i++) {
            if (prev1 % 2 != 0) {
                numOdd++;
            }
            System.out.print(prev1);
            if (i < x - 1)
                System.out.print(" "); // Make sure we don't print a trailing space
             int next = prev1 + prev2;
            prev1 = prev2;
            prev2 = next;
        }
        System.out.println();        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
