public class NumberPallindrome {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            //Printing Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            //Printing First Numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j+"  ");
            }

            //Printing Second Numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j+"  ");
            }

            //Next Line
            System.out.println("");
        }
    }
}
