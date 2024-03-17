public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet();
        Activities activities = new Activities(dog);

        activities.punish();
        dog.printStats();
        activities.play();
        dog.printStats();
        activities.rest();
        dog.printStats();
        activities.feed();
        dog.printStats();
    }
}