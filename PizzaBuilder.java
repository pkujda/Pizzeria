abstract public class PizzaBuilder {

    protected Pizza pizza;

    public PizzaBuilder(){
        pizza = new Pizza();
    }

    abstract void BuildDough();
    abstract void BuildSauce();
    abstract void BuildTopping();

}
