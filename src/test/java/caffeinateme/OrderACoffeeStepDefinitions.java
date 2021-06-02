package caffeinateme;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;


public class OrderACoffeeStepDefinitions {

    Customer cathy = new Customer();
    Barrista barry = new Barrista();
    String CathysOrder;


    @Given("Cathy is {int} meters from the coffee shop")
    public void cathy_is_meters_from_the_coffee_shop(int distanceInMeters) {
        cathy.setDistanceFromShop(distanceInMeters);
    }

    @When("Cathy orders a {string}")
    public void cathy_orders_a(String order) {
        cathy.placeOrderFor(order);
        CathysOrder = order;
    }

    @Then("Barry should receive the order")
    public void barry_should_receive_the_order() {
        assertThat(barry.getPendingOrders(), hasItem(CathysOrder));
    }

    @Then("Barry should know that the coffee is Urgent")
    public void barry_should_know_that_the_coffee_is_urgent() {
        assertThat(barry.getUrgentOrders(), hasItem(CathysOrder));
    }

}
