public class Database {

    private Hero[] superHero = new Hero[100];
    private int currentIndex = 0;

    public void addSuperHero(String name, String realName, String superPower, int yearCreated, String strength, String isHuman) {
        Hero superhero = new Hero(name, realName, superPower, yearCreated, strength, isHuman);
        superHero[currentIndex] = superhero;
        currentIndex++;
    }

    public void printHero() {
        for (Hero susHero : superHero) {
            if (susHero != null) {
                System.out.println(susHero);
                System.out.println();
                System.out.println(superHero);
                System.out.println();
            }
        }

    }
}