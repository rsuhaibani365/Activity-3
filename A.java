public class Calculator {
    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println("Result: " + result);
    }

    public static int add(int a, int b) {
        int sum = a + b; // FIX: missing semicolon at the end of the statement
        return sum;
    }
}
