package Classes.Leagues;

import Classes.User;

import java.util.ArrayList;

public class Sapphire extends ALeague {

    public Sapphire() {
        super("Sapphire");
    }

    @Override
    public boolean checkLeagueConditions(User user, ArrayList<User> userList) {
        return (user.getNumberOfDaysInStreak() >= 7 && isUserInTop(user, userList, 5));
    }

}
