package Method_Overriding.MethodOverriding;

class Restaurant {
    double tax_rate;
    String name;
    double bill;
    Restaurant(String name){
        this.name = name ;
    }
    void calculateBill(double price ){
        this.bill = price + price*0.1;

    }

    int estimateDeliveryTime() {
        return 40;
    }
    void displayInfo() {
        System.out.println(name + " estimated delivery time: " + estimateDeliveryTime() + " minutes.");
        System.out.println(name + ":bill->"+bill);
    }
}
