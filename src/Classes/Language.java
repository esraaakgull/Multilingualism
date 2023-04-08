package Classes;

public class Language {
    private String name;
    private Integer i = 0;
    private Unit[] units;

    public Language(String name) {
        this.name = name;
    }

    public Unit[] getUnits() {
        return units;
    }

    public void addUnit(Unit unit) {
        this.units[i] = unit;
        i++;
    }

    public String getName() {
        return this.name;
    }

}
