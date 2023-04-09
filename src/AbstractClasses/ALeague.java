package AbstractClasses;

import Classes.User;

import java.util.ArrayList;
import java.util.Objects;

public abstract class ALeague {
    public ArrayList<User> userList;

    public void addUserToTheLig(User user) {
        userList.add(user);
        checkLeagueConditions(user, userList);
    }

    public boolean isUserInTop(User user, ArrayList<User> userList, int top) {
        for (int i = 0; i < top; i++) {
            if (Objects.equals(userList.get(i).getUsername(), user.getUsername())) return true;
        }
        return false;
    }

    public boolean checkLeagueConditions(User user, ArrayList<User> userList) {
        return false;
    }

    public void displayTopUsers() {
        for (int i = 0; i < 3; i++) {
            System.out.println(userList.get(i));
        }
    }
}
