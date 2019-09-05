package nl.itacademy.ocp.recursion.reclist;

public class RecList {

    private Object head;
    private RecList tail;

    public void add(Object value) {
        if(this.head == null) {
            this.head = value;
            this.tail = new RecList();
        }
        else  {
            this.tail.add(value);
        }
    }

    public void print() {
        if(head == null) {
            return;
        }
        else {
            System.out.print(head+", ");
            tail.print();
        }
    }

    public int size() {
        if(head == null) {
            return 0;
        }
        else {
            return 1 + tail.size();
        }
    }

    // refactor to Optional rloman
    public Object get(Object o) {
        if(head == null) {
            return null;
        }
        else {
            if(head.equals(o)) {
                return head;
            }
            else {
                return tail.get(o);
            }
        }

    }
}
