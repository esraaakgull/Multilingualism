package Classes.Leagues;

import AbstractClasses.ALeague;
import Classes.User;

public class Bronze extends ALeague {
    public Bronze() {
    }

    @Override
    public void addUserToTheLig(User user) {
        super.addUserToTheLig(user);
    }

    @Override
    protected boolean passesLeagueConditions(User user) {
        return false;
    }

}
