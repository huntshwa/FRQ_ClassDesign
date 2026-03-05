public class Main {
    public static void main(String[] args) {
//        boolean possible;
//        Car carOne = new Car(10.0, 30.0);
//        possible = carOne.canMakeTrip(120.0);
//        System.out.println(possible);
//        possible = carOne.canMakeTrip(90.0);
//        System.out.println(possible);
//        possible = carOne.canMakeTrip(225.0);
//        System.out.println(possible);
//        Car carTwo = new Car(12.0, 15.0);
//        possible = carTwo.canMakeTrip(300.0);
//        System.out.println(possible);
//        possible = carTwo.canMakeTrip(180.0);
//        System.out.println(possible);

//        boolean possible;
//        System.out.println("---- Car 1 Tests ----");
//        Car carOne = new Car(10.0, 30.0);
//        System.out.println(carOne.getCurrentFuel() + "  " + carOne.getMpg());
//        possible = carOne.canMakeTrip(120.0);
//        System.out.println(possible);
//        System.out.println(carOne.getCurrentFuel() + "  " + carOne.getMpg());
//        possible = carOne.canMakeTrip(90.0);
//        System.out.println(possible);
//        System.out.println(carOne.getCurrentFuel() + "  " + carOne.getMpg());
//        possible = carOne.canMakeTrip(225.0);
//        System.out.println(possible);
//        System.out.println(carOne.getCurrentFuel() + "  " + carOne.getMpg());
//        System.out.println();
//
//
//        System.out.println("---- Car 2 Tests ----");
//        Car carTwo = new Car(12.0, 15.0);
//        System.out.println(carTwo.getCurrentFuel() + "  " + carTwo.getMpg());
//        possible = carTwo.canMakeTrip(300.0);
//        System.out.println(possible);
//        System.out.println(carTwo.getCurrentFuel() + "  " + carTwo.getMpg());
//        possible = carTwo.canMakeTrip(180.0);
//        System.out.println(possible);
//        System.out.println(carTwo.getCurrentFuel() + "  " + carTwo.getMpg());
//        possible = carTwo.canMakeTrip(10.0);
//        System.out.println(possible);
//        System.out.println(carTwo.getCurrentFuel() + "  " + carTwo.getMpg());
//        System.out.println();
//
//
//        System.out.println("---- Car 3 Tests ----");
//        Car carThree = new Car(32.0, 25.0);
//        System.out.println(carThree.getCurrentFuel() + "  " + carThree.getMpg());
//        possible = carThree.canMakeTrip(810);
//        System.out.println(possible);
//        System.out.println(carThree.getCurrentFuel() + "  " + carThree.getMpg());
//        possible = carThree.canMakeTrip(150.0);
//        System.out.println(possible);
//        System.out.println(carThree.getCurrentFuel() + "  " + carThree.getMpg());
//        possible = carThree.canMakeTrip(150.0);
//        System.out.println(possible);
//        System.out.println(carThree.getCurrentFuel() + "  " + carThree.getMpg());
//        possible = carThree.canMakeTrip(150.0);
//        System.out.println(possible);
//        System.out.println(carThree.getCurrentFuel() + "  " + carThree.getMpg());
//        possible = carThree.canMakeTrip(150.0);
//        System.out.println(possible);
//        System.out.println(carThree.getCurrentFuel() + "  " + carThree.getMpg());
//        possible = carThree.canMakeTrip(150.0);
//        System.out.println(possible);
//        System.out.println(carThree.getCurrentFuel() + "  " + carThree.getMpg());
//        possible = carThree.canMakeTrip(150.0);
//        System.out.println(possible);
//        System.out.println(carThree.getCurrentFuel() + "  " + carThree.getMpg());

//        double remaining;
//        System.out.println("---- TrashCan 1 Tests ----");
//        TrashCan kitchen = new TrashCan(10.0);
//        System.out.println(kitchen.getCapacity() + "  " + kitchen.getTrashAmount());
//        remaining = kitchen.acceptTrash(2.5);
//        System.out.println(remaining);
//        System.out.println(kitchen.getCapacity() + "  " + kitchen.getTrashAmount());
//        remaining = kitchen.acceptTrash(3.5);
//        System.out.println(remaining);
//        System.out.println(kitchen.getCapacity() + "  " + kitchen.getTrashAmount());
//        remaining = kitchen.acceptTrash(6.0);
//        System.out.println(remaining);
//        System.out.println(kitchen.getCapacity() + "  " + kitchen.getTrashAmount());
//        System.out.println();
//
//
//        System.out.println("---- TrashCan 2 Tests ----");
//        TrashCan bedroom = new TrashCan(3.0);
//        System.out.println(bedroom.getCapacity() + "  " + bedroom.getTrashAmount());
//        remaining = bedroom.acceptTrash(1.0);
//        System.out.println(remaining);
//        System.out.println(bedroom.getCapacity() + "  " + bedroom.getTrashAmount());
//        remaining = bedroom.acceptTrash(3.2);
//        System.out.println(remaining);
//        System.out.println(bedroom.getCapacity() + "  " + bedroom.getTrashAmount());
//        System.out.println();
//
//
//        System.out.println("---- TrashCan 3 Tests ----");
//        TrashCan livingRoom = new TrashCan(30.0);
//        System.out.println(livingRoom.getCapacity() + "  " + livingRoom.getTrashAmount());
//        remaining = livingRoom.acceptTrash(5.0);
//        System.out.println(remaining);
//        System.out.println(livingRoom.getCapacity() + "  " + livingRoom.getTrashAmount());
//        remaining = livingRoom.acceptTrash(12.5);
//        System.out.println(remaining);
//        System.out.println(livingRoom.getCapacity() + "  " + livingRoom.getTrashAmount());
//        remaining = livingRoom.acceptTrash(8.0);
//        System.out.println(remaining);
//        System.out.println(livingRoom.getCapacity() + "  " + livingRoom.getTrashAmount());
//        remaining = livingRoom.acceptTrash(4.5);
//        System.out.println(remaining);
//        System.out.println(livingRoom.getCapacity() + "  " + livingRoom.getTrashAmount());
//        remaining = livingRoom.acceptTrash(7.0);
//        System.out.println(remaining);
//        System.out.println(livingRoom.getCapacity() + "  " + livingRoom.getTrashAmount());

        String info;
        System.out.println("---- CupcakeMachine 1 tests ----");
        CupcakeMachine c1 = new CupcakeMachine(10, 1.75);
        System.out.println(c1.getAvailCupcakes() + "  " + c1.getCupcakeCost());
        info = c1.takeOrder(2);
        System.out.println(info);
        System.out.println(c1.getAvailCupcakes() + "  " + c1.getCupcakeCost());
        info = c1.takeOrder(3);
        System.out.println(info);
        System.out.println(c1.getAvailCupcakes() + "  " + c1.getCupcakeCost());
        info = c1.takeOrder(10);
        System.out.println(info);
        System.out.println(c1.getAvailCupcakes() + "  " + c1.getCupcakeCost());
        info = c1.takeOrder(1);
        System.out.println(info);
        System.out.println(c1.getAvailCupcakes() + "  " + c1.getCupcakeCost());
        System.out.println();


        System.out.println("---- CupcakeMachine 2 tests ----");
        CupcakeMachine c2 = new CupcakeMachine(10, 1.5);
        System.out.println(c2.getAvailCupcakes() + "  " + c2.getCupcakeCost());
        info = c2.takeOrder(10);
        System.out.println(info);
        System.out.println(c2.getAvailCupcakes() + "  " + c2.getCupcakeCost());
        System.out.println();


        System.out.println("---- CupcakeMachine 3 tests ----");
        CupcakeMachine c3 = new CupcakeMachine(10, 2);
        System.out.println(c3.getAvailCupcakes() + "  " + c3.getCupcakeCost());
        info = c3.takeOrder(4);
        System.out.println(info);
        System.out.println(c3.getAvailCupcakes() + "  " + c3.getCupcakeCost());
        info = c3.takeOrder(3);
        System.out.println(info);
        System.out.println(c3.getAvailCupcakes() + "  " + c3.getCupcakeCost());
        info = c3.takeOrder(5);
        System.out.println(info);
        System.out.println(c3.getAvailCupcakes() + "  " + c3.getCupcakeCost());
        info = c3.takeOrder(3);
        System.out.println(info);
        System.out.println(c3.getAvailCupcakes() + "  " + c3.getCupcakeCost());



    }
}
