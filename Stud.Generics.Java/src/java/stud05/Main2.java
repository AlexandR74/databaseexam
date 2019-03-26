package java.stud05;

public class Main2 {

    public static void main(String[] args) {
        Human h = new Human();
        SpaceShip2<Human> ss = new SpaceShip2<>(h);
        //ss.showLFName();
        Human h2    = ss.getLf();

    }
}
