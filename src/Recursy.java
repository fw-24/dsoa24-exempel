public class Recursy {

    static long ops = 0;
    static void loop(int i, int max) {
        if (i > max) return;
        System.out.print(i + " ");
        loop(i+1, max);
    }

    /**
     * Fibonacci
     * "raw recursion"
     */
    static int fib(int n) {
        ops++;
        //System.out.println(" ".repeat(n) + n);
        if (n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }

    /**
     * Fibonacci with Memoization (cache)
     */
    static long[] fibCache = new long[100];
    static long fastFib(int n) {
        ops++;
        // finns det i cachen?
        if (fibCache[n] != 0) return fibCache[n];
        if (n <= 1) return n;
        long retVal = fastFib(n-1) + fastFib(n-2);
        // spara värdet i cachen
        fibCache[n] = retVal;
        return retVal;
    }

    /**
     * CC Accursed Recursion
     */
    static void countdown(int i) {
        if (i < 0) return;
        System.out.print(i + " ");
        countdown(i-1);
    }
    static int pow(int n, int exp) {
        if (exp <= 1) return n;
        return n * pow(n, exp-1);
    }

}


