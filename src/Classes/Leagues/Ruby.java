package Classes.Leagues;

import AbstractClasses.ALeague;
import Classes.User;
import Classes.UserPointComparator;

import java.util.ArrayList;

public class Ruby extends ALeague {

    public Ruby() {
    }

    @Override
    public void addUserToTheLig(User user) {
        super.addUserToTheLig(user);
        super.userList.sort(new UserPointComparator());
    }

    @Override
    public boolean checkLeagueConditions(User user, ArrayList<User> userList) {
        return (user.getPoint() > 5000 && user.getNumberOfDaysInStreak() > 30);
    }

    @Override
    public void displayTopUsers() {
        super.displayTopUsers();
    }
}
