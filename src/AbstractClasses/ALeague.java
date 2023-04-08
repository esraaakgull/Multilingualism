package AbstractClasses;

import Classes.User;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ALeague {
    ArrayList<User> userList;

    public void addUserToTheLig(User user) {
        userList.add(user);
    }

//    public void removeUserFromTheLig(User user) {
//
//    }

    public void displayTopUsers(int amount) {
        userList.sort(Comparator.comparing(User::getPoints));
        while (amount < userList.size()) {
            if (userList.get(amount).getPoints() == userList.get(amount + 1).getPoints()){
                amount += 1;
            } else {
                break;
            }
        }
        for (int i = 0; i < amount; i++) {
            if (i < userList.size()) System.out.println(userList.get(i));
        }
    }


    protected abstract boolean passesLeagueConditions(User user);
}
