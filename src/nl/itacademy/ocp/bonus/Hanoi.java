package nl.itacademy.ocp.bonus;

public final class Hanoi {

    private static int counter;

    public static void hanoi(int aantal) {
        hanoi(aantal, 1,2,3);
    }


    private static void hanoi(int aantal, int van, int via, int naar) {

        // simpelste versie, => done
        if(aantal== 0) {
            return;
        }
        else {
            hanoi(aantal-1, van, naar, via); // recursive!!!
            System.out.printf("Move %d to %d (stap %d)%n", van, naar, ++counter);
            hanoi(aantal-1, via, van, naar);
        }
    }
}