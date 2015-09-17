public class LawOfDemeterInJava {

    private Topping cheeseTopping;

    public void goodExamples(final Pizza pizza) {
        final Foo foo = new Foo();
        doSomething();
        final int price = pizza.getPrice();
        cheeseTopping = new CheeseTopping();
        final float weight = cheeseTopping.getWeightUsed();
        foo.doBar();
    }

    private void doSomething() {
    }
}
