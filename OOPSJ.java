public class OOPSJ {

    public static void main(String[] args) {

        // Check if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Use enhanced for loop (for-each)
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}