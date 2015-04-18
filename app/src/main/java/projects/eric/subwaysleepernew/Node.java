package projects.eric.subwaysleepernew;

/**
 * Created by Eric on 4/15/2015.
 */
public class Node {
    private Node next;
    private float value;


    //For test purposes
    public Node(float v) {
        this.value = v;
    }

    public Node() {
        this.next = null;
        this.value = -1;
    }

    public Node(Node n, float v) {
        this.next = n;
        this.value = v;
    }

    public Node car() {
        return this.next;
    }

    public Node cadr() {
        return this.next.next;
    }

    public float getValue() {
        return value;
    }

    public void cons(float v) {
        this.next = new Node(this.next, v);
    }

    public float getSum() {
        if(this.next.next == null) {
            return this.next.value;
        }
        return car().value + car().getSum();
    }

    public float getLength() {
        if(this.next == null) {
            return 0;
        }
        return 1 + car().getLength();
    }

    public float getAverage() {
        return getSum()/getLength();
    }

    public float getStd() {
        float mean = getAverage();
        float sum = 0f;
        float counter = 0f;
        while (this.next != null) {
            sum += (float) Math.pow((double) (this.car().getValue() - mean), 2.0);
            this.next = this.next.next;
            counter++;
        }
        return sum/counter;
    }

    public void clear() {
        this.next = null;
    }
}
