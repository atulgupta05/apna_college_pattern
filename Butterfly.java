public class Butterfly {
    public static void main(String args[]) {
        int n = 5;
        // Upper Part
        for (int i = 1; i <= n; i++) {
            // First Part Star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" " + " ");
            }
            // Second Part Star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            // Next Line
            System.out.println("");
        }

        // Lower Part
        for (int i = n; i >= 1; i--) {
            //First Part Star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" " + " ");
            }
            // Second Part Star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            // Next Line
            System.out.println("");
        }
    }
}