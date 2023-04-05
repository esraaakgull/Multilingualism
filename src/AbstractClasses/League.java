package AbstractClasses;

import Classes.User;

public  abstract class League {
    User[] userList;

    public League(User[] userList) {
        this.userList = userList;
    }

    void checkConditions(){}
}
