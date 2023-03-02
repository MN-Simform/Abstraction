public class SportCar extends Vehicle implements Car{
    SportCar(){
        System.out.println("SportCar Called");
    }
    @Override
    public void race() {
        System.out.println("Accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Braked");
    }

    @Override
    public void engine() {
        System.out.println("1500CC");
    }
}
