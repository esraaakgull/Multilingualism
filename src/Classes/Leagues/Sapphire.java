package Classes.Leagues;

import AbstractClasses.ALeague;
import Classes.User;

import java.util.ArrayList;
import java.util.Objects;

public class Sapphire extends ALeague {
    public Sapphire() {
    }


    @Override
    public boolean isUserInTop(User user, ArrayList<User> userList, int top) {
        return super.isUserInTop(user, userList, top);
    }

    @Override
    public void addUserToTheLig(User user) {
        super.addUserToTheLig(user);
    }

    @Override
    public boolean checkLeagueConditions(User user, ArrayList<User> userList) {
        return (user.getNumberOfDaysInStreak() > 7 && isUserInTop(user, userList, 5));
    }


    @Override
    public void displayTopUsers() {
        super.displayTopUsers();
    }
}
