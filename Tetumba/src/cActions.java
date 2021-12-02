import java.util.Scanner;
public class cActions {

    Scanner scanner = new Scanner(System.in);
    cActions(){

    }

     void possibleActions(){
         System.out.println("What would you like to do next?\n" +
                 "Inspect [1]\n" +
                 "Next Room [2]\n" +
                 "Previous Room [3]\n" +
                 "Rest [4]\n");
         int action = scanner.nextInt();

         switch(action){
             case 1 -> {
                 inspect();
                 tetumba.controller.possibleActions();
                 break;
             }
             case 2 -> {
                 nextRoom();
                 tetumba.controller.possibleActions();
                 break;
             }
             case 3 -> {
                previousRoom();
                tetumba.controller.possibleActions();
                break;
             }
             case 4 -> {
                rest();
                tetumba.controller.possibleActions();
                break;
             }
             default -> {
                 System.out.println("You have chosen an incorrect action. Please try again...");
                 possibleActions();
             }
         }
    }

    static void inspect(){
        RoomGeneration.peekStack().lookAround();
    }
    static void nextRoom(){
        RoomGeneration.peekStack().nextRoom();
    }
    static void previousRoom(){
        RoomGeneration.popStack();
    }
    static void rest(){

    }

}
