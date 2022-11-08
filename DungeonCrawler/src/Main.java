import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    ArrayList<rewards> rewardsList = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Trying to throw together a filereader to grab the rewards and what they do. Might be unnecessary
        String rewardsFileName = "";
        File rewardsFile = new File(rewardsFileName);
        try{
            Scanner scanner = new Scanner(rewardsFile);
            while(scanner.hasNext()){
                String currLine = scanner.nextLine();
                char[] currLineAsArr = currLine.toCharArray();
                for(char c: currLineAsArr){
                    StringBuilder currWord = new StringBuilder();
                    if(c == '<'){
                        while(c != '>'){
                            currWord.append(c);
                        }
                    }


                }

            }
        }catch(Exception e){
            System.out.println("Error: FileNotFound: " + rewardsFileName);
        }



    }

    /**
     * Steps:
     * 1. Create a starting room
     * 2. decide rewards for room
     * 3. decide exit choices
     * 4. start combat
     * 5. finish combat
     * 6. reward player
     * 7. player chooses exit
     * 8. Repeat 1-7 with rewards decided based on exit choice
     * */

    roomLayout currRoom = null;

    public void start(){
        currRoom = new roomLayout();
        Random rng = new Random();
        int numOfDoors = rng.nextInt(1, 2)+1;
        currRoom.generateDoors(numOfDoors);
        for(int i = 0; i < numOfDoors; i++){


        }

    }



}