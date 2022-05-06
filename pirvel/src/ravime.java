//დაწერეთ კლასი Vehicle ველებით: მოდელი, ცხენის ძალა, მაქს. სიჩქარე.
//        განსაზღვრეთ შვილი კლასები. მაგალითად, Car, Bus, SportCar.
//        და ამათი კონკრეტული მწარმოებლები: Porsche, Mercedes, BMW, Ford, GAZ, VAZ და ა.შ.
//
//        ინიციალიზაციის ბლოკი დაუწერეთ Vehicle კლასს რომელიმე ერთ ველზე მაინც.
//
//        გადაუფარეთ მანქანას toString მეთოდი, რომელიც ყველა შთამომავალს გაყვება.

public class ravime {
}

class Vehicle{
    String model;
    int horsePover;
    int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", horsePover=" + horsePover +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

class Car extends Vehicle{
    public Car(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
}
class Bus extends Vehicle{
    public Bus(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
}
class SportCar extends Vehicle{
    public SportCar(String model, int maxSpeed,int horsePover) {
        super(model, maxSpeed);
        this.horsePover=horsePover;
    }
}


enum Fruit {
    APPLE(.2), PEAR(.5), BANANA(.834), COCONUT(1.2);
    private double calories;
    Fruit(double calories) { this.calories = calories; }
    public double getCalories() { return calories; }
}




