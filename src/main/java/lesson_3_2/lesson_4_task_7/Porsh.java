package lesson_3_2.lesson_4_task_7;

public class Porsh extends Car{
    private String uniqueColor;

    public Porsh(String name, String size, String model, String manufacturingDate) {
        super(name, size, model, manufacturingDate);
    }


    public void lookGood() {
        System.out.println("Your car looks good");
    }

    public void paint(String colorName) {
        System.out.println("Your car is now painted " + colorName);
    }
}

