import java.util.*;
public class roomLayout {
    ArrayList<roomDoor> doorList = new ArrayList<roomDoor>();

    public roomLayout(){

    }

    public void generateDoors(int numOfDoors){
        for(int i = 0; i < numOfDoors; i++){
            doorList.add(new roomDoor(this, null));
        }
    }

}
