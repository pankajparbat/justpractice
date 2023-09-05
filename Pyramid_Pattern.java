package DSA.first;

public class Pyramid_Pattern {
    public static void main(String[] args) {

        int r = 5, s = 0;

        for (int i = 1; i < r+1; ++i, s = 0) {
            for (int sp = 1; sp< r - i+1; ++sp) {
                System.out.print("  ");
            }

            while (s != 2 * i - 1) {
                System.out.print("* ");
                ++s;
            }

            System.out.println();
        }
    }
}