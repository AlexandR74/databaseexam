package java.stud04;


import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        show(list);

    }

    private static void show (final List list) {
        list.forEach(System.out::println);
    }
}
