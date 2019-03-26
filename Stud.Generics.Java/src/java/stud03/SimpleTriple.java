package java.stud03;

public class SimpleTriple <T> extends Tuple3 <T , T> {

    private final T middle;

    public SimpleTriple (final T left, final T right, final T middle) {
        super(left,right);
        this.middle=middle;
    }

    public T getMiddle () {
        return middle;
    }

    public static void main(String[] args) {
        SimpleTriple <Long>  triple;     // <LONG>!!!
    }
}
