import java.util.Arrays;

public class Main {


    private Database SuperHeroes = new Database("Banankage");

    public void start() {
        printStartMessage();
        printHeroes();

    }
    public void printStartMessage() {
        System.out.println("A list of the Justice League members:");
    }

    public void printHeroes(){
        // System.out.println(Arrays.toString(SuperHeroes.getSuperHero()));
        Hero[] helte = SuperHeroes.getSuperHero();
        for (Hero heltene: helte) {
            System.out.println("\n" + heltene.getName() + "\n" + heltene.getRealName() + "\n" + heltene.getSuperPower() + "\n" + heltene.getYearCreated() + "\n" + heltene.getStrength() + "\n" + heltene.getIsHuman());
        }
        System.out.println();
    }



    public static void main(String[] args){





    }
}
