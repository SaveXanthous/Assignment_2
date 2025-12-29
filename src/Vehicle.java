abstract class Vehicle {
    protected String brand;
    protected Driver driver;
    protected int year;

    public Vehicle(String brand, Driver driver, int year) {
        this.brand = brand;
        this.driver = driver;
        this.year = year;
    }

    abstract void startEngine();
    abstract void stopEngine();

    public void displayInfo(){
        System.out.println("brand: " + brand + "\nyear: " + year);
        this.driver.displayDriverInfo();
    }
}
