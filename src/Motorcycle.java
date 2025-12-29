public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, Driver driver, int year, boolean hasSidecar){
        super(brand, driver, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine(){
        System.out.println("brand: " + brand + " Motorcycle start engine");
    }
    @Override
    public void stopEngine(){
        System.out.println("brand: " + brand + " Motorcycle stop engine");
    }
}
