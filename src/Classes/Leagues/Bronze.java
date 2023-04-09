package Classes.Leagues;

import Classes.User;

import java.util.ArrayList;

public class Bronze extends ALeague {
    public Bronze() {
        super("Bronze");
    }

    @Override
    public boolean checkLeagueConditions(User user, ArrayList<User> userList) {
        return true;
    }
}
