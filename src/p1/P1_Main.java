package p1;

public class P1_Main {
    public static int squared(int x) {
        return (x + 1) * (x + 1);
    }

    public static void main(String[] args) {
        int num = -3;
        int result = squared(num);
        System.out.println("The square of " + num + " is: " + result);
    }
}
