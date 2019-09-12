package nl.itacademy.bonus.algorithms;

// utility class dus liever geen instanties maken (of niet nodig of zooo...)
public final class Algorithms {


    public static int gauss(int n) {

        return n * (n + 1) / 2;
    }


    public static int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            /* The position returned by josephus(n - 1, k)
    is adjusted because the recursive call
    josephus(n - 1, k) considers the original
    position k%n + 1 as position 1 */
            return (josephus(n - 1, k) + k - 1) % n + 1;
        }
    }


    // utility class, so private constructor, no instance please
    private Algorithms() {

    }


}
