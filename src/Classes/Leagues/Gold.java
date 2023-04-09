package Classes.Leagues;

import Classes.User;

import java.util.ArrayList;

public class Gold extends ALeague {
    public Gold() {
        super("Gold");
    }

    @Override
    public boolean checkLeagueConditions(User user, ArrayList<User> userList) {
        return isUserInTop(user, userList, 10);
    }
}
