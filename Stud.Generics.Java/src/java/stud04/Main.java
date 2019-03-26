package java.stud04;

public class Main {

    public static void main(String[] args) {

        Box <Integer> myBox = new Box <>(1);

        Integer i  = myBox.getItem();

        System.out.println(i);

    }
}
