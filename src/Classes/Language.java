package Classes;

import Classes.Leagues.*;

import java.util.ArrayList;

public class Language {
    private String langName;
    private ArrayList<Unit> units;
    private ArrayList<User> users = new ArrayList<User>();
    private Bronze bronze = new Bronze();
    private Silver silver = new Silver();
    private Gold gold = new Gold();
    private Sapphire sapphire = new Sapphire();
    private Ruby ruby = new Ruby();


    public Language(String name) {
        this.langName = name;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public void addUnit(Unit unit) {
        this.units.add(unit);
    }

    public void addUser(User user) {
        // adding user to the userList
        this.users.add(user);
        // sorting all users according to their points
        users.sort(new UserPointComparator());
        // choosing user's league and add in it
        if (ruby.checkLeagueConditions(user, users)) ruby.addUserToTheLig(user);
        else if (sapphire.checkLeagueConditions(user, users)) sapphire.addUserToTheLig(user);
        else if (gold.checkLeagueConditions(user, users)) gold.addUserToTheLig(user);
        else if (silver.checkLeagueConditions(user, users)) silver.addUserToTheLig(user);
        else bronze.addUserToTheLig(user);
    }

}
