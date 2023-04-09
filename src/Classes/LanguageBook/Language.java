package Classes.LanguageBook;

import Classes.Leagues.*;
import Classes.User;
import Factory.ICollection;
import utils.Sorter;
import java.util.ArrayList;
import java.util.HashMap;

public class Language implements IParentOf<Unit>, ICollection<ArrayList<Unit>> {
    private final String name;

    private HashMap<String, ALeague> leagues = new HashMap<>();
    private ArrayList<Unit> units = new ArrayList<>();
    private HashMap<Integer, Integer> progressionTracker = new HashMap<>();
    private int totalQuizAmount;
    public ArrayList<User> users = new ArrayList<>();

    public Language(String name) {
        this.name = name;
        this.leagues.put("Bronze", new Bronze());
        this.leagues.put("Silver", new Silver());
        this.leagues.put("Gold", new Gold());
        this.leagues.put("Sapphire", new Sapphire());
        this.leagues.put("Ruby", new Ruby());
    }

    public void sortLeagues(Sorter sorter) {
        sorter.sortArraylist(this.leagues.get("Bronze").usersInLeague);
        sorter.sortArraylist(this.leagues.get("Silver").usersInLeague);
        sorter.sortArraylist(this.leagues.get("Gold").usersInLeague);
        sorter.sortArraylist(this.leagues.get("Sapphire").usersInLeague);
        sorter.sortArraylist(this.leagues.get("Ruby").usersInLeague);
    }

    public void assignUsersToLeagues() {
        for (User user : users) {
            if (this.leagues.get("Ruby").checkLeagueConditions(user, users))
                this.leagues.get("Ruby").addUserToTheLig(user);
            else if (this.leagues.get("Sapphire").checkLeagueConditions(user, users))
                this.leagues.get("Sapphire").addUserToTheLig(user);
            else if (this.leagues.get("Gold").checkLeagueConditions(user, users))
                this.leagues.get("Gold").addUserToTheLig(user);
            else if (this.leagues.get("Silver").checkLeagueConditions(user, users))
                this.leagues.get("Silver").addUserToTheLig(user);
            else this.leagues.get("Bronze").addUserToTheLig(user);
        }
    }

    public User getUserWithMaxPoints() {
        return this.users.get(0);
    }

    public ALeague getLeague(String leagueName) throws Exception {
        if (this.leagues.get(leagueName) != null) {
            return this.leagues.get(leagueName);
        } else throw new Exception("League not found, check the query function.");
    }

    public ArrayList<User> getUserWithMaxProgression(Sorter sorter) {
        ArrayList<User> maxProgressedUsers = (ArrayList<User>) this.users.clone();
        sorter.sortByProgression(maxProgressedUsers);
        ArrayList<User> returnedArray = new ArrayList<>();

        int i = 0;
        while (true) {
            if (i > 0) {
                if (maxProgressedUsers.get(i).getUnitProgression() == maxProgressedUsers.get(i - 1).getUnitProgression()) {
                    returnedArray.add(maxProgressedUsers.get(i));
                } else {
                    break;
                }
            } else {
                returnedArray.add(maxProgressedUsers.get(i));

            }
            i++;
        }
        return returnedArray;

    }

    public String getName() {
        return this.name;
    }

    public int getTotalQuizAmount() {
        return this.totalQuizAmount;
    }

    public int getTotalUnitAmount() {
        return this.units.size();
    }

    @Override
    public void addChildToArray(Unit child) {
        this.units.add(child);
        int prevLength = progressionTracker.size();
        for (int i = 0; i < child.getNumberOfQuizzes(); i++) {
            progressionTracker.put(prevLength + i, this.units.size() + 1);
        }
        this.totalQuizAmount += child.getNumberOfQuizzes();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public Integer findUnitProgression(int takenQuizAmount) {
        return progressionTracker.get(takenQuizAmount);
    }

    @Override
    public ArrayList<Unit> getCollection() {
        return this.units;
    }
}
