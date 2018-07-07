public class PepperoniPizzaBuilder extends PizzaBuilder {

    public void BuildDough() {
        pizza.setDough("Thin Large");
    }

    public void BuildSauce() {
        pizza.setSauce("Spicy Tomato");
    }

    public void BuildTopping() {
        pizza.setTopping("Pepperoni sausage");
    }
}
