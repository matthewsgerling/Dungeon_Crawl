public class roomDoor {
    private roomLayout entrance;
    private roomLayout exit;

    public roomDoor(roomLayout entrance, roomLayout exit){
        this.entrance = entrance;
        this.exit = exit;
    }

    // Getter and setter methods
    public roomLayout getEntrance(){
        return entrance;
    }
    public roomLayout getExit(){
        return exit;
    }
    public void setExit(roomLayout newExit){
        exit = newExit;
    }
    public void setEntrance(roomLayout newEntrance){
        entrance = newEntrance;
    }



}
