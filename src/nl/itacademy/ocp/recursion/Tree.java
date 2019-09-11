package nl.itacademy.ocp.recursion;

public class Tree {

    private Integer node; // bewust Wrapper  want leeg is null

    private Tree left;  // contains smaller items than this.node
    private Tree right; // contains bigger items than this.node

    public void add(int n) {
        if(this.node == null) { // stomste versie
            this.node = n;
            this.left = new Tree();
            this.right = new Tree();
        }
        else {
            if(n < this.node) {
                left.add(n);
            }
            else {
                right.add(n);
            }
        }
    }

    public void printPreorder() {
        if(this.node != null) {
            System.out.print(this.node+"[");
        }
        if(this.left != null) {
            this.left.printPreorder();
        }
        if(this.right != null) {
            this.right.printPreorder();
            System.out.print("]");
        }
    }


    public void printInorder() {
        if(this.left != null) {
            this.left.printInorder();
        }
        if(this.node != null) {
            System.out.print("[");
            System.out.print(this.node);
            System.out.print("]");
        }
        if(this.right != null) {
            this.right.printInorder();
        }
    }


}
