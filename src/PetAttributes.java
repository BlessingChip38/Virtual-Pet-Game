public class PetAttributes {
    private Pet pet;

    public PetAttributes(Pet pet) {
        this.pet = pet;
    }

    /**
     * This method will increase the health of the pet by amount inputted. Max health is 10, Min health is 0
     * @param amount Int that increases health
     */
    public void increaseHealth(int amount) {
        //this will make sure health doesn't go over 10
        this.pet.setHealth(Math.min(amount + this.pet.getHealth(), 10));
    }

    /**
     * This method will decrease the health of the pet by amount inputted. Max health is 10, Min health is 0
     * @param amount Int that decreases health
     */
    public void decreaseHealth(int amount) {
        //this will make sure happiness doesn't go below 0
        this.pet.setHealth(Math.max(this.pet.getHealth() - amount, 0));
    }

    /**
     * This method will increase the happiness of the pet by amount inputted. Max Happiness is 100, Min Happiness is 0
     * @param amount Int that increased happiness.
     */
    public void increaseHappiness(int amount) {
        //this will make sure happiness doesn't go over 100
        this.pet.setHappiness(Math.min(amount + this.pet.getHappiness(), 100));
    }

    /**
     * This method will decrease the happiness of the pet by given amount. Max happiness 100, Min happiness 0
     * @param amount Int that decreases happiness.
     */
    public void decreaseHappiness(int amount) {
        //this will make sure happiness doesn't go below 0
        this.pet.setHappiness(Math.max(this.pet.getHappiness() - amount, 0));
    }

    /**
     * This method will increase the energy of the pet by amount inputted. Max energy is 100, Min energy is 0
     * @param amount Int that increases energy
     */
    public void increaseEnergy(int amount) {
        // This will make sure Energy can't be over 100.
        this.pet.setEnergy(Math.min(amount + this.pet.getEnergy(), 100));
    }

    /**
     * This method will decrease the energy of the pet by amount inputted. Max energy is 100, Min energy is 0
     * @param amount Int that decreases energy
     */
    public void decreaseEnergy(int amount) {
        // this will make sure Energy doesn't go below 0
        this.pet.setEnergy(Math.max(this.pet.getEnergy() - amount, 0));
    }

    /**
     * This method will increase the hunger of the pet by amount inputted. Max hunger is 100, Min hunger is 0
     * @param amount Int that increases hunger
     */
    public void increaseHunger(int amount) {
        //this will make sure hunger doesn't go over 100
        this.pet.setHunger(Math.min(this.pet.getHunger() + amount, 100));
    }

    /**
     * This method will decrease the hunger of the pet by amount inputted. Max Hunger is 100, Min hunger is 0
     * @param amount Int that decreases hunger
     */
    public void decreaseHunger(int amount) {
        //this will make sure hunger doesn't go below 0
        this.pet.setHunger(Math.max(this.pet.getHunger() - amount, 0));
    }

}
