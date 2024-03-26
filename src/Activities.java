public class Activities {
    //This will hold the activities to increase and decrease attributes of Pet
    private PetAttributes petAttributes;

    public Activities(PetAttributes petAttributes) {
        this.petAttributes = petAttributes;
    }

    public void feed() {
        petAttributes.increaseHappiness(10);
        petAttributes.decreaseHunger(50);
        petAttributes.decreaseEnergy(10);

    }

    public void rest() {
        petAttributes.increaseEnergy(50);
        petAttributes.decreaseHappiness(30);
        petAttributes.increaseHunger(25);

    }

    public void play() {
        petAttributes.increaseHappiness(50);
        petAttributes.decreaseEnergy(25);
        petAttributes.increaseHunger(15);

    }

    public void punish() {
        petAttributes.decreaseHappiness(100);

    }
}
