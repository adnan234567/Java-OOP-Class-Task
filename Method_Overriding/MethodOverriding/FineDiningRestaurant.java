package Method_Overriding.MethodOverriding;

class FineDiningRestaurant extends Restaurant {
    FineDiningRestaurant(String name){
        super(name);
    }
    @Override
    int estimateDeliveryTime() {
        return 60;
    }
}