package java.stud05;

public class Main {
    public static void main(String[] args) {
        Human h = new Human();                         // Создаем космонафта
        SpaceShip ss = new SpaceShip(h);               // создаем корабль изаписываем туда космонавта
        ss.showLFName();                               // возвращаем жизненную форму
        //Human h2 = ss.getLf();                       // обратно хумана мы достать не сможет
        LifeForm lf = ss.getLf();                     // вернуть можно только лайтформ. так как типы везде Лайт форм
    }                                                 // тип лайтформ.  и  все привдится к типу Лайтформ

}
