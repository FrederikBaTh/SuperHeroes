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
        System.out.println("Or if you want to exit the program, then please enter:");
        System.out.println("3.");

        while (true) {
            int valg = keyboard.nextInt();
            if (valg == 1) {


                System.out.println("Type in the Heros name:");
                String name = keyboard.next();
                keyboard.nextLine();
                System.out.println("Type in the Heros secret identity:");
                String realName = keyboard.next();
                System.out.println("What is the Heros superpower(s)?");
                String superPower = keyboard.next();
                System.out.println("Type in the year the Hero started:");
                int yearCreated = keyboard.nextInt();
                System.out.println("Is the Hero a human?");
                String isHuman = keyboard.next();
                System.out.println("What is the Heros strength(s)?");
                String strength = keyboard.next();

                database.addSuperHero(name, realName, superPower, yearCreated, isHuman, strength);

            } else if (valg == 2) {
                System.out.println("You have chosen to see hear about some of the other Heroes");
            System.out.println();

                }
                if (valg == 3) {
                    break;

                }
                System.out.println("Hero is added to the Database");
                database.printHero();
                System.out.print("    ");
                System.out.println("If you would like to make another Hero, then please press");
                System.out.println("1.");
            }


        }
    }
