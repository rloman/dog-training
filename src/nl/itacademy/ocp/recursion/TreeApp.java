package nl.itacademy.ocp.recursion;

public class TreeApp {

    public static void main(String[] args) {
        Tree t = new Tree();

        t.add(3);
        t.add(4);
        t.add(2);

//        t.printInorder();
        t.printPreorder();
    }
}
