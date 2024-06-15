public class CargoVan {
    public String brand;
    public String model;
    public int vehicle_value;
    public String driver_experience;
    public int rental_period;

    public CargoVan(String brand, String model, int vehicle_value, String driver_experience,
                      int rental_period){
        this.brand = brand;
        this.model = model;
        this.vehicle_value = vehicle_value;
        this.driver_experience = driver_experience;
        this.rental_period = rental_period;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getVehicle_value() {
        return vehicle_value;
    }

    public String getDriver_experience() {
        return driver_experience;
    }

    public int getRental_period() {
        return rental_period;
    }
}
