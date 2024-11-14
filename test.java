public class SampleJavaProgram {
    public static void main(String[] args) {
        // Print a welcome message to the console
        System.out.println("Welcome to the Sample Java Program!");
        
        // Basic loop example
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration number: " + i);
        }
        
        // Simple method call
        greetUser("Jane Doe");
    }

    // A method to greet the user
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to the program.");
    }
}
