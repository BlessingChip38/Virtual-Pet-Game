public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet();
        Pet cat = new Pet();
        PetAttributes DogAttributes = new PetAttributes(dog);
        PetAttributes CatAttributes = new PetAttributes(cat);
        Activities DogActivities = new Activities(DogAttributes);
        Activities CatActivities = new Activities(CatAttributes);

        dog.setName("Bingo");
        cat.setName("Britton");
        DogActivities.punish();
        dog.printStats();
        cat.printStats();
        DogActivities.play();
        dog.printStats();
        DogActivities.rest();
        dog.printStats();
        DogActivities.feed();
        dog.printStats();
    }
}