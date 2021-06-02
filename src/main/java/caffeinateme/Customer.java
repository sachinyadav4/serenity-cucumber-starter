package caffeinateme;

public class Customer {

    private int distanceFromShop;
    private String order;

    public void setDistanceFromShop(int distanceFromShop) {
        this.distanceFromShop = distanceFromShop;
    }

    public void placeOrderFor(String order) {
        this.order = order;
    }
}
