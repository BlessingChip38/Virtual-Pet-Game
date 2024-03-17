public class Activities {
    //This will hold the activities to increase and decrease attributes of Pet
    private PetAttributes petAttributes;

    public Activities(PetAttributes petAttributes) {
        this.petAttributes = petAttributes;
    }

    public void feed() {
        petAttributes.increaseHappiness(10);
        petAttributes.decreaseEnergy(10);

    }

    public void rest() {
        petAttributes.increaseEnergy(25);
        petAttributes.decreaseHappiness(10);

    }

    public void play() {
        petAttributes.increaseHappiness(50);
        petAttributes.decreaseEnergy(50);

    }

    public void punish() {
        petAttributes.decreaseHappiness(100);

    }
}
