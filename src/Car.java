public class Car {
    String color;
    String type;
    int serialNumber;
    static int carCount;

    Car() {
        carCount++;
        serialNumber = carCount;
    }

    Car(String c, String t) {
        color = c;
        type = t;
        carCount++;
        serialNumber = carCount;
    }

    void start() {
        System.out.println("get started");
    }

    String printDescription() {
        return "This is a " + color + " car and is a " + type;
    }
}
