package java.stud03;


//  наследуемся нетипизированным классом от типизированного
public class StringTuple extends Tuple3 <String , String> {

    private final String middle;


    public StringTuple(final String left,  final String middle, final String right) {
        super(left, right);
        this.middle = middle;
    }

    public String getMiddle() {
        return middle;
    }

    public static void main(String[] args) {

        StringTuple a = new StringTuple("a", "b", "c");
        a.getMiddle();

    }
}
