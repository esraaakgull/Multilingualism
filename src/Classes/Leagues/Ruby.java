package Classes.Leagues;

import Classes.User;

import java.util.ArrayList;

public class Ruby extends ALeague {

    public Ruby() {
        super("Ruby");
    }
    @Override
    public boolean checkLeagueConditions(User user, ArrayList<User> userList) {
        return ((user.getPoints() > 5000 || user.getUnitProgression() >= 10) && user.getNumberOfDaysInStreak() > 30);
    }

}
