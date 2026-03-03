public class Car {
    private double fuel;
    private double milesPerGallon;

    public Car(double fuel, double mpg) {
        this.fuel = fuel;
        milesPerGallon = mpg;
    }

    public boolean canMakeTrip(double distance) {
        if (milesPerGallon * fuel >= distance) {
            fuel -= distance / milesPerGallon;
            return true;
        }
        else {
            return false;
        }
    }

    public double getCurrentFuel() {
        return fuel;
    }

    public double getMpg() {
        return milesPerGallon;
    }
}
