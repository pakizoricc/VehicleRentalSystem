public class RentingMotorcycle extends Motorcycle{
    public int rental_cost;

    public RentingMotorcycle(String brand, String model, int vehicle_value, int rider_age, int rental_period, int rental_cost) {
        super(brand, model, vehicle_value, rider_age, rental_period);
        this.rental_cost = rental_cost;
    }

    public double insurance_cost = 0.02 * vehicle_value;

    public void DailyRentalCost(int rental_period){
        if(rental_period <= 7){
            rental_cost = 10;
        } else {
            rental_cost = 15;
        }
    }

    public void InsuranceCostReducing(int rider_age){
        if(rider_age < 25){
            insurance_cost += 0.2 * insurance_cost;
        }
    }
}
