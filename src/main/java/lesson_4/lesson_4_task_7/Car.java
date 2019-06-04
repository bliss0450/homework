package lesson_4.lesson_4_task_7;

public class Car extends Vehicle {

    private String model;
    private String manufacturingDate;

    public Car(String name, String size, String model, String manufacturingDate) {
        super(name, size);
        this.model = model;
        this.manufacturingDate = manufacturingDate;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }


}

