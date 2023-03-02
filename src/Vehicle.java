abstract class Vehicle {
    private int numberOfTyre;
    abstract public void engine();
    public void setNumberOfTyre(int numberOfTyre) {
        this.numberOfTyre = numberOfTyre;
    }
    public int getNumberOfTyre() {
        return numberOfTyre;
    }
}
