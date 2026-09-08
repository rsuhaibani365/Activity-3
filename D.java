public class Comparison {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a == b) { // FIX: '=' is assignment; '==' is the equality comparison
            System.out.println("a is equal to b");
        }
    }
}
