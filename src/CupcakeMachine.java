public class CupcakeMachine {
    private int stock;
    private double cost;
    public static int orders;

    public CupcakeMachine(int stock, double cost) {
        this.stock = stock;
        this.cost = cost;
        orders = 0;
    }
    public String takeOrder(int orderedCupcakes) {
        if (stock >= orderedCupcakes) {
            stock -= orderedCupcakes;
            orders++;
            return "Order number " + orders + ", cost $" + orderedCupcakes * cost;
        } else {
            return "Order cannot be filled";
        }
    }

    public int getAvailCupcakes() {
        return stock;
    }

    public double getCupcakeCost() {
        return cost;
    }
}
