package Classes.Leagues;

import AbstractClasses.ALeague;
import Classes.User;

import java.util.ArrayList;
import java.util.Objects;

public class Gold extends ALeague {
    public Gold() {
    }

    @Override
    public void addUserToTheLig(User user) {
        super.addUserToTheLig(user);
    }

    @Override
    public boolean isUserInTop(User user, ArrayList<User> userList, int top) {
        return super.isUserInTop(user, userList, top);
    }

    @Override
    public boolean checkLeagueConditions(User user, ArrayList<User> userList) {
        return isUserInTop(user, userList, 10);
    }

    @Override
    public void displayTopUsers() {
        super.displayTopUsers();
    }
}
