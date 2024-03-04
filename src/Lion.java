public class Lion extends Animal {
    public Lion(String name, int age, int weight, String species) {
        super(name, age, weight, species);
    }

    @Override
    public void extinct() {
        System.out.println("This species has gone extinct due to overhunting, habitat destruction, and a fatal respiratory ailment.");
    }
}
