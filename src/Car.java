public class Car {
    public String brand;
    public String model;
    public int vehicle_value;
    public int rating;
    public int rental_period;

    public Car(String brand, String model, int vehicle_value, int rating,
               int rental_period){
        this.brand = brand;
        this.model = model;
        this.vehicle_value = vehicle_value;
        this.rating = rating;
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
        return rating;
    }

    public int getRental_period() {
        return rental_period;
    }
}
