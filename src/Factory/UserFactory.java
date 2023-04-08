package Factory;

import Classes.Language;
import Classes.User;

import java.util.ArrayList;


public class UserFactory implements IFactory<String[]>,ICollection<ArrayList<User>>{
    private final ArrayList<User> users = new ArrayList<>();

    @Override
    public void Generate(String[] userValues){
        User user = new User(userValues[0], userValues[1]);
        users.add(user);
    }

    // since this is an end-simulation, we made a function to randomly generate end-values;
//    private void RandomizeValues(){
//        int streak = this.generateNumberOfDaysInStreak();
//        Language langChoice = this.generateLangChoice();
//    }





    @Override
    public ArrayList<User> getCollection() {
        return this.users;
    }
}
