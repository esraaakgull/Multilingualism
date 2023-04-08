package Classes.Leagues;

import AbstractClasses.ALeague;
import Classes.User;

public class Gold extends ALeague {
    public Gold() {
    }


    @Override
    protected boolean passesLeagueConditions(User user) {
        return false;
    }
}
