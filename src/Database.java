public class Database {

    private Hero[] superHero;
    private String navn;

    public Database(String navn) {
        this.navn = navn;
        superHero = new Hero[7];

        superHero[0] = new Hero("Batman", "Bruce Wayne", "Is Rich", 1939, "Superior Intelligence", "Yes");
        superHero[1] = new Hero("The Flash", "Barry Allen", "The Speed Force", 1940, "Quippy humor", "Yes");
        superHero[2] = new Hero("Superman", "Clark Kent (Kal el)", "Flight, Strength, Durability, etc.", 1933, "The embodiment of hope", "No");
        superHero[3] = new Hero("Wonder Woman", "Diana of Themiscyra", "Flight, Strength, durbality, etc.", 1941, "Feminine Power", "Yes");
        superHero[4] = new Hero("Green Lantern", "Hal Jordan", "Ring of willpower that can create constructs", 1959, "Having the willpower to push through anything", "Yes");
        superHero[5] = new Hero("Martian Manhunter", "J'onn J'onzz", "Strength, Shapeshifting, Telepathy, etc.", 1955, "Overcoming biases", "No");
        superHero[6] = new Hero("Green Arrow", "Oliver Queen", "Master of Archery, and also very rich", 1941, "Being relevant amongst powerful beings", "Yes");
    }

    public Hero[] getSuperHero() {
        return superHero;
    }
}
