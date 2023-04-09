package utils;

import Classes.User;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorter {
    public void sortArraylist(ArrayList<User> userArrayList){
        userArrayList.sort(Comparator.comparing(User::getPoints).reversed());
    }

    public void sortByProgression(ArrayList<User> userArrayList){
        userArrayList.sort(Comparator.comparing(User::getUnitProgression).reversed());
    }
}
