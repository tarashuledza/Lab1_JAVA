package Task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean stop = false;

        System.out.print("Enter: ");
        double result = scan.nextDouble();

        while (!stop) {

            String operation = scan.next();
            double num2;
            switch (operation) {
                case "+":
                    num2 = scan.nextDouble();
                    result += num2;
                    continue;
                case "-":
                    num2 = scan.nextDouble();
                    result -= num2;
                    continue;
                case "/":
                    num2 = scan.nextDouble();
                    result /= num2;
                    continue;
                case "*":
                    num2 = scan.nextDouble();
                    result *= num2;
                    continue;
                case "=":
                    System.out.print("Result: " + result);
                    break;
                case "del":
                    result = 0;
                    System.out.print("Result was cleaned");
                    break;
                default:
                    System.out.println("Invalid operation: " + operation);
                    break;
            }
        }
    }

}
