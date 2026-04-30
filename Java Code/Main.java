public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        
        try {
            System.out.print("ans :-" + a / b);
        } 
        catch (ArithmeticException e) {
            System.out.print("Error: Cannot divide by zero.");
        }
    }
}
