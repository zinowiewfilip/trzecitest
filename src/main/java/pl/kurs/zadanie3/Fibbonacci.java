package pl.kurs.zadanie3;

public class Fibbonacci {
    public int getFibbonacciIndex(int number){
        if(isFibonacci(number) == true){
            if (number <= 1)
                return number;
            int fib = 0;
            int res = 0;
            while (fib < number)
            {
                res++;
                fib = fib(res);

            }
            return res;
        }
        else
            return -1;
    }
    public int fib(int n){
        if ((n==1)||(n==2))
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
    static  boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
    static boolean isFibonacci(int n)
    {
        return isPerfectSquare(5*n*n + 4) ||
                isPerfectSquare(5*n*n - 4);
    }
}
