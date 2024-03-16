public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet();
        Pet cat = new Pet("Hailee");


        dog.decreaseHappiness(10);

        System.out.println(dog.getHappiness());

        System.out.println(dog.getName());

        cat.decreaseHappiness(110);

        System.out.println(cat.getHappiness());

        System.out.println(cat.getName());

        dog.increaseHappiness(1);

        System.out.println(dog.getHappiness());
    }
}