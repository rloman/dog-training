package nl.itacademy.ocp.recursion;

import nl.itacademy.ocp.recursion.reclist.RecList;

public class AppReclist {

    public static void main(String[] args) {
        RecList list = new RecList();


        list.add("A");
        list.add("B");
        list.add("C");

        list.print();

        System.out.println(list.size());

        System.out.println(list.get("B"));
        System.out.println(list.get("D"));

    }
}
