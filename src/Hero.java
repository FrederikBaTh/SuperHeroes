public class Hero {
    private String name;
    private String realName;
    private String superPower;
    private int yearCreated;
    private String isHuman;
    private String strength;

    public Hero(String name, String realName, String superPower, int yearCreated, String isHuman, String strength){
        this.name = name;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;

    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public String getIsHuman() {
        return isHuman;
    }

    public String getStrength() {
        return strength;
    }
}

