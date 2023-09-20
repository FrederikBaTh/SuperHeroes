import java.io.PrintStream;
import java.util.ArrayList;

class Database {
    private ArrayList<Hero> listWithHeroes;

    public Database() {
        listWithHeroes = new ArrayList<>();
        listWithHeroes.add(new Hero("Batman", "Bruce Wayne", "Is very rich", 1939, "Intelligence", "Yes"));
        listWithHeroes.add(new Hero("Superman", "Clark Kent or Kal El", "Superstrength, flight, etc.", 1933, "Beacon of Hope", "No"));
    }
    public ArrayList<Hero> searchHeroes(String query) {
        ArrayList<Hero> searchResults = new ArrayList<>();
        for (Hero hero : listWithHeroes) {
            if (hero.getName().equalsIgnoreCase(query)) {
                searchResults.add(hero);
            }
        }
        return searchResults;
    }

    public void printHeroesToStream(PrintStream stream) {
        for (Hero hero : listWithHeroes) {
            stream.println(hero.toString());
        }
    }
    public void addSuperHero(String name, String realName, String superPower, int yearCreated, String strength, String isHuman) {
        Hero superhero = new Hero(name, realName, superPower, yearCreated, strength, isHuman);
        listWithHeroes.add(superhero);
    }
    public ArrayList<Hero> getListWithHeroes() {
        return listWithHeroes;
    }

    public void printHeroes() {
        for (Hero hero : listWithHeroes) {
            System.out.println(hero);
            System.out.println();
        }

    }


}