public class HelloWorld {
    public static void main(String[] args) throws Exception {
        Car myCar1 = new Car("white", "sedan");
        Car myCar2 = new Car("red", "van");
        Car myCar3 = new Car("balck", "coupe");
        System.out.println(myCar1.color + " " + myCar1.type + " " + myCar1.serialNumber);
        System.out.println(myCar2.color + " " + myCar2.type + " " + myCar2.serialNumber);
        System.out.println(myCar3.color + " " + myCar3.type + " " + myCar3.serialNumber);
        System.out.println(Car.carCount);
    }
}
