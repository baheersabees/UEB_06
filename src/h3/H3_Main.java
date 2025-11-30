package h3;

public class H3_Main {
    public static boolean compareArraysVal(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            int countA = 0;
            int countB = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    countA++;
                }
                if (a[i] == b[j]) {
                    countB++;
                }
            }

            if (countA != countB) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};
        int[] c = {1, 3, 2};
        int[] d = {1, 2};
        int[] e = {1, 2, 3};
        int[] f = {1, 1, 2};

        System.out.println("compareArraysVal(a, c): " + compareArraysVal(a, c)); // true
        System.out.println("compareArraysVal(a, e): " + compareArraysVal(a, e)); // true
        System.out.println("compareArraysVal(c, e): " + compareArraysVal(c, e)); // true
        System.out.println("compareArraysVal(a, b): " + compareArraysVal(a, b)); // false
        System.out.println("compareArraysVal(a, d): " + compareArraysVal(a, d)); // false
        System.out.println("compareArraysVal(c, f): " + compareArraysVal(c, f)); // false
    }
}
