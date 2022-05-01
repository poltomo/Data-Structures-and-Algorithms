// 0 1 1 2 3 5 8 13 21 34
// 0 1 2 3 4 5 6 7  8  9
class Fibonacci {
    public static long fibonacci(int n){
        if (n<2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    private static long[] fibCache;

    public static long fibonacciMemo(int n){
        if (n<2){
            return n;
        }
        if (fibCache[n] != 0){
            return fibCache[n];
        }

        long nthFibNum = fibonacci(n-1) + fibonacci(n-2);

        fibCache[n] = nthFibNum;

        return nthFibNum;
    }

    public static void main(String[] args) {

        int n = 9;
        fibCache = new long[n+1];
        for (int i = 0;i<=n;i++){
            System.out.println(fibonacciMemo(i));
        }
    }
}
