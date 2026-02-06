import java.util.Scanner;

class Cal {
    public static void main(String args[]) {

        double a = 10;
        double b = 5;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;

            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;

            case '/':
                System.out.println("Division: " + (a / b));
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}
