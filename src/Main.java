void main(){
    Driver driver_1 = new Driver("Anton","123");
    Driver driver_2 = new Driver("Tanya","421");


    Car car = new Car("Toyota",driver_1,1999,4,"95");
    Motorcycle motorcycle = new Motorcycle("Kawasaki",driver_1,2003,false);
    Truck truck = new Truck("Volvo",driver_2,2010,1000,32);

    Vehicle[] vehicles = {car,motorcycle,truck};

    for(Vehicle vehicle: vehicles){
        vehicle.startEngine();
        vehicle.displayInfo();
        vehicle.stopEngine();

        System.out.println("***********************************************************");
    }
}