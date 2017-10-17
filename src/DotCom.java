import java.util.ArrayList; // library

class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) { // setter method
        locationCells = loc;
    }

    public void setName (String n) { // setter method
        name = n;
    }

    public String checkYourself(String userInput) {

        String result = "miss"; // variable to hold the result, default value is "miss"
        int index = locationCells.indexOf(userInput); // find out if the user guess is in the array by asking for its index. If not, indexOf returns -1.

        if (index >= 0) { // if index is greater than or equal to 0, the user guess is in the list - so remove it.
            locationCells.remove(index);

            if (locationCells.isEmpty()) { // if list is empty, then kill
                result = "kill";
                System.out.println("Ouch! You Sunk " + name + "  :( ");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
