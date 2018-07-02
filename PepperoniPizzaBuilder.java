public class PepperoniPizzaBuilder extends PizzaBuilder {

    void BuildDough() {
        pizza.setDough("Thin Large");
    }

    void BuildSauce() {
        pizza.setSauce("Spicy Tomato");
    }

    void BuildTopping() {
        pizza.setTopping("Pepperoni");
    }
}
