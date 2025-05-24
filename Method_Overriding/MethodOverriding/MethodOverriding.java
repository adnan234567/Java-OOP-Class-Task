package Method_Overriding.MethodOverriding;

public class MethodOverriding {
    public static void main(String[] args) {
        Restaurant genericRestaurant = new Restaurant("Normal");
        FastFoodRestaurant fastFood = new FastFoodRestaurant("Fast Food");
        FineDiningRestaurant fineDining = new FineDiningRestaurant("Luxery Resturent");
        genericRestaurant.calculateBill(100.0);
        fastFood.calculateBill(500.0);
        fineDining.calculateBill(300.0);
        genericRestaurant.displayInfo();
        fastFood.displayInfo();
        fineDining.displayInfo();
    }
}