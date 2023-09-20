import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.engine.discovery.ClassSelector;

import java.io.PrintStream;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;



public class DatabaseTest {

    private Database database;

    @BeforeEach
    void setUp() {
        // Initialize a new Database instance or perform any common setup
        database = new Database();

        // Add common test data to the database if needed
        database.addSuperHero("Batman", "Bruce Wayne", "Is very rich", 1939, "Intelligence", "Yes");
        database.addSuperHero("Superman", "Clark Kent or Kal El", "Superstrength, flight, etc.", 1933, "Beacon of Hope", "No");
    }
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

    @Test
    public void testPrintHeroes() {
        database.printHeroes();

        PrintStream originalOut;
        originalOut = null;
        System.setOut(originalOut);

        ClassSelector outputStream = null;
        String printedText = outputStream.toString();

        assertTrue(printedText.contains("Name: Batman"));
        assertTrue(printedText.contains("Name: Superman"));
    }
    public void testDeleteSuperHero() {

        Database database = new Database();
        database.addSuperHero("Batman", "Bruce Wayne", "Is very rich", 1939, "Intelligence", "Yes");
        database.addSuperHero("Superman", "Clark Kent or Kal El", "Superstrength, flight, etc.", 1933, "Beacon of Hope", "No");
        database.deleteSuperHero("Batman");
        ArrayList<Hero> superheroes = database.getListWithHeroes();

        boolean heroFound = false;
        for (Hero hero : superheroes) {
            if (hero.getName().equalsIgnoreCase("Batman")) {
                heroFound = true;
                break;
            }
        }

        assertFalse(heroFound, "The superhero 'Batman' should be deleted from the database.");
    }
}

