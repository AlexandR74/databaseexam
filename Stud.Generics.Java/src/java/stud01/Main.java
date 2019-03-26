package java.stud01;

public class Main {

    public static void main(String[] args) {

        //StringTuple  st = new StringTuple ("left","right");

        final Tuple<String> st2 = new Tuple<>("l","r");

        System.out.println(st2.getLeft());

        final Tuple<Integer> st3 = new Tuple<>(1,2);

        System.out.println(st3.getLeft() +15);

        Tuple <SuperClass> tuple = new Tuple<>(new SuperClass(), new SuperClass());
        tuple.getLeft();
    }

    private static class SuperClass {

        @Override
        public String toString() {
            return "super";
        }
    }
}
