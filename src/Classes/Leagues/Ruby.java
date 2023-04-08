package Classes.Leagues;

import AbstractClasses.ALeague;
import Classes.User;

public class Ruby extends ALeague {

    @Override
    protected boolean passesLeagueConditions(User user) {
        return false;
    }


    public Ruby() {
    }
}
