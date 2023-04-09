package Classes.Leagues;

import Classes.User;

import java.util.ArrayList;

public class Silver extends ALeague {
    public Silver() {
        super("Silver");
    }

    @Override
    public boolean checkLeagueConditions(User user, ArrayList<User> userList) {
        return isUserInTop(user, userList, 15);
    }
}
