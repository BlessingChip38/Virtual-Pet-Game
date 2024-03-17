public class Pet {
    private String name;
    private int health;
    private int happiness;
    private int energy;
    private int hunger;

    public Pet() {
        name = "No Name";
        health = 10;
        happiness = 100;
        energy = 100;
        hunger = 100;
    }
    /**
     * This will change the pets name. Must only contain letters
     * @param name String for given pet name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getEnergy() {
        return energy;
    }
    public int getHunger() {
        return hunger;
    }

    public void printStats(){
        System.out.println("Name: " + name);
        System.out.println("Happiness: " + happiness);
        System.out.println("Energy: " + energy);
        System.out.println("Health: " + health);
        System.out.println("-------------------");
    }
}
