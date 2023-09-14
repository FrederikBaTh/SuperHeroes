public class Database {

    private Hero[] listWithHeroes;
    public String navn;

    public Database() {
        this.navn = navn;
        listWithHeroes = new Hero[2];

        listWithHeroes[0] = new Hero("Batman", "Bruce Wayne", "Is very rich", 1939, "Intelligence", "Yes");
        listWithHeroes[1] = new Hero[]("Superman", "Clark Kent or Kal El", "Superstrength flight, etc.", 1933, "Beacon of Hope", "No");
    }
    public Hero[] getListWithHeroes() {
        return listWithHeroes;
    }

    public void addSuperHero(String name, String realName, String superPower, int yearCreated, String strength, String isHuman) {
        Hero superhero = new Hero(name, realName, superPower, yearCreated, strength, isHuman);
        superHero[currentIndex] = superhero;
        currentIndex++;
    }

    private Hero[] superHero = new Hero[100];
    private int currentIndex = 0;

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


