package Method_Overriding.MethodOverriding;

class FastFoodRestaurant extends Restaurant {
    FastFoodRestaurant(String name){
        super(name);
    }
    void calculateBill(double price ){
        this.bill = price + price*0.15;

    }
    @Override
    int estimateDeliveryTime() {
        return 20;
    }
}