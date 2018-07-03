public class Waiter {

   private PizzaBuilder builder;

    public void setPizzaBuilderPizza(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza getPizza() {
        builder.BuildDough();
        builder.BuildSauce();
        builder.BuildTopping();
        return builder.getPizza();

    }

}
