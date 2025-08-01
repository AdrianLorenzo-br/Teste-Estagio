public class Fibonacci {

    int fibonacci_Linear(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        int n1 = 0;
        int n2 = 1;
        if (num > 1) {
            for (int i = num - 1; i > 0; i--) {
                int n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
        }
        return n2;
    }

    int fibonacci_Recursivo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci_Recursivo(n - 1) + fibonacci_Recursivo(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci teste = new Fibonacci();
        System.out.println(teste.fibonacci_Linear(6));
        System.out.println(teste.fibonacci_Recursivo(6));
    }}