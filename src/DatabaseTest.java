import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseTest {
    @Test
    public void testAddSuperHero() {
        Database database = new Database();

        database.addSuperHero("Batman", "Bruce Wayne", "Is very rich", 1939, "Intelligence", "Yes");

        ArrayList<Hero> superheroes = database.getListWithHeroes();

        boolean heroFound = false;
        for (Hero hero : superheroes) {
            if (hero.getName().equals("TestHero")) {
                heroFound = true;
                break;
            }
        }

        assertTrue(heroFound, "The new superhero should be added to the database.");
    }

    @BeforeEach
    @Test
    public void testSearchHeroes() {
        Database database = new Database();

        database.addSuperHero("Batman", "Bruce Wayne", "Is very rich", 1939, "Intelligence", "Yes");
        database.addSuperHero("Superman", "Clark Kent or Kal El", "Superstrength, flight, etc.", 1933, "Beacon of Hope", "No");

        ArrayList<Hero> searchResults = database.searchHeroes("Batman");

        boolean heroFound = false;
        for (Hero hero : searchResults) {
            if (hero.getName().equalsIgnoreCase("Batman")) {
                heroFound = true;
                break;
            }
        }
        assertTrue(heroFound, "The searched hero 'Batman' should be found in the search results.");
    }
}

