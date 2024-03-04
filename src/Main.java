public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Leo", 100000, 300, "Barbary lion" );
        System.out.println("Name: " + lion.getName());
        System.out.println("Age: " + lion.getAge());
        System.out.println("Weight: " + lion.getWeight() + " kg");
        System.out.println("Species: " + lion.getSpecies());
        lion.extinct();
    }
}