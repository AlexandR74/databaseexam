package java.stud05;

public class SpaceShip2 <T>{

    private final T lf;

    public SpaceShip2(T lf) {
        this.lf = lf;
    }

    public T getLf() {
        return lf;
    }
    //  метод не будет работать потому как тип Обджект не имеет метода getName
    // public void showLFName(){
    // System.out.println(lf.getName());
    //    }
}
