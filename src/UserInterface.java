import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        UserInterface main = new UserInterface();
        main.startProgram();
    }

    Scanner keyboard = new Scanner(System.in);
    Database database = new Database();

    public void startProgram() {
        printStartMessage();
        createSuperheroes();
        printSuperheroes();
        editHeroInformation();
        exitProgram();
    }

    public void printStartMessage() {

        System.out.println("Welcome to the Superhero registry:");
        System.out.println("\u2550".repeat(45));
        System.out.println("If you want to create your own superhero, then please enter:");
        System.out.println("1.");
        System.out.println("Or if you want to all of the Heroes form other places, please press:");
        System.out.println("2.");
        System.out.println("You can also search for a specific Hero if you want if you press:");
        System.out.println("3.");
        System.out.println("If you would like to edit some of the information of our or you own superheroes please enter:");
        System.out.println("4.");
        System.out.println("Or if you want to exit the program, then please enter:");
        System.out.println("5.");

        int valg = 0;
        do {
            valg = keyboard.nextInt();

            if (valg == 1) {
                createSuperheroes();
            } else if (valg == 2) {
                printSuperheroes();
            } else if (valg == 3) {
                searchForHeroes();
            } else if (valg == 4) {
                editHeroInformation();
            } else if (valg == 5) {
                exitProgram();
            }

        }
        while (valg != 5);
    }



    public void createSuperheroes() {
            try {
                System.out.println("Type in the Hero's name:");
                String name = keyboard.next();
                keyboard.nextLine();
                System.out.println("Type in the Hero's secret identity:");
                String realName = keyboard.next();
                System.out.println("What is the Hero's superpower(s)?");
                String superPower = keyboard.next();
                System.out.println("Type in the year the Hero started:");
                int yearCreated = keyboard.nextInt();
                keyboard.nextLine();
                System.out.println("Is the Hero a human? (Yes/No)");
                String isHuman = keyboard.next();
                System.out.println("What is the Hero's strength(s)?");
                String strength = keyboard.next();

                database.addSuperHero(name, realName, superPower, yearCreated, isHuman, strength);


            } catch (InputMismatchException c) {
                System.out.println("Invalid input. Please enter a number.");
                keyboard.nextLine();
                createSuperheroes();
            }

        }
        public void printSuperheroes () {
            database.printHeroes();

        }

        public void searchForHeroes () {

            System.out.println("Enter the hero's name to search:");
            String searchQuery = keyboard.next();

            ArrayList<Hero> searchResults = database.searchHeroes(searchQuery);

            if (searchResults.isEmpty()) {
                System.out.println("No heroes found matching the search query.");
            } else {
                System.out.println("Search results:");
                for (Hero result : searchResults) {
                    System.out.println(result);
                }
            }

        }

        public void editHeroInformation () {
            System.out.println("Enter the hero's name to search:");
            String searchQuery = keyboard.next();

            ArrayList<Hero> searchResults = database.searchHeroes(searchQuery);

            if (searchResults.isEmpty()) {
                System.out.println("No heroes found matching the search query.");
            } else {
                System.out.println("Search results:");
                for (int i = 0; i < searchResults.size(); i++) {
                    Hero result = searchResults.get(i);
                    System.out.println((i + 1) + ". " + result.getName());
                }

                System.out.print("Select the hero to edit (enter the number): ");
                int choice = keyboard.nextInt();

                if (choice >= 1 && choice <= searchResults.size()) {
                    Hero heroToEdit = searchResults.get(choice - 1);
                    System.out.println("Editing hero: " + heroToEdit.getName());

                    System.out.print("Enter new name: ");
                    String newName = keyboard.next();
                    heroToEdit.setName(newName);

                    System.out.println("Hero information updated successfully.");
                } else {
                    System.out.println("Invalid choice.");
                }
            }
        }


        public void exitProgram () {
            System.out.println("Exiting program.");
            System.exit(0);
        }
    }




