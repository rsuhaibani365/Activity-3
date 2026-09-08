public class LoopExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // FIX: missing opening brace for the loop body
            System.out.println("Iteration: " + i);
        }
    }
}
