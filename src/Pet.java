public class Pet {
    private String name = "No Name";
    private int health = 10;
    private int happiness = 100;
    private int energy = 100;

//    public Pet() {
//        this.name = "No Name";
//        this.health = 10;
//        this.happiness = 100;
//        this.energy = 100;
//    }

//    public Pet(String name) {
//        this.name = name;
//        this.health = 10;
//        this.happiness = 100;
//        this.energy = 100;
//    }

    /**
     * This method will increase the happiness of the pet by amount inputted.
     * @param amount Int that increased happiness.
     */
    public void increaseHappiness(int amount) {
        //this will make sure happiness doesn't go ove 100
        happiness = Math.min(amount + happiness, 100);
    }

    /**
     * This method will decrease the happiness of the pet by given amount. Max happiness 100, Min happiness 0
     * @param amount Int that decreases happiness.
     */
    public void decreaseHappiness(int amount) {
        //this will make sure happiness doesn't go below 0
        happiness = Math.max(happiness - amount, 0);
    }

    /**
     * This method will increase the health of the pet by amount inputted. Max health is 10 Min health is 0
     * @param amount Int that increases health
     */
    public void increaseHealth(int amount) {
        //this will make sure health doesn't go ove 10
        health = Math.min(amount + health, 10);
    }

    /**
     * This method will decrease the health of the pet by amount inputted. Max health is 10 Min health is 0
     * @param amount Int that decreases health
     */
    public void decreaseHealth(int amount) {
        //this will make sure happiness doesn't go below 0
       health = Math.max(health - amount, 0);
    }



    public void increaseEnergy(int amount) {
        energy = Math.min(amount + energy, 100);
    }

    public void decreaseEnergy(int amount) {
        energy = Math.max(energy - amount, 0);
    }

    /**
     * This will change the pets name. Must only contain letters
     * @param name String for given pet name
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getHappiness() {
        return happiness;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getEnergy() {
        return energy;
    }

    public void printStats(){
        System.out.println("Name: " + name);
        System.out.println("Happiness: " + happiness);
        System.out.println("Energy: " + energy);
        System.out.println("Health: " + health);

    }
}
