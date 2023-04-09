package Classes.Leagues;

import AbstractClasses.ALeague;
import Classes.User;

import java.util.ArrayList;

public class Silver extends ALeague {

    public Silver() {
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
        return isUserInTop(user, userList, 15);
    }

    @Override
    public void displayTopUsers() {
        super.displayTopUsers();
    }
}
