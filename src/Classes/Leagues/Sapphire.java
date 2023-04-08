package Classes.Leagues;

import AbstractClasses.ALeague;
import Classes.User;

public class Sapphire extends ALeague {


    public Sapphire() {
    }

    @Override
    protected boolean passesLeagueConditions(User user) {
        return false;
    }
}
