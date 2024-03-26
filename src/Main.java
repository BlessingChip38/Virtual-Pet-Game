import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Pet pet = new Pet();
//        Pet cat = new Pet();
        PetAttributes petAttributes = new PetAttributes(pet);
//        PetAttributes CatAttributes = new PetAttributes(cat);
        Activities petActivities = new Activities(petAttributes);
//        Activities CatActivities = new Activities(CatAttributes);
        boolean gameActive = true;
        String userChoice;
        String userName;

        //This while loop will help assign the type of pet chosen
        while (true) {

            System.out.println("Welcome, would you like a dog or a cat?");

            userChoice = scnr.next().toLowerCase();

            if (userChoice.equals("dog")) {
                pet.setType(userChoice.toUpperCase());
                System.out.println("A " + pet.getType() + "!! That is a great choice.");
                break;
            }
            else if (userChoice.equals("cat")) {
                pet.setType(userChoice.toUpperCase());
                System.out.println("A " + pet.getType() + "!! That is a puuurrrfect choice.");
                break;
            }
            System.out.println("'" + userChoice + "' was not an option. Try again.");
        }

        //This while loop helps set the name of pet
        while (true) {
            // Name must only contain Alphabetic letters
            boolean validName = true;
            System.out.println("What would you like to name your " + pet.getType() + "?");
            userName = scnr.next();
            for (int i = 0; i < userName.length(); ++i) {
                if (!Character.isAlphabetic(userName.charAt(i))) {
                    validName = false;
                    break;
                }
            }
            if (validName) {

                System.out.println("'" + userName.toUpperCase(Locale.ROOT) + "' are you sure? 'y' or 'n'");
                userChoice = scnr.next();
                if (userChoice.charAt(0) == 'y') {
                    break;
                }
            }
            else {
                System.out.println("Name must only contain Alphabetic Letters.");
            }
        }

        pet.setName(userName.toUpperCase());

        System.out.println("Here is the information about your pet:");
        pet.printStats();


        while (gameActive) {
            System.out.println("What would you like to do with " + pet.getName() + "?");
            System.out.println("Options:");
            System.out.println("   Feed");
            System.out.println("   Rest");
            System.out.println("   Play");
            System.out.println("   Punish");
            System.out.println("   Stats");
            System.out.println("   'q' to quit");

            userChoice = scnr.next().toLowerCase();

            if (userChoice.equals("feed")) {
                if (pet.getEnergy() == 0){
                    System.out.println(pet.getName() + " is to tired to Eat.");
                }
                else {
                    petActivities.feed();
                    System.out.print(pet.getName() + "'s happiness increased by 5, " +  pet.getName());
                    System.out.println("'s hunger decreased by 10." + pet.getName() + "'s energy decreased by 10.");
                }
            }

            else if (userChoice.equals("rest")) {
                petActivities.rest();
                System.out.print(pet.getName() + "'s happiness decreased by 30, " +  pet.getName());
                System.out.println("'s hunger increased by 50." + pet.getName() + "'s energy increased by 25.");
            }

            else if (userChoice.equals("play")) {
                if (pet.getEnergy() == 0) {
                    System.out.println(" is to tired to Eat.");
                }
                else {
                    petActivities.play();
                    System.out.print(pet.getName() + "'s happiness increased by 50, " +  pet.getName());
                    System.out.println("'s hunger increased by 15." + pet.getName() + "'s energy decreased by 25.");
                }
            }

            else if (userChoice.equals("punish")) {
                petActivities.punish();
                System.out.println(pet.getName() + " looks up at you will hurtful eyes. There happiness decreases 100");
            }

            else if (userChoice.equals("stats")) {
                pet.printStats();
            }

            else if (userChoice.equals("q")) {
                gameActive = false;
            }

            else {
                System.out.println("Invalid Option");
            }


        }
    }
}