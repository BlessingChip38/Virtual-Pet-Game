import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Pet pet = new Pet();
//        Pet cat = new Pet();
//        PetAttributes DogAttributes = new PetAttributes(dog);
//        PetAttributes CatAttributes = new PetAttributes(cat);
//        Activities DogActivities = new Activities(DogAttributes);
//        Activities CatActivities = new Activities(CatAttributes);
        boolean gameActive = true;
        String userChoice;
        String userName;

        while (true) {

            System.out.println("Welcome, would you like a dog or a cat?");

            userChoice = scnr.next();

            if (userChoice.equals("dog") || userChoice.equals("cat")) {
                pet.setType(userChoice);
                System.out.println("A " + pet.getType() + "!! That is a great choice.");
                break;
            }
            System.out.println("'" + userChoice + "' was not an option. Try again.");
        }
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
            break;
        }
    }
}