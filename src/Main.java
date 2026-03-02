public class Main {
    public static void main(String[] args) {
        boolean possible;
        Car carOne = new Car(10.0, 30.0);
        possible = carOne.canMakeTrip(120.0);
        possible = carOne.canMakeTrip(90.0);
        possible = carOne.canMakeTrip(225.0);
        Car carTwo = new Car(12.0, 15.0);
        possible = carTwo.canMakeTrip(300.0);
        possible = carTwo.canMakeTrip(180.0);


    }
}
