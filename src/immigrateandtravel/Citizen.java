package immigrateandtravel;

public class Citizen extends Person {
    String currentRegion;
    String nationality;

    public Citizen(String name, int age, int money, String currentRegion, String nationality) {
        super(name, age, money);
        this.currentRegion = currentRegion;
        this.nationality = nationality;
    }
}
