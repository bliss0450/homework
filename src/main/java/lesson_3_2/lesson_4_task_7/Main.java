package lesson_3_2.lesson_4_task_7;

public class Main {
    public static void main(String[] args) {
        Porsh porsh = new Porsh("cool", "big", "911", "01.01.2019");
        porsh.move(100, 3);
        porsh.changeGearsUp();
        porsh.changeGearsDown();
        porsh.paint("black");
        porsh.lookGood();
    }
}
