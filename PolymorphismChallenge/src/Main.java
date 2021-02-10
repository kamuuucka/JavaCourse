public class Main {
    public static void main(String[] args) {
        Car car = new Car("Basic", 8);
        System.out.println(car.startEngine());
        System.out.println(car.brake());

        RS7 rs7 = new RS7("RS7",4);
        System.out.println(rs7.startEngine());
        System.out.println(rs7.brake());

        Lancia lancia = new Lancia("Lancia",8);
        System.out.println(lancia.startEngine());
        System.out.println(lancia.brake());

        Maluch maluch = new Maluch("Maluch", 1);
        System.out.println(maluch.startEngine());
        System.out.println(maluch.brake());
    }
}
class Car {
    private String name;
    private boolean engine;
    private int wheels;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car goes vroom";
    }

    public String brake(){
        return "Braking";
    }
}

class RS7 extends Car{
    public RS7(String name, int cylinders) {
        super(name,cylinders);
    }
    @Override
    public String startEngine(){
        return "Robię WRUUUUM jak " + getClass().getSimpleName();
    }

    @Override
    public String brake() {
        return "Iiiiii";
    }
}

class Lancia extends Car{
    public Lancia(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ijłup";
    }

    @Override
    public String brake() {
        return "Szrum";
    }
}

class Maluch extends Car{
    public Maluch(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Not starting.";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " broke";
    }
}
