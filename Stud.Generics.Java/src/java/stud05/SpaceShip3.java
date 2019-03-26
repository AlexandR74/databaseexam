package java.stud05;

public class SpaceShip3 <T extends LifeForm>{  // мы эксендимся от лайт формы и имеем два типа Хуман или Дог

    private final T lf;

    public SpaceShip3(T lf) {
        this.lf = lf;

    }

    public T getLf() {
        return lf;
    }

    public void showLFName(){
        System.out.println(lf.getName());
    }
}
