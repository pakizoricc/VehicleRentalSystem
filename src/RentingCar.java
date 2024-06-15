public class RentingCar extends Car{

    public int rental_cost;

    public RentingCar(String brand, String model, int vehicle_value, int rating, int rental_period, int rental_cost) {
        super(brand, model, vehicle_value, rating, rental_period);
        this.rental_cost = rental_cost;
    }

    public double insurance_cost = 0.01 * vehicle_value;

    public void DailyRentalCost(int rental_period){
        if(rental_period <= 7){
            rental_cost = 20;
        } else {
            rental_cost = 15;
        }
    }

    public void InsuranceCostReducing(int rating){
        if(rating == 4 || rating == 5){
            insurance_cost -= 0.1 * insurance_cost;
        }
    }
}
