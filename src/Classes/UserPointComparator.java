package Classes;

import java.util.Comparator;

public class UserPointComparator implements Comparator<User> {
    public int compare(User u1, User u2) {
        return u1.getPoint() - u2.getPoint();
    }
}