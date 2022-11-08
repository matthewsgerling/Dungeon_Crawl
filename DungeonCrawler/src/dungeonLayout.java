import java.util.*;
import java.io.*;

public class dungeonLayout {
    // Dungeon is a Binary Tree, where nodes have pointer to siblings as well as parent nodes.
    ArrayList<roomLayout> masterRoomList = new ArrayList<>();

    ArrayList<roomLayout> dungeonRooms = new ArrayList<>();
    public dungeonLayout(int numOfRooms){
        fillRoomList();

        ArrayList<roomLayout> activeRoomList = new ArrayList<>();
        for(roomLayout curr : masterRoomList)
            activeRoomList.add(curr);

        // Takes the number of rooms, generates a random dungeonLayout with the corresponding number.
        for (int i = 0; i < numOfRooms; i++){
            Random rng = new Random();
            dungeonRooms.add(activeRoomList.remove(rng.nextInt(activeRoomList.size())));



        }
    }

    private static void fillRoomList(){
        String filename = "";
        File file = new File(filename);
        try{
            Scanner scanner = new Scanner(file);
            // Read file for room layouts here to fill the list

        }catch(Exception e){
            System.out.println("File_Not_Found");
        }


    }

}
