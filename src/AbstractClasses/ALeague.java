package AbstractClasses;

import Classes.User;

public abstract class ALeague {
    int i;
    User[] userList;

    public void addUserToTheLig(User user) {
        userList[i] = user;
        i++;
    }

    public void removeUserFromTheLig(User user) {

    }

    public void displayTopUsers() {
    }


    public void checkLeagueConditions() {
    }
}
