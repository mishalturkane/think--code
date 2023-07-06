package junemonth;

import java.util.Scanner;

public class june25 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for (int i = 0; i < n; i++) {
            int length = kb.nextInt();
            String a = kb.next();
            String b = kb.next();

            boolean result = checkSameString(a, b);
            System.out.println(result ? "YES" : "NO");
        }
    }

    private static boolean checkSameString(String a, String b) {
        // Compare the contents of A and B
        if (a.equals(b)) {
            return true; // A and B are already the same string
        }

        // Concatenate A and B in different orders and compare
        String ab = a + b;
        String ba = b + a;

        return ab.equals(ba);
    }
}
