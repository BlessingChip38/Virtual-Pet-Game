public class Activities {
    //This will hold the activities to increase and decrease attributes of Pet
    private int petHealth;
    private int petEnergy;
    private int petHappiness;

    private Pet pet;

    public Activities(Pet pet) {
        this.pet = pet;
    }

    public void feed() {
        pet.increaseHealth(1);
        pet.increaseHappiness(10);
        pet.decreaseEnergy(5);

    }

    public void rest() {
        pet.increaseEnergy(100);

    }

    public void play() {
        pet.increaseHappiness(20);
        pet.decreaseEnergy(20);

    }

    public void punish() {
        pet.decreaseHappiness(50);
    }
}
