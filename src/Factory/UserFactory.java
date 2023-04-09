package Factory;

import Classes.User;

import java.util.HashMap;


public class UserFactory implements IFactory<User>, ICollection<HashMap<String, User>> {
    protected HashMap<String, User> users = new HashMap<>();

    @Override
    public void addToFactory(User userObj) {
        users.put(userObj.getUsername(),userObj);
    }

    @Override
    public HashMap<String, User> getCollection() {
        return this.users;
    }
}
