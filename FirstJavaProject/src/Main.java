import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int num1;
    static int num2;

    public static void main(String[] args) {

        String option;
        double result;

        do {
            System.out.println("Simple menu calculator");
            System.out.println("1. add");
            System.out.println("2. sub");
            System.out.println("3. mul");
            System.out.println("4. div");
            System.out.println("5. exit");
            System.out.println("Select an Option from the following");
            option = scanner.next();
            switch (option) {
                case "add":
                    setNumbers();
                    result = num1 + num2;
                    System.out.println(result);
                    break;
                case "sub":
                    setNumbers();
                    result = num1 - num2;
                    System.out.println(result);
                    break;
                case "mul":
                    setNumbers();
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case "div":
                    setNumbers();
                    result = (double) num1 / num2;
                    System.out.println("Result = "+result);
                    break;
                case "exit":
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        } while (!option.equals("exit"));

    }

    static void setNumbers() {
        System.out.print("Enter number1 ");
        num1 = scanner.nextInt();
        System.out.print("Enter number2 ");
        num2 = scanner.nextInt();
    }
}
