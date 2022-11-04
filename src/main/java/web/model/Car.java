package web.model;


public class Car {
    private String model;
    private int serial;
    private int year;

    public Car(String model, int serial, int year) {
        this.model = model;
        this.serial = serial;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
