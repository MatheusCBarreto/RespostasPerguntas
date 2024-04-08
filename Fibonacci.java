public class Fibonacci {

    static double fibonacci(double numero) {
        if (numero < 2) {
            return numero;
        }
        else {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }
}
