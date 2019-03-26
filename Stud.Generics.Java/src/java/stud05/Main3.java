package java.stud05;

public class Main3 {

    public static void main(String[] args) {
        Human h = new Human();
        SpaceShip3<Human> ss = new SpaceShip3<>(h);     // Указывает тип Хуман (или ДОГ)
        ss.showLFName();
        Human h2 = ss.getLf();
    }
}
