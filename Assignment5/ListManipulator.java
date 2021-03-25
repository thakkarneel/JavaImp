import java.util.*;

public class ListManipulator {
    /*
    private ArrayList<Integer> myLst;
    private Boolean ascending;

    public ListManipulator(ArrayList<Integer> myLst, Boolean ascending) {
        this.myLst = myLst;
        this.ascending = ascending;
    }

     */


    public ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending) {
        if (ascending == true) {
            Collections.sort(myLst);
            return myLst;
        }
        Collections.sort(myLst, Collections.reverseOrder());
        return myLst;
    }

    public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < myLst.size(); i++) {
            if (myLst.get(i) > max) {
                max = myLst.get(i);
            }
            if (myLst.get(i) < min) {
                min = myLst.get(i);
            }
        }

        int indMin = myLst.indexOf(min);
        int indMax = myLst.indexOf(max);
        myLst.set(indMin, max);
        myLst.set(indMax, min);

        return myLst;

    }

    public void table(ArrayList<Integer> myLst) {
        HashMap<Integer, Integer> uni = new HashMap<>();

        for (int i = 0; i < myLst.size(); i++) {
            if (uni.get(myLst.get(i)) == null) {
                uni.put(myLst.get(i), 1);
            } else {
                uni.put(myLst.get(i), uni.get(myLst.get(i)) + 1);
            }
        }

        TreeMap<Integer, Integer> sorted = new TreeMap<>();

        // Copy all data from hashMap into TreeMap
        sorted.putAll(uni);

        // Display the TreeMap which is naturally sorted
        for (Map.Entry<Integer, Integer> entry : sorted.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }


}

