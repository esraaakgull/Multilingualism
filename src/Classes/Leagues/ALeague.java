package Classes.Leagues;

import Classes.User;

import java.util.ArrayList;
import java.util.Objects;

public abstract class ALeague{

    private final String leagueName;

    public ArrayList<User> usersInLeague = new ArrayList<>();

    protected ALeague(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }


    public void addUserToTheLig(User user) {
        usersInLeague.add(user);
    }

    public abstract boolean checkLeagueConditions(User user, ArrayList<User> userList);

    public boolean isUserInTop(User user, ArrayList<User> userList, int top) {
        for (int i = 0; i < top; i++) {
            if (Objects.equals(userList.get(i).getUsername(), user.getUsername())) return true;
        }
        return false;
    }

    public String getTopUsers(int amount) {
        String returnedString = "";
        while (amount < usersInLeague.size()) {
            if (usersInLeague.get(amount).getPoints() == usersInLeague.get(amount + 1).getPoints()){
                amount += 1;
            } else {
                break;
            }
        }
        for (int i = 0; i < amount; i++) {
            if (i < usersInLeague.size()) return returnedString.concat((i+1) + ". "+ usersInLeague.get(i).getUsername());
        }
        return "No users in league " + getLeagueName();
    }
}
