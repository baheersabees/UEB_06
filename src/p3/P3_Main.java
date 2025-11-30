package p3;

public class P3_Main {
    public static int methode(int[] a) {
        int max = -1;
        int k = a.length - 1;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (a[j] > a[i]) {
                    max = a[j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1,-4,-5,5,-2};
        int result = methode(array);
        System.out.println("The maximum value is: " + result);
    }
}
