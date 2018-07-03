 public abstract class PizzaBuilder {

    protected Pizza pizza;

    public PizzaBuilder(){
        pizza = new Pizza();
    }

    public Pizza getPizza() {
        return pizza;
    }

    abstract void BuildDough();
    abstract void BuildSauce();
    abstract void BuildTopping();

}
