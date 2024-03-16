public class Pet {
    private String name;
    private int health;
    private int happiness;

    public Pet() {
        this.name = "No Name";
        this.health = 100;
        this.happiness = 100;
    }

    public Pet(String name) {
        this.name = name;
        this.health = 100;
        this.happiness = 100;
    }

    /**
     * This method will increase the happiness of the pet by amount inputted.
     * @param amount is the amount of increased happiness.
     */
    public void increaseHappiness(int amount) {
        //this will make sure happiness doesn't go ove 100
        this.happiness = Math.min(amount + this.happiness, 100);
    }

    /**
     * This method will decrease the happiness of the pet by amoint inputted
     * @param amount
     */
    public void decreaseHappiness(int amount) {
        //this will make sure happiness doesn't go below 0
        this.happiness = Math.max(this.happiness - amount, 0);
    }

    /**
     * This will change the pets name
     * @param name
     */
    public void changeName(String name) {
        this.name = name;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public String getName() {
        return this.name;
    }

}
