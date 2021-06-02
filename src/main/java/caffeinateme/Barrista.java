package caffeinateme;

import java.util.ArrayList;
import java.util.List;

public class Barrista {

    private List<String> orderList = new ArrayList<String>();

    public List<String> getPendingOrders() {
        this.orderList.add("large cappuccino");
        return this.orderList;
    }

    public List<String> getUrgentOrders() {
        return this.orderList;
    }
}
