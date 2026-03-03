public class TrashCan {

    private double capacity;
    private double trash;

    public TrashCan(double capacity) {
        this.capacity = capacity;
        trash = 0;
    }

    public double acceptTrash(double trash) {
        this.trash += trash;
        while (this.trash >= capacity) {
            this.trash -= capacity;
        }

        return capacity - this.trash;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getTrashAmount() {
        return trash;
    }
}
