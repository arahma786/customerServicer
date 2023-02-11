package c322.homework.homework3.parta;

import java.util.Scanner;

public class MyCalculator {
    private Calculator strategy;

    public void setStrategy(Calculator strategy) {
        this.strategy = strategy;
    }

    public int performCalculation(int num1, int num2) {
        return strategy.execute(num1, num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Select operation (+, -, *, /, %, *%): ");
        String operation = scanner.next();
        MyCalculator calculator = new MyCalculator();
        switch(operation) {
            case "+":
                calculator.setStrategy(new Addition());
                break;
            case "-":
                calculator.setStrategy(new Subtraction());
                break;
            case "*":
                calculator.setStrategy(new Multiplication());
                break;
            case "/":
                calculator.setStrategy(new Division());
                break;
            case "%":
                calculator.setStrategy(new Modulo());
                break;
            case "*%":
                calculator.setStrategy(new ModuloMultiplication());
                break;
            default:
                System.out.println("Invalid operation ");
                return;
        }
        System.out.println("Result: " + calculator.performCalculation(num1, num2));
    }
}
