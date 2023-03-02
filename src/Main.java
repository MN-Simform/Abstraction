public class Main {
    public static void main(String[] args) {
        SportCar car = new SportCar();
        car.race();
        car.brake();
        car.engine();
        car.setNumberOfTyre(4);
        System.out.println("It has " + car.getNumberOfTyre() + " tyres");
    }
}