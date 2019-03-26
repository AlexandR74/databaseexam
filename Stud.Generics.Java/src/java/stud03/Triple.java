package java.stud03;

public class Triple < T1, T2, T3 > extends Tuple3 < T1, T3> {



    private final T2 middle;


    public Triple(final T1 left, final T3 right, final T2 middle) {
        super(left, right);
        this.middle = middle;
    }

    public T2 getMiddle() {
        return middle;
    }

    public static void main(String[] args) {

        Triple <Long, String, Integer > tr = null;
        tr.getRight();

    }   // tulpe3 < Long, Integer>
        // triple <Long , String, Integer>
}
