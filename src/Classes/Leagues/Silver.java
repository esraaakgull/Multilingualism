package Classes.Leagues;

import AbstractClasses.ALeague;
import Classes.User;

public class Silver extends ALeague {


    public Silver() {
    }

    @Override
    protected boolean passesLeagueConditions(User user) {
        return false;
    }
}
