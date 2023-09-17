public class Hero {
    private String name;
    private String realName;
    private String superPower;
    private int yearCreated;
    private String isHuman;
    private String strength;


    public Hero(String name, String realName, String superPower, int yearCreated, String strength, String isHuman) {
        this.name = name;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    public String toString() {
        return ("Name: " + name + "\nReal Name: " + realName + "\nSuperpower: " + superPower + "\nCreated in the year: " + yearCreated + "\nTheir Strength: " + strength + "\nAre they Human: " + isHuman);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

