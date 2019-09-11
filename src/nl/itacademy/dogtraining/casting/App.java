package nl.itacademy.dogtraining.casting;

import java.math.BigInteger;

public class App {

    public static void main(String[] args) {


        int age = 140;

        byte myAge = (byte) age;

        System.out.println(myAge);
        {
            for (int i = 0; i < 10; i++) {
                int getalVanDobbelSTeen = (int) (Math.random() * 6 + 1);
                System.out.println(getalVanDobbelSTeen);
            }
        }

        {
            for (int i = 0; i < 10; i++) {
                int getalVanDobbelSTeen = Double.valueOf(Math.random() * 6 + 1).intValue();
                System.out.println(getalVanDobbelSTeen);
            }
        }

        final int a = 15;

        byte goed = a;

        bar((byte) a);

        byte slecht = (byte) a;

        bar(slecht);

        int otherAge = (int) 834834374L;

        int ba = goed;


        float breuk = 9.81f * 2 + 3f; // goed maar liever gebruik in het wild een double

        // BigDecimal of een BigInteger

        BigInteger longGetal = new BigInteger("888888888888887348374837458423758724572485").pow(7333);

        System.out.println(longGetal);


    }

    public static void bar(byte b) {

    }
}
