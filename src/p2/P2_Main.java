package p2;

public class P2_Main {
    public static boolean pairwiseDifferent(int[] someNumbers) {
        for (int i = 0; i < someNumbers.length; i++) {
            for (int j = i; j < someNumbers.length; j++) {
                if (someNumbers[j]==someNumbers[i] && i!=j) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(pairwiseDifferent(new int[]{3,5,3}));
    }
}
