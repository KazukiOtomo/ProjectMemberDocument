package lecture02;

public class Excercise2_3 {
    public static void main(String[] args) {
        Tire[] tires = new Tire[4];
        for (int i = 0; i < tires.length; i++) {
            tires[i] = new Tire(65);
        }

        Engine engine = new Engine(400);

        Car03 car = new Car03(tires, engine);
        GasStation03 gasStation = new GasStation03();
        gasStation.refuel(car);
        car.startEngine();
        car.run();
    }
}
