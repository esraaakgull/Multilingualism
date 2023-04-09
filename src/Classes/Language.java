package Classes;

import Classes.Questions.IParentOf;

import java.util.ArrayList;
import java.util.HashMap;

public class Language implements IParentOf<Unit> {
    private final String name;
    //    private Integer i = 0;
    private ArrayList<Unit> units = new ArrayList<>();
    private HashMap<Integer, Integer> progressionTracker = new HashMap<>();
    private int totalQuizAmount;

    public Language(String name) {
        this.name = name;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

//    public void addUnit(Unit unit) {
//        this.units[i] = unit;
//        i++;
//    }

//    public void setUnits(ArrayList<Unit> unitsArr){
//        this.units = unitsArr.toArray(new Unit[0]);
//    }

    public String getName() {
        return this.name;
    }

    public int getTotalQuizAmount() {
        return this.totalQuizAmount;
    }

    public int getTotalUnitAmount() {
        return this.units.size();
    }

    @Override
    public void addChildToArray(Unit child) {
        this.units.add(child);
//        child.getNumberOfQuizzes();
        for (int i = 0; i < child.getNumberOfQuizzes(); i++) {
            progressionTracker.put(i, this.units.size() + 1);
        }
        this.totalQuizAmount += child.getNumberOfQuizzes();
    }

    public int findUnitProgression(int takenQuizAmount){
        return progressionTracker.get(takenQuizAmount);
    }
}
