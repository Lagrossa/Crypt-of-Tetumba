import java.util.Stack;

public class RoomGeneration{

    private static Stack<Room> roomStack = new Stack<>();

    protected static void pushStack(Room room){
        roomStack.push(room);
    }
    protected static Room peekStack(){
        return roomStack.peek();
    }
    protected static void popStack(){
        roomStack.pop();
    }


    //ROOM GENERATION ==--==--==--==--==--==--==--==
    protected static Room room1 = new Room(false, Player.getKarma(),false){
        @Override
        protected void newArrival(){
            if(beenHere){
                secondaryText();
            }
            System.out.println("You find yourself awake in a cell. The bars seem to have been busted by some ungodly" +
                    " creature... \nHow did you get here?");
            beenHere = true;
        }
        @Override
        protected void secondaryText(){
            System.out.println("You return back to the cell, you probably shouldn't stay here for too long.");
        }
        @Override
        protected void altText(){
        }
        @Override
        protected void lookAround(){
            System.out.println("Nothing except chains and bars. You smell something putrid in this room though... Maybe it's you.");
        }
        @Override
        protected void nextRoom(){
            System.out.println("You go into the next room.");
            roomStack.push(room2);
        }
    };
    protected static Room room2 = new Room(false, Player.getKarma(),false){
        @Override
        protected void newArrival(){
            if(beenHere){
                secondaryText();
            }
            System.out.println("You exit the cell into a second room.");
            beenHere = true;
        }
        @Override
        protected void secondaryText(){
            System.out.println("You're back in this empty room. A chill goes down your spine, almost as if something were watching you...");
        }
        @Override
        protected void altText(){
        }
        @Override
        protected void lookAround(){
            System.out.println("There seems to be two adjacent exits to this room...");
        }
        @Override
        protected void nextRoom(){
            System.out.println("There are two exits to this room... Will you choose right[1] or left[2]?");
            int roomChoice = tetumba.genScan.nextInt();
            switch(roomChoice){
                case 1 -> {
                    roomStack.push(room3);
                    break;
                }
                case 2 ->{
                    roomStack.push(room4);
                    break;
                }
            }
        }
    };
    protected static Room room3 = new Room(false, Player.getKarma(),false){
        boolean grabbedKey = false;
        @Override
        protected void newArrival(){
            if(beenHere){
                secondaryText();
            }
            System.out.println("This room seems much smaller than the last two..");
            beenHere = true;
        }
        @Override
        protected void secondaryText(){
            System.out.println("This room seems smaller than when you visited it last time.");
        }
        @Override
        protected void altText(){
        }
        @Override
        protected void lookAround(){
            if(!grabbedKey){
                System.out.println("Atop a wooden table there seems to be a key... Will you grab it? (Yes[1], No[2])");
                int grabKey = tetumba.genScan.nextInt();
                if(grabKey==1){
                    Item key = new Item("key");
                    tetumba.inventory.add(key);
                    System.out.println("You grabbed the key.");
                    grabbedKey = true;
                }
                else{
                    System.out.println("You leave the key alone..");
                }
            } else if(grabbedKey){
                System.out.println("Just a wooden table. You already grabbed the key.");
            }
        }
        @Override
        protected void nextRoom(){
            System.out.println("This room only leads back...");

        }
    };
    protected static Room room4 = new Room(false, Player.getKarma(),false){
        @Override
        protected void newArrival(){
            if(beenHere){
                secondaryText();
            }
            System.out.println("A small room. What should you do?");
            beenHere = true;
        }
        @Override
        protected void secondaryText(){
            System.out.println("This room seems smaller than when you visited it last time.");
        }
        @Override
        protected void altText(){
        }
        @Override
        protected void lookAround(){
            System.out.println("You find a hidden passageway behind a painting. Go through? Yes[1], No[2]");
            int enterPassage = tetumba.genScan.nextInt();
            if(enterPassage==1){
                System.out.println("You entered the passageway..");
            }
            else{
                System.out.println("You decide not to enter..");
            }
        }
        @Override
        protected void nextRoom(){
            System.out.println("This room only leads back...");

        }
    };
}
