package main;

public class Car {
    private String brand;
    private String model;
    private int speed = 0;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public void status() {
        System.out.print("Auto: " + brand + " " + model);
        System.out.print(", Nopeus: " + speed + " km/h \n");
    }

    public void setSpecs(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void accelerate(int speed) {
        this.speed += speed;
    }

    public void decelerate(int speed) {
        if(this.speed < speed) {
            this.speed = 0;
            return;
        }
        else {
            this.speed -= speed;
        }

    }
}