package kalkulator;


public class Main {

    private static long rekurenciaFibonnaci(long n) {
        if (n == 0) {
            return 0;
        } else {
            if (n == 1) {
                return 1;
            } else {
                return rekurenciaFibonnaci(n - 1) + rekurenciaFibonnaci(n - 2);
            }
        }
    }

    private static long silnia(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n * silnia(n - 1);
        }
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(rekurenciaFibonnaci(10));
        long end = System.nanoTime();
        long elapsed = end - start;
        long start1 = System.nanoTime();
        System.out.println(silnia(10));
        long end1 = System.nanoTime();
        long elapsed1 = end1 - start1;
        System.out.println(elapsed);
        System.out.println(elapsed1);

    }
}

