import java.util.Scanner;

public class Fibonacci {
    /**
     * Hier wird der Nutzer nach der Zahl abgefragt und das Ergebnis in der Konsole ausgegeben.
     * @param userInput: Nutzer input.
     * @param index: Fibonacci Position vom Nutzer eingegeben.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Geben Sie Ihre Fibonacci Position an:");
        System.out.flush();
        int index = userInput.nextInt();
        System.out.println("Fibonacci Rekursiv: " + fibonacciRekursiv(index));
        System.out.flush();
        System.out.println("Fibonacci Iterativ: " + fibonacciIterativ(index));
        System.out.flush();
        System.out.println("Fibonacci Formel: " + fibonacciFormel(index));
        System.out.flush();
        userInput.close();
    }

    /**
     * Hier wird die Fibonacci Zahl mit einer Formel berechnet.
     * @param index: Die Fibonacci Position von dem Nutzer eingegeben.
     * @return: Die berechnete Fibonacci Zahl.
     */
    public static long fibonacciFormel(int index) {
        return (long)(1 / (Math.sqrt(5.00))
                * (Math.pow((1 + Math.sqrt(5.00)) / 2, index) - Math.pow((1 - Math.sqrt(5.00)) / 2, index)));
    }
    
    /**
     * Hier wird die Fibonacci Zahl Iterativ berechnet, die while schleife addiert alle Fibonacci Positionen auf
     * bis zu dem index. 
     * @param index: Die Fibonacci Position von dem Nutzer eingegeben.
     * @return: Die berechnete Fibonacci Zahl.
     */
    public static long fibonacciIterativ(int index) {
        int count = 0;
        long result = 0;
        long prevResult = 0;
        while (count < index) {
            if (result == 0) {
                long temp = result;
                result++;
                prevResult = temp;
                count++;
            } else {
                long temp = result;
                result = result + prevResult;
                prevResult = temp;
                count++;
            }
        }
        return result;
    }

    /**
     * Hier wird fibonacci Rekursiv berechnet. Die Methode ruft sich selber auf um alle Fibonacci Positonen ab 
     * index miteinander zu berechnen, somit ist die Methode Rekursiv.
     * @param index: Die Fibonacci Position von dem Nutzer eingegeben.
     * @return: Die vorherige Fibonacci Position die berechnet wird.
     */
    public static long fibonacciRekursiv(int index) {
        if (index == 0 || index == 1) {
            return index;
        } 
        return fibonacciRekursiv(index - 1) + fibonacciRekursiv(index - 2);
    }
}
