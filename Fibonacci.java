public class Fibonacci {
    public static int fibonacci(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34
        // 0 1 2 3 4 5 6 7  8  9
        System.out.println(fibonacci(2));
    }
}
