import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Database database = new Database();

        System.out.println("Welcome to the Superhero registry:");
        System.out.println("\u2550".repeat(45));
        System.out.println("If you want to create your own superhero, then please enter:");
        System.out.println("1.");
        System.out.println("Or if you want to all of the Heroes form other places, please press:");
        System.out.println("2.");
        System.out.println("You can also search for a specific Hero if you want if you press:");
        System.out.println("3.");
        System.out.println("Or if you want to exit the program, then please enter:");
        System.out.println("4.");

        while (true) {
            int valg = keyboard.nextInt();
            if (valg == 1) {
                System.out.println("Type in the Hero's name:");
                String name = keyboard.next();
                keyboard.nextLine();
                System.out.println("Type in the Hero's secret identity:");
                String realName = keyboard.next();
                System.out.println("What is the Hero's superpower(s)?");
                String superPower = keyboard.next();
                System.out.println("Type in the year the Hero started:");
                int yearCreated = keyboard.nextInt();
                System.out.println("Is the Hero a human?");
                String isHuman = keyboard.next();
                System.out.println("What is the Hero's strength(s)?");
                String strength = keyboard.next();


                database.addSuperHero(name, realName, superPower, yearCreated, isHuman, strength);
            } else if (valg == 2) {
                database.printHeroes();
            }
            if (valg == 3) {
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

            else if (valg == 4) {
                break;
            }
        }

    }
}

