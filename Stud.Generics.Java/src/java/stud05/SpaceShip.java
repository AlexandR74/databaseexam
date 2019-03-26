package java.stud05;

public class SpaceShip {

    private final LifeForm lf;

    public SpaceShip(LifeForm lf) {
        this.lf = lf;
    }

    public LifeForm getLf() {
        return lf;
    }

    public void showLFName(){
        System.out.println(lf.getName());
    }
}
