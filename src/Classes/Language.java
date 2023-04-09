package Classes;

import Factory.ICollection;

import java.util.ArrayList;
import java.util.HashMap;

public class Language implements IParentOf<Unit>, ICollection<ArrayList<Unit>> {
    private final String name;
    //    private Integer i = 0;
    private ArrayList<Unit> units = new ArrayList<>();
    private HashMap<Integer, Integer> progressionTracker = new HashMap<>();
    private int totalQuizAmount;

    public Language(String name) {
        this.name = name;
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
        int prevLength = progressionTracker.size();
        for (int i = 0; i < child.getNumberOfQuizzes(); i++) {
            progressionTracker.put(prevLength+i, this.units.size() + 1);

        }
        this.totalQuizAmount += child.getNumberOfQuizzes();
    }

    public Integer findUnitProgression(int takenQuizAmount){
        return progressionTracker.get(takenQuizAmount);
    }

    @Override
    public ArrayList<Unit> getCollection() {
        return this.units;
    }
}
