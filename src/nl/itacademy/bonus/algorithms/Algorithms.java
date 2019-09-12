package nl.itacademy.bonus.algorithms;

// utility class dus liever geen instanties maken (of niet nodig of zooo...)
public final class Algorithms {


    public static int gauss(int n) {

        return n * (n + 1) / 2;
    }

    public static int graph(int n) {
        return n * (n - 1) / 2;
    }

    public static int fac(int n) {
        if(n == 0) {
            return 1;
        }
        else {
            return n * fac(n-1);
        }
    }


    public static int josephusRaymie(int aantal) {

        int exp = (int) (Math.log(aantal) / Math.log(2));

        int rest = aantal - (int) (Math.pow(2, exp));

        return rest * 2 + 1;
    }


	// recursive solution
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
