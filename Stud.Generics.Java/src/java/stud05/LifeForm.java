package java.stud05;


// жизненая форма имеет поле имя, контруктор, геттер;
public class LifeForm {

    private final String name;

    public LifeForm(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
