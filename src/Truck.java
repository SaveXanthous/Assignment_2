public class Truck extends Vehicle{
    private double capacity;
    private int numAxels;

    public Truck(String brand, Driver driver, int year,double capacity, int numAxels){
        super(brand, driver, year);
        this.capacity = capacity;
        this.numAxels = numAxels;
    }

    @Override
    public void startEngine(){
        System.out.println("brand: " + brand + " Truck start engine");
    }
    @Override
    public void stopEngine() {
        System.out.println("brand: " + brand + " Truck stop engine");
    }
}
