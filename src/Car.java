public class Car extends Vehicle{
    private int doors;
    private String fuelType;

    public Car(String brand, Driver driver, int year, int doors, String fuelType){
        super(brand, driver, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine(){
        System.out.println("brand: " + brand + " Car start engine");
    }
    @Override
    public void stopEngine(){
        System.out.println("brand: " + brand + " Car stop engine");
    }
}
