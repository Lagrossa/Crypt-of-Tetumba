abstract class Room {
    //Variable declaration
    boolean roomClear = false;
    boolean beenHere = false;
    boolean altText = false;
    int killCount = 0;
    //Method Declaration

    //Room w/ No Enemies
    Room(boolean bHere, int karma, boolean rClear){
        this.roomClear = rClear;
        this.beenHere = bHere;

        if(!beenHere){
            newArrival();
        }
        else{
            secondaryText();
        }
    }
    //Room with Enemies
    Room(boolean bHere, int karma, int kCount, boolean rClear){
        this.roomClear = rClear;
        this.beenHere = bHere;
        this.killCount = kCount;

        if(!beenHere){
            newArrival();
        }
        else{
            secondaryText();
        }
    }

    protected void newArrival(){

    }

    protected void secondaryText(){

    }

    protected void altText(){

    }

    protected void lookAround(){

    }

    protected void roomData(){

    }
    protected void nextRoom(){

    }
    protected void nextRoom2(){

    }
    protected void hiddenRoom(){

    }
}
