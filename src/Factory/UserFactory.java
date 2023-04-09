package Factory;

import Classes.User;

import java.util.ArrayList;
import java.util.HashMap;


public class UserFactory implements IFactory<User>, ICollection<HashMap<String, User>> {
    protected HashMap<String, User> users = new HashMap<>();

    @Override
    public void addToFactory(User userObj) {
//        User user = new User(userValues[0], userValues[1]);
        users.put(userObj.getUsername(),userObj);
    }

    // since this is an end-simulation, we made a function to randomly generate end-values;
//    private void RandomizeValues(){
//        int streak = this.generateNumberOfDaysInStreak();
//        Language langChoice = this.generateLangChoice();
//    }

    @Override
    public HashMap<String, User> getCollection() {
        return this.users;
    }
}
