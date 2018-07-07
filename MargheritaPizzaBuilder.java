public class MargheritaPizzaBuilder extends PizzaBuilder{

    public void BuildDough() {
        pizza.setDough("Thin");
    }

    public void BuildSauce() {
        pizza.setSauce("Tomato");
    }

    public void BuildTopping() {
        pizza.setTopping("Cheese");
    }
}
