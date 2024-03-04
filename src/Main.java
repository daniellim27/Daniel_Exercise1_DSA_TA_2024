public class Main {
    public static void main(String[] args) {

        Lion lion = new Lion("Initial Name", 0, 0, "Initial Species");


        lion.setName("Leo");
        lion.setAge(100000);
        lion.setWeight(300);
        lion.setSpecies("Barbary lion");


        System.out.println("Name: " + lion.getName());
        System.out.println("Age: " + lion.getAge());
        System.out.println("Weight: " + lion.getWeight() + " kg");
        System.out.println("Species: " + lion.getSpecies());


        lion.extinct();
    }
}
