import java.io.Console;
class Calcu{
    public static void main(String args[]){
        double a=10;
        double b=5;
        Console C= System.console();
        System.out.println("Enter operator (+, -, *, /): ");
        char op = C.readLine().charAt(0);
        switch(op){
            case '+':
                System.out.println("Addition: " + (a+b));
                break;
            case'-':
                System.out.println("Subtraction: " + (a-b));
                break;
            case'*':
                System.out.println("Multiplication: " + (a*b));
                break;
            case'/':
                System.out.println("Division: " + (a/b));
                break;
            default:
                System.out.println("Invalid operator");
    }
}
}
