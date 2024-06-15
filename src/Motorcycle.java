public class Motorcycle {
    public String brand;
    public String model;
    public int vehicle_value;
    public int rider_age;
    public int rental_period;

    public Motorcycle(String brand, String model, int vehicle_value, int rider_age,
               int rental_period){
        this.brand = brand;
        this.model = model;
        this.vehicle_value = vehicle_value;
        this.rider_age = rider_age;
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

    public int getRating() {
        return rider_age;
    }

    public int getRental_period() {
        return rental_period;
    }
}
